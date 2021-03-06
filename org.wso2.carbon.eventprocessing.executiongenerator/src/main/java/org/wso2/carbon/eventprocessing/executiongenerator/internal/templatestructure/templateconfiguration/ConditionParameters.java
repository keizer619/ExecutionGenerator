//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.20 at 09:56:36 AM IST 
//


package org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration;

import org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration.parameter.AND;
import org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration.parameter.OR;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameter" type="{}Parameter"/>
 *         &lt;element name="OR" type="{}OR"/>
 *         &lt;element name="AND" type="{}AND"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionParameters", propOrder = {
    "parameter",
    "or",
    "and"
})
public class ConditionParameters {

    @XmlElement(name = "Parameter", required = true)
    protected Parameter parameter;
    @XmlElement(name = "OR", required = true)
    protected OR or;
    @XmlElement(name = "AND", required = true)
    protected AND and;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link Parameter }
     *     
     */
    public Parameter getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter }
     *     
     */
    public void setParameter(Parameter value) {
        this.parameter = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration.parameter.OR }
     *     
     */
    public OR getOR() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration.parameter.OR }
     *     
     */
    public void setOR(OR value) {
        this.or = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration.parameter.AND }
     *     
     */
    public AND getAND() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration.parameter.AND }
     *     
     */
    public void setAND(AND value) {
        this.and = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
