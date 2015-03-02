<%@ page import="org.apache.axis2.context.ConfigurationContext" %>
<%@ page import="org.wso2.carbon.CarbonConstants" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIUtil" %>
<%@ page import="org.wso2.carbon.utils.ServerConstants" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIMessage" %>
<%@ page import="org.wso2.carbon.eventprocessing.executiongenerator.ExecutionGeneratorClient" %>
<%@ page import="org.wso2.carbon.eventprocessing.executiongenerator.xsd.DomainConfigInfoDTO" %>
<%@ page import="org.wso2.carbon.eventprocessing.executiongenerator.xsd.DomainInfoDTO" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://wso2.org/projects/carbon/taglibs/carbontags.jar" prefix="carbon" %>
<%
        String serverURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        ConfigurationContext configContext =
                (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
        String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

        ExecutionGeneratorClient client;
        DomainInfoDTO[] students;

        try {
            client = new ExecutionGeneratorClient(configContext, serverURL, cookie);
            students = client.getAllDomainInfoDTO();
        } catch (Exception e) {
            CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request, e);
%>
            <script type="text/javascript">
                   location.href = "../admin/error.jsp";
            </script>
<%
            return;
    }
%>

<div id="middle">
    <h2>Execution Generator Management</h2>

    <div id="workArea">
        <table class="styledLeft" id="moduleTable">
                <thead>
                <tr>
                    <th width="20%">ID</th>
                    <th width="40%">First Name</th>
                    <th width="40%">Last Name</th>
                </tr>
                </thead>
                <tbody>
           <%
                   for(DomainInfoDTO student:students){
           %>
                   <tr>
                       <td><%=student.getName()%></td>
                    <td><%=student.getDescription()%></td>
                </tr>
           <%
                   }
           %>
                </tbody>
         </table>
    </div>
</div>