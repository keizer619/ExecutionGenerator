package org.wso2.carbon.eventprocessing.executiongenerator.internal.processing;

import org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.templateconfiguration.Template;

/*
  This class is used to keep information about template and its query listed in the configuration xml that
  is exchanged between frontend and backend
 */
public class WiredTemplates {

    private Template template;
    private String templateQuery;

    /**
     * constructor
     */
    public WiredTemplates() {
    }

    /**
     * constructor
     *
     * @param template      Template object
     * @param templateQuery template query
     */
    public WiredTemplates(Template template, String templateQuery) {
        this.template = template;
        this.templateQuery = templateQuery;
    }

    /**
     * get template object
     *
     * @return template object
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * get template query
     *
     * @return template query
     */
    public String getTemplateQuery() {
        return templateQuery;
    }

    /**
     * set template object
     *
     * @param template template object
     */
    public void setTemplate(Template template) {
        this.template = template;
    }

    /**
     * set template object
     *
     * @param templateQuery template object
     */
    public void setTemplateQuery(String templateQuery) {
        this.templateQuery = templateQuery;
    }
}