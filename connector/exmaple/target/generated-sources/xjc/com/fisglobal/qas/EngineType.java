//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.04 at 05:23:15 PM CET 
//


package com.fisglobal.qas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Timeout : The time out period in milliseconds
 * 
 * <p>Java class for EngineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngineType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.qas.com/OnDemand-2011-03&gt;EngineEnumType"&gt;
 *       &lt;attribute name="Flatten" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Intensity" type="{http://www.qas.com/OnDemand-2011-03}EngineIntensityType" /&gt;
 *       &lt;attribute name="PromptSet" type="{http://www.qas.com/OnDemand-2011-03}PromptSetType" /&gt;
 *       &lt;attribute name="Threshold" type="{http://www.qas.com/OnDemand-2011-03}ThresholdType" /&gt;
 *       &lt;attribute name="Timeout" type="{http://www.qas.com/OnDemand-2011-03}TimeoutType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineType", propOrder = {
    "value"
})
public class EngineType {

    @XmlValue
    protected EngineEnumType value;
    @XmlAttribute(name = "Flatten")
    protected Boolean flatten;
    @XmlAttribute(name = "Intensity")
    protected EngineIntensityType intensity;
    @XmlAttribute(name = "PromptSet")
    protected PromptSetType promptSet;
    @XmlAttribute(name = "Threshold")
    protected Integer threshold;
    @XmlAttribute(name = "Timeout")
    protected Integer timeout;

    /**
     * The available engines
     * 
     * @return
     *     possible object is
     *     {@link EngineEnumType }
     *     
     */
    public EngineEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineEnumType }
     *     
     */
    public void setValue(EngineEnumType value) {
        this.value = value;
    }

    /**
     * Gets the value of the flatten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlatten() {
        return flatten;
    }

    /**
     * Sets the value of the flatten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlatten(Boolean value) {
        this.flatten = value;
    }

    /**
     * Gets the value of the intensity property.
     * 
     * @return
     *     possible object is
     *     {@link EngineIntensityType }
     *     
     */
    public EngineIntensityType getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineIntensityType }
     *     
     */
    public void setIntensity(EngineIntensityType value) {
        this.intensity = value;
    }

    /**
     * Gets the value of the promptSet property.
     * 
     * @return
     *     possible object is
     *     {@link PromptSetType }
     *     
     */
    public PromptSetType getPromptSet() {
        return promptSet;
    }

    /**
     * Sets the value of the promptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptSetType }
     *     
     */
    public void setPromptSet(PromptSetType value) {
        this.promptSet = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshold(Integer value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

}
