package org.wso2.carbon.eventprocessing.executiongenerator;

import org.apache.axis2.AxisFault;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.event.processor.core.EventProcessorService;
import org.wso2.carbon.event.processor.core.exception.ExecutionPlanConfigurationException;
import org.wso2.carbon.event.processor.core.exception.ExecutionPlanDependencyValidationException;
import org.wso2.carbon.eventprocessing.executiongenerator.internal.ds.ExecutionGeneratorValueHolder;
import org.wso2.carbon.eventprocessing.executiongenerator.internal.processing.*;
import org.wso2.carbon.core.AbstractAdmin;

/*
class that specifies the web services
 */
public class ExecutionGeneratorAdminService extends AbstractAdmin {

    private static final Log log = LogFactory.getLog(ExecutionGeneratorAdminService.class);
    private DomainInformation domainInformation;
    private ExecutionGenerator executionGenerator;

    /**
     * constructor
     */
    public ExecutionGeneratorAdminService() {
        domainInformation = new DomainInformation();
        executionGenerator = new ExecutionGenerator();
    }

    /**
     * return all available template domain information
     *
     * @return all template domain information
     * @throws AxisFault
     */
    public DomainInfoDTO[] getAllDomainInfoDTO() throws AxisFault {
        log.debug("getAllDomainInfoDTO");
        return domainInformation.getAllDomainInfo();
    }

/**
     * return details for a given template domain name
     *
     * @param domainName template domain name
     * @return template domain full details
     * @throws AxisFault
     */
    public String getTemplateDomain(String domainName) throws AxisFault {
        return domainInformation.getSpecificDomainInfo(domainName);
    }

    /**
     * deploy an execution plan
     *
     * @param executionPlanConfigurationXml execution plan xml content
     * @throws AxisFault
     */
    public void deployTemplateConfig(String executionPlanConfigurationXml) throws AxisFault {
        log.debug("deployTemplateConfig");
        log.debug("Template Wiring: " + executionPlanConfigurationXml);
        EventProcessorService eventProcessorService = ExecutionGeneratorValueHolder.getEventProcessorService();
        if (eventProcessorService != null) {
            try {
                Processing processConfig = new Processing();

                String executionPlan = processConfig.getExecutionPlan(executionPlanConfigurationXml);
                log.debug("Execution Plan: " + executionPlan);


                eventProcessorService.deployExecutionPlanConfiguration(executionPlan, getAxisConfig());
            } catch (ExecutionPlanConfigurationException e) {
                log.error(e.getMessage(), e);
                throw new AxisFault(e.getMessage(), e);
            } catch (ExecutionPlanDependencyValidationException e) {
                log.error(e.getMessage(), e);
                throw new AxisFault(e.getMessage(), e);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        } else {
            throw new AxisFault("EventProcessorService is not available for EventProcessorAdminService in runtime!");
        }

    }

    /**
     * return details of all the available template configurations
     *
     * @return array of DomainConfigInfoDTO
     * @throws AxisFault
     */
    public DomainConfigInfoDTO[] getAllDomainConfigInfoDTO() throws AxisFault {
        return executionGenerator.getAllTemplateConfig();
    }

    /**
     * get the content of a specified template configuration
     *
     * @param configName template configuration name
     * @return xml content of the template configuration as a string value
     */
    public String getDomainConfig(String configName) {
        return executionGenerator.getTemplateConfig(configName);
    }

    /**
     * delete a template configuration
     *
     * @param configName template configuration name
     * @throws AxisFault
     */
    public void deleteConfigInfo(String configName) throws AxisFault {
        executionGenerator.deleteTemplateConfig(configName);
    }
}
