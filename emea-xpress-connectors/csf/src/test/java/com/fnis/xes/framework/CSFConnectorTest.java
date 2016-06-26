package com.fnis.xes.framework;

import com.fis.ec.correspondence.core.commonclasses.eventdata.CorrespondenceDocument;
import com.fisglobal.xpress.CSFConnector;
import org.apache.commons.codec.binary.Base64;
import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * User: lc21878
 */
@Test(enabled = true)
@ContextConfiguration(locations = {"classpath:ifx2_spring_csf_test.xml", "classpath:xpress/ifx2_spring_http.xml"})
public class CSFConnectorTest extends AbstractTestNGSpringContextTests {

    @Resource(name = "CSFConnector")
    private CSFConnector csfConnector;

    @Test(priority = 1)
    public void testGenerateDocument() throws Exception {

        String csfRequest = "<FILE NAME=\"Atom\"><REC NAME=\"FileHeader\"><REC NAME=\"CorrespondenceHeader\">" +
                "<FLD NAME=\"CorrespondenceItemIdentifier\">1278</FLD><FLD NAME=\"RunDate\">20150721</FLD>" +
                "<FLD NAME=\"EventName\">P101002</FLD><REC NAME=\"CustomerHeader\"><REC NAME=\"FullName\"><FLD NAME=\"Prefix\">Mr</FLD>" +
                "<FLD NAME=\"FirstName\">Sweetietwit</FLD><FLD NAME=\"Surname\">Doltpookie</FLD></REC><REC NAME=\"CustomerPropertyHeader\">" +
                "<FLD NAME=\"SpecialNeed\">N</FLD></REC></REC><REC NAME=\"CorrespondenceAddressHeader\"><FLD NAME=\"AddressType\">ADDR</FLD>" +
                "<FLD NAME=\"HouseName\">van tyull v serooskerkenweg 66</FLD><FLD NAME=\"StreetName\" /><FLD NAME=\"AddressLine2\" />" +
                "<FLD NAME=\"AddressLine3\" /><FLD NAME=\"StateProv\">Netherlands</FLD><FLD NAME=\"City\">Amsterdam</FLD>" +
                "<FLD NAME=\"CountyDistrict\" /><FLD NAME=\"PostalCode\">1076 JN</FLD><FLD NAME=\"StateProv\">Noord Holland</FLD><FLD NAME=\"CountryCode\">NL</FLD><FLD NAME=\"LogicalAddressType\">MOBP</FLD><FLD NAME=\"LogicalAddressValue\">654907263</FLD></REC><REC NAME=\"ProfileData\"><FLD NAME=\"event\">P101002</FLD><FLD NAME=\"cid\">1000</FLD><FLD NAME=\"acn\">1</FLD><FLD NAME=\"ProductName\">ATOM Saving</FLD><FLD NAME=\"DepositedAmount\">500</FLD><FLD NAME=\"Nameofaccount\">ATOM Saving</FLD><FLD NAME=\"Noticeperiodinhours\">3</FLD><FLD NAME=\"Total balance over max. customer balance\">1000</FLD><FLD NAME=\"Total balance over max. product balance\">500</FLD><FLD NAME=\"OriginatingBank\">RBS</FLD><FLD NAME=\"Target bank\">RBS</FLD><FLD NAME=\"Second account-holder’s FirstName\">Tim</FLD><FLD NAME=\"Days until the joint a. code disabled\">1</FLD><FLD NAME=\"Hyperlink\">Hyperlink</FLD></REC></REC></REC></FILE>";


        //CorrespondenceDocument correspondenceDocument = csfConnector.generateDocument(csfRequest, "SampleStmt");
        //CorrespondenceDocument correspondenceDocument = csfConnector.generateDocument(csfRequest, "Harrods_Letter_Template");
        CorrespondenceDocument correspondenceDocument = csfConnector.generateDocument(csfRequest, "Atom_EMAIL");
        //CorrespondenceDocument correspondenceDocument = csfConnector.generateDocument(csfRequest, "Atom_EMAIL");
        Assert.assertNotNull(correspondenceDocument.getDocumentData());
        Assert.assertTrue(correspondenceDocument.getDocumentData().length > 0);
        OutputStream out = new FileOutputStream(correspondenceDocument.getDocumentName());
        out.write(Base64.decodeBase64(correspondenceDocument.getDocumentData()));
        out.close();
    }
}