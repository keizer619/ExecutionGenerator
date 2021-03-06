//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 10:03:43 PM IST 
//


package org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.executionplan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executionPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executionPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="siddhiConfiguration" type="{}siddhiConfiguration"/>
 *         &lt;element name="importedStreams" type="{}importedStreams"/>
 *         &lt;element name="queryExpressions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exportedStreams" type="{}exportedStreams"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statistics" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="xmlns" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executionPlan", propOrder = {
    "description",
    "siddhiConfiguration",
    "importedStreams",
    "queryExpressions",
    "exportedStreams"
})
public class ExecutionPlan {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected SiddhiConfiguration siddhiConfiguration;
    @XmlElement(required = true)
    protected ImportedStreams importedStreams;
    @XmlElement(required = true)
    protected String queryExpressions;
    @XmlElement(required = true)
    protected ExportedStreams exportedStreams;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "statistics", required = true)
    protected String statistics;
    @XmlAttribute(name = "trace", required = true)
    protected String trace;
    @XmlAttribute(name = "xmlns", required = true)
    protected String xmlns;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the siddhiConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link SiddhiConfiguration }
     *     
     */
    public SiddhiConfiguration getSiddhiConfiguration() {
        return siddhiConfiguration;
    }

    /**
     * Sets the value of the siddhiConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiddhiConfiguration }
     *     
     */
    public void setSiddhiConfiguration(SiddhiConfiguration value) {
        this.siddhiConfiguration = value;
    }

    /**
     * Gets the value of the importedStreams property.
     * 
     * @return
     *     possible object is
     *     {@link ImportedStreams }
     *     
     */
    public ImportedStreams getImportedStreams() {
        return importedStreams;
    }

    /**
     * Sets the value of the importedStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportedStreams }
     *     
     */
    public void setImportedStreams(ImportedStreams value) {
        this.importedStreams = value;
    }

    /**
     * Gets the value of the queryExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryExpressions() {
        return queryExpressions;
    }

    /**
     * Sets the value of the queryExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryExpressions(String value) {
        this.queryExpressions = value;
    }

    /**
     * Gets the value of the exportedStreams property.
     * 
     * @return
     *     possible object is
     *     {@link ExportedStreams }
     *     
     */
    public ExportedStreams getExportedStreams() {
        return exportedStreams;
    }

    /**
     * Sets the value of the exportedStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportedStreams }
     *     
     */
    public void setExportedStreams(ExportedStreams value) {
        this.exportedStreams = value;
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

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatistics(String value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrace() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrace(String value) {
        this.trace = value;
    }
    /**
     * Gets the value of the xmlns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlns() {
        return xmlns;
    }

    /**
     * Sets the value of the xmlns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlns(String value) {
        this.xmlns = value;
    }

}
