/*
 * An XML document type.
 * Localname: ePostResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/epost
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.epost;


/**
 * A document containing one ePostResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/epost) element.
 *
 * This is a complex type.
 */
public interface EPostResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EPostResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("epostresult3aa5doctype");
    
    /**
     * Gets the "ePostResult" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult getEPostResult();
    
    /**
     * Sets the "ePostResult" element
     */
    void setEPostResult(gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult ePostResult);
    
    /**
     * Appends and returns a new empty "ePostResult" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult addNewEPostResult();
    
    /**
     * An XML ePostResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/epost).
     *
     * This is a complex type.
     */
    public interface EPostResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EPostResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("epostresulta133elemtype");
        
        /**
         * Gets the "InvalidIdList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType getInvalidIdList();
        
        /**
         * True if has "InvalidIdList" element
         */
        boolean isSetInvalidIdList();
        
        /**
         * Sets the "InvalidIdList" element
         */
        void setInvalidIdList(gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType invalidIdList);
        
        /**
         * Appends and returns a new empty "InvalidIdList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType addNewInvalidIdList();
        
        /**
         * Unsets the "InvalidIdList" element
         */
        void unsetInvalidIdList();
        
        /**
         * Gets the "QueryKey" element
         */
        java.lang.String getQueryKey();
        
        /**
         * Gets (as xml) the "QueryKey" element
         */
        org.apache.xmlbeans.XmlString xgetQueryKey();
        
        /**
         * True if has "QueryKey" element
         */
        boolean isSetQueryKey();
        
        /**
         * Sets the "QueryKey" element
         */
        void setQueryKey(java.lang.String queryKey);
        
        /**
         * Sets (as xml) the "QueryKey" element
         */
        void xsetQueryKey(org.apache.xmlbeans.XmlString queryKey);
        
        /**
         * Unsets the "QueryKey" element
         */
        void unsetQueryKey();
        
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
         * Gets the "ERROR" element
         */
        java.lang.String getERROR();
        
        /**
         * Gets (as xml) the "ERROR" element
         */
        org.apache.xmlbeans.XmlString xgetERROR();
        
        /**
         * True if has "ERROR" element
         */
        boolean isSetERROR();
        
        /**
         * Sets the "ERROR" element
         */
        void setERROR(java.lang.String error);
        
        /**
         * Sets (as xml) the "ERROR" element
         */
        void xsetERROR(org.apache.xmlbeans.XmlString error);
        
        /**
         * Unsets the "ERROR" element
         */
        void unsetERROR();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
