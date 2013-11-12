/*
 * An XML document type.
 * Localname: eInfoResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo;


/**
 * A document containing one eInfoResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo) element.
 *
 * This is a complex type.
 */
public interface EInfoResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EInfoResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("einforesult87c1doctype");
    
    /**
     * Gets the "eInfoResult" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult getEInfoResult();
    
    /**
     * Sets the "eInfoResult" element
     */
    void setEInfoResult(gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult eInfoResult);
    
    /**
     * Appends and returns a new empty "eInfoResult" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult addNewEInfoResult();
    
    /**
     * An XML eInfoResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
     *
     * This is a complex type.
     */
    public interface EInfoResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EInfoResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("einforesult7eddelemtype");
        
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
         * Gets the "DbList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType getDbList();
        
        /**
         * True if has "DbList" element
         */
        boolean isSetDbList();
        
        /**
         * Sets the "DbList" element
         */
        void setDbList(gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType dbList);
        
        /**
         * Appends and returns a new empty "DbList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType addNewDbList();
        
        /**
         * Unsets the "DbList" element
         */
        void unsetDbList();
        
        /**
         * Gets the "DbInfo" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType getDbInfo();
        
        /**
         * True if has "DbInfo" element
         */
        boolean isSetDbInfo();
        
        /**
         * Sets the "DbInfo" element
         */
        void setDbInfo(gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType dbInfo);
        
        /**
         * Appends and returns a new empty "DbInfo" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType addNewDbInfo();
        
        /**
         * Unsets the "DbInfo" element
         */
        void unsetDbInfo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
