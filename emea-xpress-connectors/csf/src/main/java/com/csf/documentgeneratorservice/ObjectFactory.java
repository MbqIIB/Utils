//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 02:27:23 PM CEST 
//


package com.csf.documentgeneratorservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.csf.documentgeneratorservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddDesignNameResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "addDesignNameResponse");
    private final static QName _GetImageRequest_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "GetImageRequest");
    private final static QName _GetImageResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "GetImageResponse");
    private final static QName _RefreshDesignNameRequest_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "refreshDesignNameRequest");
    private final static QName _StartupRequest_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "startupRequest");
    private final static QName _PublishDocumentsRequest_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "PublishDocumentsRequest");
    private final static QName _GetVersionRequest_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "GetVersionRequest");
    private final static QName _GenerateDocumentRequest_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "GenerateDocumentRequest");
    private final static QName _PublishDocumentsResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "PublishDocumentsResponse");
    private final static QName _RefreshDesignNameResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "refreshDesignNameResponse");
    private final static QName _GenerateDocumentResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "GenerateDocumentResponse");
    private final static QName _RemoveDesignNameResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "removeDesignNameResponse");
    private final static QName _AddDesignNameRequest_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "addDesignNameRequest");
    private final static QName _RemoveDesignNameRequest_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "removeDesignNameRequest");
    private final static QName _ShutdownResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "shutdownResponse");
    private final static QName _StartupResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "startupResponse");
    private final static QName _GetVersionResponse_QNAME = new QName("http://csf.com/DocumentGeneratorService/", "GetVersionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.csf.documentgeneratorservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentGenerationRequest }
     * 
     */
    public DocumentGenerationRequest createDocumentGenerationRequest() {
        return new DocumentGenerationRequest();
    }

    /**
     * Create an instance of {@link DocumentGenerationResponse }
     * 
     */
    public DocumentGenerationResponse createDocumentGenerationResponse() {
        return new DocumentGenerationResponse();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link DocumentGenerationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csf.com/DocumentGeneratorService/", name = "GenerateDocumentResponse")
    public JAXBElement<DocumentGenerationResponse> createGenerateDocumentResponse(DocumentGenerationResponse value) {
        return new JAXBElement<DocumentGenerationResponse>(_GenerateDocumentResponse_QNAME, DocumentGenerationResponse.class, null, value);
    }
}