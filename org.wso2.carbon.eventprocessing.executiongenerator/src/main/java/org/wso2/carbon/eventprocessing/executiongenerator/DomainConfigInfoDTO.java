package org.wso2.carbon.eventprocessing.executiongenerator;

/**
 * represent template configuration information
 */
public class DomainConfigInfoDTO {

    private String name;
    private String type;
    private String description;

    /**
     * constructor
     *
     * @param name        template configuration name
     * @param type        template configuration type
     * @param description template configuration description
     */
    public DomainConfigInfoDTO(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    /**
     * get template configuration name
     *
     * @return template configuration name
     */
    public String getName() {
        return name;
    }

    /**
     * set template configuration name
     *
     * @param name template configuration name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get template configuration description
     *
     * @return template configuration description
     */
    public String getDescription() {
        return description;
    }

    /**
     * set template configuration description
     *
     * @param description template configuration description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get template configuration type
     *
     * @return template configuration type
     */
    public String getType() {
        return type;
    }

    /**
     * set template configuration type
     *
     * @param type template configuration type
     */
    public void setType(String type) {
        this.type = type;
    }
}
