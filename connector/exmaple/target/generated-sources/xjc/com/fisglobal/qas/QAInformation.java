//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.04 at 05:23:15 PM CET 
//


package com.fisglobal.qas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QAInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QAInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StateTransition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreditsUsed" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QAInformation", propOrder = {
    "stateTransition",
    "creditsUsed"
})
public class QAInformation {

    @XmlElement(name = "StateTransition", required = true)
    protected String stateTransition;
    @XmlElement(name = "CreditsUsed")
    protected long creditsUsed;

    /**
     * Gets the value of the stateTransition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTransition() {
        return stateTransition;
    }

    /**
     * Sets the value of the stateTransition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTransition(String value) {
        this.stateTransition = value;
    }

    /**
     * Gets the value of the creditsUsed property.
     * 
     */
    public long getCreditsUsed() {
        return creditsUsed;
    }

    /**
     * Sets the value of the creditsUsed property.
     * 
     */
    public void setCreditsUsed(long value) {
        this.creditsUsed = value;
    }

}
