/*
 * An XML document type.
 * Localname: eSummaryRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esummary
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esummary;


/**
 * A document containing one eSummaryRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary) element.
 *
 * This is a complex type.
 */
public interface ESummaryRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESummaryRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("esummaryrequeste7d5doctype");
    
    /**
     * Gets the "eSummaryRequest" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest getESummaryRequest();
    
    /**
     * Sets the "eSummaryRequest" element
     */
    void setESummaryRequest(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest eSummaryRequest);
    
    /**
     * Appends and returns a new empty "eSummaryRequest" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest addNewESummaryRequest();
    
    /**
     * An XML eSummaryRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary).
     *
     * This is a complex type.
     */
    public interface ESummaryRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESummaryRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("esummaryrequest8d5belemtype");
        
        /**
         * Gets the "db" element
         */
        java.lang.String getDb();
        
        /**
         * Gets (as xml) the "db" element
         */
        org.apache.xmlbeans.XmlString xgetDb();
        
        /**
         * True if has "db" element
         */
        boolean isSetDb();
        
        /**
         * Sets the "db" element
         */
        void setDb(java.lang.String db);
        
        /**
         * Sets (as xml) the "db" element
         */
        void xsetDb(org.apache.xmlbeans.XmlString db);
        
        /**
         * Unsets the "db" element
         */
        void unsetDb();
        
        /**
         * Gets the "id" element
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" element
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" element
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "WebEnv" element
         */
        java.lang.String getWebEnv();
        
        /**
         * Gets (as xml) the "WebEnv" element
         */
        org.apache.xmlbeans.XmlString xgetWebEnv();
        
        /**
         * True if has "WebEnv" element
         */
        boolean isSetWebEnv();
        
        /**
         * Sets the "WebEnv" element
         */
        void setWebEnv(java.lang.String webEnv);
        
        /**
         * Sets (as xml) the "WebEnv" element
         */
        void xsetWebEnv(org.apache.xmlbeans.XmlString webEnv);
        
        /**
         * Unsets the "WebEnv" element
         */
        void unsetWebEnv();
        
        /**
         * Gets the "query_key" element
         */
        java.lang.String getQueryKey();
        
        /**
         * Gets (as xml) the "query_key" element
         */
        org.apache.xmlbeans.XmlString xgetQueryKey();
        
        /**
         * True if has "query_key" element
         */
        boolean isSetQueryKey();
        
        /**
         * Sets the "query_key" element
         */
        void setQueryKey(java.lang.String queryKey);
        
        /**
         * Sets (as xml) the "query_key" element
         */
        void xsetQueryKey(org.apache.xmlbeans.XmlString queryKey);
        
        /**
         * Unsets the "query_key" element
         */
        void unsetQueryKey();
        
        /**
         * Gets the "retstart" element
         */
        java.lang.String getRetstart();
        
        /**
         * Gets (as xml) the "retstart" element
         */
        org.apache.xmlbeans.XmlString xgetRetstart();
        
        /**
         * True if has "retstart" element
         */
        boolean isSetRetstart();
        
        /**
         * Sets the "retstart" element
         */
        void setRetstart(java.lang.String retstart);
        
        /**
         * Sets (as xml) the "retstart" element
         */
        void xsetRetstart(org.apache.xmlbeans.XmlString retstart);
        
        /**
         * Unsets the "retstart" element
         */
        void unsetRetstart();
        
        /**
         * Gets the "retmax" element
         */
        java.lang.String getRetmax();
        
        /**
         * Gets (as xml) the "retmax" element
         */
        org.apache.xmlbeans.XmlString xgetRetmax();
        
        /**
         * True if has "retmax" element
         */
        boolean isSetRetmax();
        
        /**
         * Sets the "retmax" element
         */
        void setRetmax(java.lang.String retmax);
        
        /**
         * Sets (as xml) the "retmax" element
         */
        void xsetRetmax(org.apache.xmlbeans.XmlString retmax);
        
        /**
         * Unsets the "retmax" element
         */
        void unsetRetmax();
        
        /**
         * Gets the "tool" element
         */
        java.lang.String getTool();
        
        /**
         * Gets (as xml) the "tool" element
         */
        org.apache.xmlbeans.XmlString xgetTool();
        
        /**
         * True if has "tool" element
         */
        boolean isSetTool();
        
        /**
         * Sets the "tool" element
         */
        void setTool(java.lang.String tool);
        
        /**
         * Sets (as xml) the "tool" element
         */
        void xsetTool(org.apache.xmlbeans.XmlString tool);
        
        /**
         * Unsets the "tool" element
         */
        void unsetTool();
        
        /**
         * Gets the "email" element
         */
        java.lang.String getEmail();
        
        /**
         * Gets (as xml) the "email" element
         */
        org.apache.xmlbeans.XmlString xgetEmail();
        
        /**
         * True if has "email" element
         */
        boolean isSetEmail();
        
        /**
         * Sets the "email" element
         */
        void setEmail(java.lang.String email);
        
        /**
         * Sets (as xml) the "email" element
         */
        void xsetEmail(org.apache.xmlbeans.XmlString email);
        
        /**
         * Unsets the "email" element
         */
        void unsetEmail();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
