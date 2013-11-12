

/**
 * EUtilsServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package gov.nih.nlm.ncbi.www.soap.eutils;

    /*
     *  EUtilsServiceTest Junit test case
    */

    public class EUtilsServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testrun_eSearch() throws java.lang.Exception{

        gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub =
                    new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();//the default implementation should point to the right endpoint

           gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument eSearchRequest28=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.class);
                    // TODO : Fill in the eSearchRequest28 here
                
                        assertNotNull(stub.run_eSearch(
                        eSearchRequest28));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrun_eSearch() throws java.lang.Exception{
            gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub = new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();
             gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument eSearchRequest28=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.class);
                    // TODO : Fill in the eSearchRequest28 here
                

                stub.startrun_eSearch(
                         eSearchRequest28,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultrun_eSearch(
                         gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument result
                            ) {
                
            }

            public void receiveErrorrun_eSearch(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testrun_eLink() throws java.lang.Exception{

        gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub =
                    new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();//the default implementation should point to the right endpoint

           gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument eLinkRequest30=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.class);
                    // TODO : Fill in the eLinkRequest30 here
                
                        assertNotNull(stub.run_eLink(
                        eLinkRequest30));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrun_eLink() throws java.lang.Exception{
            gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub = new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();
             gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument eLinkRequest30=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.class);
                    // TODO : Fill in the eLinkRequest30 here
                

                stub.startrun_eLink(
                         eLinkRequest30,
                    new tempCallbackN65589()
                );
              


        }

        private class tempCallbackN65589  extends gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler{
            public tempCallbackN65589(){ super(null);}

            public void receiveResultrun_eLink(
                         gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument result
                            ) {
                
            }

            public void receiveErrorrun_eLink(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testrun_eInfo() throws java.lang.Exception{

        gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub =
                    new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();//the default implementation should point to the right endpoint

           gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument eInfoRequest32=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.class);
                    // TODO : Fill in the eInfoRequest32 here
                
                        assertNotNull(stub.run_eInfo(
                        eInfoRequest32));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrun_eInfo() throws java.lang.Exception{
            gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub = new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();
             gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument eInfoRequest32=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.class);
                    // TODO : Fill in the eInfoRequest32 here
                

                stub.startrun_eInfo(
                         eInfoRequest32,
                    new tempCallbackN65630()
                );
              


        }

        private class tempCallbackN65630  extends gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler{
            public tempCallbackN65630(){ super(null);}

            public void receiveResultrun_eInfo(
                         gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument result
                            ) {
                
            }

            public void receiveErrorrun_eInfo(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testrun_eSpell() throws java.lang.Exception{

        gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub =
                    new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();//the default implementation should point to the right endpoint

           gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument eSpellRequest34=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.class);
                    // TODO : Fill in the eSpellRequest34 here
                
                        assertNotNull(stub.run_eSpell(
                        eSpellRequest34));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrun_eSpell() throws java.lang.Exception{
            gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub = new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();
             gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument eSpellRequest34=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.class);
                    // TODO : Fill in the eSpellRequest34 here
                

                stub.startrun_eSpell(
                         eSpellRequest34,
                    new tempCallbackN65671()
                );
              


        }

        private class tempCallbackN65671  extends gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler{
            public tempCallbackN65671(){ super(null);}

            public void receiveResultrun_eSpell(
                         gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument result
                            ) {
                
            }

            public void receiveErrorrun_eSpell(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testrun_eSummary() throws java.lang.Exception{

        gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub =
                    new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();//the default implementation should point to the right endpoint

           gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument eSummaryRequest36=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.class);
                    // TODO : Fill in the eSummaryRequest36 here
                
                        assertNotNull(stub.run_eSummary(
                        eSummaryRequest36));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrun_eSummary() throws java.lang.Exception{
            gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub = new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();
             gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument eSummaryRequest36=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.class);
                    // TODO : Fill in the eSummaryRequest36 here
                

                stub.startrun_eSummary(
                         eSummaryRequest36,
                    new tempCallbackN65712()
                );
              


        }

        private class tempCallbackN65712  extends gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler{
            public tempCallbackN65712(){ super(null);}

            public void receiveResultrun_eSummary(
                         gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument result
                            ) {
                
            }

            public void receiveErrorrun_eSummary(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testrun_eGquery() throws java.lang.Exception{

        gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub =
                    new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();//the default implementation should point to the right endpoint

           gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument eGqueryRequest38=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.class);
                    // TODO : Fill in the eGqueryRequest38 here
                
                        assertNotNull(stub.run_eGquery(
                        eGqueryRequest38));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrun_eGquery() throws java.lang.Exception{
            gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub = new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();
             gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument eGqueryRequest38=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.class);
                    // TODO : Fill in the eGqueryRequest38 here
                

                stub.startrun_eGquery(
                         eGqueryRequest38,
                    new tempCallbackN65753()
                );
              


        }

        private class tempCallbackN65753  extends gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler{
            public tempCallbackN65753(){ super(null);}

            public void receiveResultrun_eGquery(
                         gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument result
                            ) {
                
            }

            public void receiveErrorrun_eGquery(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testrun_ePost() throws java.lang.Exception{

        gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub =
                    new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();//the default implementation should point to the right endpoint

           gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument ePostRequest40=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.class);
                    // TODO : Fill in the ePostRequest40 here
                
                        assertNotNull(stub.run_ePost(
                        ePostRequest40));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrun_ePost() throws java.lang.Exception{
            gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub stub = new gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub();
             gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument ePostRequest40=
                                                        (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument)getTestObject(gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.class);
                    // TODO : Fill in the ePostRequest40 here
                

                stub.startrun_ePost(
                         ePostRequest40,
                    new tempCallbackN65794()
                );
              


        }

        private class tempCallbackN65794  extends gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler{
            public tempCallbackN65794(){ super(null);}

            public void receiveResultrun_ePost(
                         gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument result
                            ) {
                
            }

            public void receiveErrorrun_ePost(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create the desired XmlObject and provide it as the test object
        public  org.apache.xmlbeans.XmlObject getTestObject(java.lang.Class type) throws java.lang.Exception{
        java.lang.reflect.Method creatorMethod = null;
                if (org.apache.xmlbeans.XmlObject.class.isAssignableFrom(type)){
                    Class[] declaredClasses = type.getDeclaredClasses();
                    for (int i = 0; i < declaredClasses.length; i++) {
                        Class declaredClass = declaredClasses[i];
                        if (declaredClass.getName().endsWith("$Factory")){
                            creatorMethod = declaredClass.getMethod("newInstance",null);
                            break;
                        }

                    }
                }
                if (creatorMethod!=null){
                    return  (org.apache.xmlbeans.XmlObject)creatorMethod.invoke(null,null);
                }else{
                    throw new java.lang.Exception("Creator not found!");
                }

        }

         

    }
    