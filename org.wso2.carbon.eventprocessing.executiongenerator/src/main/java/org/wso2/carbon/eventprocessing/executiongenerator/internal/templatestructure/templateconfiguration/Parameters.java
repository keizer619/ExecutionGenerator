//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 02:23:40 PM IST 
//


package org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectParemeter" type="{}DirectParameter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameters", propOrder = {
    "directParameter"
})
public class Parameters {

    @XmlElement(name = "DirectParameter", required = true)
    protected List<DirectParameter> directParameter;

    /**
     * Gets the value of the directParemeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directParemeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectParemeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectParameter }
     * 
     * 
     */
    public List<DirectParameter> getDirectParemeter() {
        if (directParameter == null) {
            directParameter = new ArrayList<DirectParameter>();
        }
        return this.directParameter;
    }

	public List<DirectParameter> getDirectParameter() {
		return directParameter;
	}

	public void setDirectParameter(List<DirectParameter> directParameter) {
		this.directParameter = directParameter;
	}
    
}
