package org.wso2.carbon.eventprocessing.executiongenerator;

/**
 * Represent template domain information
 */
public class DomainInfoDTO {

    private String name;
    private String description;

    /**
     * constructor
     */
    public DomainInfoDTO() {
    }

    /**
     * constructor
     * @param name domain name
     * @param description  domain description
     */
    public DomainInfoDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * give template domain name
     *
     * @return template domain name
     */
    public String getName() {
        return name;
    }

    /**
     * set template domain name
     *
     * @param name template domain name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set template domain description
     *
     * @param description template domain description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get template domain description
     * @return template domain description
     */
    public String getDescription() {
        return description;
    }
}
