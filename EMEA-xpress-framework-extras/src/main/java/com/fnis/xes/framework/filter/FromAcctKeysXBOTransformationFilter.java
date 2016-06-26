package com.fnis.xes.framework.filter;

import com.fnf.jef.boc.RequestMessage;
import com.fnf.jef.boc.ResponseMessage;
import com.fnf.xes.framework.ServiceException;
import com.fnis.ifx.xbo.v1_1.Payload;
import com.fnis.xes.framework.errorhandlers.ErrorHandler;
import com.fnis.xes.framework.ext.processxbo.subject.xbo.XBOTransformSubject;
import com.fnis.xes.framework.filter.converters.*;
import org.apache.log4j.Logger;

public class FromAcctKeysXBOTransformationFilter extends GenericXBOTransformationFilter {
    private static final Logger log = Logger.getLogger(FromAcctKeysXBOTransformationFilter.class);
    private AcctKeysFormatType defaultResponseAcctKeysFormat;

    public void setDefaultResponseAcctKeysFormat(AcctKeysFormatType defaultResponseAcctKeysFormat) {
        this.defaultResponseAcctKeysFormat = defaultResponseAcctKeysFormat;
    }

    public AcctKeysFormatType getDefaultResponseAcctKeysFormat() {
        return defaultResponseAcctKeysFormat;
    }

    @Override
    protected Object handleRequest(RequestMessage rq, Object passedCtx) throws ServiceException {
        FromAcctKeysConversionContext ctx = new FromAcctKeysConversionContext();
        ctx.setMessageType(ContextMessageType.REQUEST);

        XBOTransformSubject transformSubject;

        Object obj = rq.getObject();

        log.debug("Received request object payload: " + obj.getClass().getName());

        if (rq.getObject() instanceof Payload) {
            log.debug("Preparing to transform: " + obj.getClass().getName());
            try {
                transformSubject = new XBOTransformSubject((Payload) rq.getObject(), ctx);
                log.debug("Preparing to transform: " + transformSubject);
                log.debug("Processing with transformer: " + getRqTransformer());
                getRqTransformer().transform(transformSubject);
            } catch (ExternalLookupException e) {
                // Ignore silently as it will continue to adapter with SORTCODE-ACCTNO format
                // It is a valid scenarion in transfer from internal to external account
            } catch (Exception e) {
                for (ErrorHandler<Exception,ServiceException> eh : getErrorHandlers()) {
                    eh.handle(e,rq);
                }
            }
        } else {
            log.debug("Skipping object " + obj.getClass());
        }

        return ctx;
    }

    @Override
    protected Object handleResponse(ResponseMessage rs, Object passedCtx) throws ServiceException {
        XBOTransformSubject transformSubject;
        FromAcctKeysConversionContext ctx = (FromAcctKeysConversionContext) passedCtx;

        setDefaultIncomingFromAcctKeysFormatIfNotDefined(ctx);

        ctx.setMessageType(ContextMessageType.RESPONSE);

        log.debug("Received response object payload: " + rs.getObject().getClass().getName());

        if (rs.getObject() instanceof Payload) {
            try {
                transformSubject = new XBOTransformSubject((Payload) rs.getObject(), ctx);
                getRsTransformer().transform(transformSubject);
            } catch (Exception e) {
                for (ErrorHandler<Exception,ServiceException> eh : getErrorHandlers()) {
                    eh.handle(e,rs);
                }
            }
        }

        return ctx;
    }

    private void setDefaultIncomingFromAcctKeysFormatIfNotDefined(FromAcctKeysConversionContext ctx) {
        if(ctx.getIncomingAcctKeysFormat() == null)
            ctx.setIncomingAcctKeysFormat(defaultResponseAcctKeysFormat);
    }

}