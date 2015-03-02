
/**
 * ExecutionGeneratorAdminServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.eventprocessing.executiongenerator.stub;

    /**
     *  ExecutionGeneratorAdminServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ExecutionGeneratorAdminServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ExecutionGeneratorAdminServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ExecutionGeneratorAdminServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getAllDomainInfoDTO method
            * override this method for handling normal response from getAllDomainInfoDTO operation
            */
           public void receiveResultgetAllDomainInfoDTO(
                    org.wso2.carbon.eventprocessing.executiongenerator.xsd.DomainInfoDTO[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllDomainInfoDTO operation
           */
            public void receiveErrorgetAllDomainInfoDTO(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTemplateDomain method
            * override this method for handling normal response from getTemplateDomain operation
            */
           public void receiveResultgetTemplateDomain(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTemplateDomain operation
           */
            public void receiveErrorgetTemplateDomain(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllDomainConfigInfoDTO method
            * override this method for handling normal response from getAllDomainConfigInfoDTO operation
            */
           public void receiveResultgetAllDomainConfigInfoDTO(
                    org.wso2.carbon.eventprocessing.executiongenerator.xsd.DomainConfigInfoDTO[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllDomainConfigInfoDTO operation
           */
            public void receiveErrorgetAllDomainConfigInfoDTO(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getDomainConfig method
            * override this method for handling normal response from getDomainConfig operation
            */
           public void receiveResultgetDomainConfig(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDomainConfig operation
           */
            public void receiveErrorgetDomainConfig(java.lang.Exception e) {
            }
                


    }
    