package org.wso2.carbon.eventprocessing.executiongenerator.internal.processing;

/**
 * DirectParam class keeps name and replaced value about the direct parameters that is mapped directly
 * with the query expressions,
 */
public class DirectParam {

    private String name;
    private String value;

    /**
     * get name
     *
     * @return direct parameter name
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name direct parameter name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get value
     *
     * @return direct parameter value
     */
    public String getValue() {
        return value;
    }

    /**
     * set value
     *
     * @param value direct parameter value
     */
    public void setValue(String value) {
        this.value = value;
    }

}