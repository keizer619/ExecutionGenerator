

/**
 * ExecutionGeneratorAdminService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.eventprocessing.executiongenerator.stub;

    /*
     *  ExecutionGeneratorAdminService java interface
     */

    public interface ExecutionGeneratorAdminService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getAllDomainInfoDTO4
                
         */

         
                     public org.wso2.carbon.eventprocessing.executiongenerator.xsd.DomainInfoDTO[] getAllDomainInfoDTO(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllDomainInfoDTO4
            
          */
        public void startgetAllDomainInfoDTO(

            

            final org.wso2.carbon.eventprocessing.executiongenerator.stub.ExecutionGeneratorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getTemplateDomain7
                
         */

         
                     public java.lang.String getTemplateDomain(

                        java.lang.String domainName8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getTemplateDomain7
            
          */
        public void startgetTemplateDomain(

            java.lang.String domainName8,

            final org.wso2.carbon.eventprocessing.executiongenerator.stub.ExecutionGeneratorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllDomainConfigInfoDTO11
                
         */

         
                     public org.wso2.carbon.eventprocessing.executiongenerator.xsd.DomainConfigInfoDTO[] getAllDomainConfigInfoDTO(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllDomainConfigInfoDTO11
            
          */
        public void startgetAllDomainConfigInfoDTO(

            

            final org.wso2.carbon.eventprocessing.executiongenerator.stub.ExecutionGeneratorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  deleteConfigInfo(
         java.lang.String configName15

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  deployTemplateConfig(
         java.lang.String executionPlanConfigurationXml17

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDomainConfig18
                
         */

         
                     public java.lang.String getDomainConfig(

                        java.lang.String configName19)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getDomainConfig18
            
          */
        public void startgetDomainConfig(

            java.lang.String configName19,

            final org.wso2.carbon.eventprocessing.executiongenerator.stub.ExecutionGeneratorAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    