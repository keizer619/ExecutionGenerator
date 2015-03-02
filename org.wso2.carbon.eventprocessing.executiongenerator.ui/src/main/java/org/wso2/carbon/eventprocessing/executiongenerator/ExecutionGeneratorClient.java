package org.wso2.carbon.eventprocessing.executiongenerator;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.eventprocessing.executiongenerator.stub.ExecutionGeneratorAdminServiceStub;
import org.wso2.carbon.eventprocessing.executiongenerator.xsd.DomainConfigInfoDTO;
import org.wso2.carbon.eventprocessing.executiongenerator.xsd.DomainInfoDTO;

import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: prabushi
 * Date: 2/2/15
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class ExecutionGeneratorClient {
    private  ExecutionGeneratorAdminServiceStub stub;

    public ExecutionGeneratorClient(ConfigurationContext configCtx, String backendServerURL, String cookie) throws AxisFault {
        String serviceURL = backendServerURL + "ExecutionGeneratorAdminService";
        stub = new ExecutionGeneratorAdminServiceStub(configCtx, serviceURL);
        ServiceClient client = stub._getServiceClient();
        Options options = client.getOptions();
        options.setManageSession(true);
        options.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING, cookie);
    }

    public   String getTemplateDomain(String domainName) throws RemoteException {
       return  stub.getTemplateDomain(domainName)  ;
    }

    public DomainInfoDTO[] getAllDomainInfoDTO() throws RemoteException {
        return stub.getAllDomainInfoDTO();
    }

    public void deployTemplateConfig(String executionPlanConfigurationXml) throws RemoteException {
        stub.deployTemplateConfig(executionPlanConfigurationXml);
    }

    public DomainConfigInfoDTO[] getAllDomainConfigInfoDTO() throws RemoteException {
        return stub.getAllDomainConfigInfoDTO();
    }

    public String getDomainConfig(String configName) throws RemoteException {
        return stub.getDomainConfig(configName);
    }

    public  void deleteConfigInfo(String configName) throws RemoteException {
        stub.deleteConfigInfo(configName);
    }
}
