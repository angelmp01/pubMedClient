/*
 * An XML document type.
 * Localname: Result
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/egquery
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.egquery;


/**
 * A document containing one Result(@http://www.ncbi.nlm.nih.gov/soap/eutils/egquery) element.
 *
 * This is a complex type.
 */
public interface ResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("resultec73doctype");
    
    /**
     * Gets the "Result" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result getResult();
    
    /**
     * Sets the "Result" element
     */
    void setResult(gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result result);
    
    /**
     * Appends and returns a new empty "Result" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result addNewResult();
    
    /**
     * An XML Result(@http://www.ncbi.nlm.nih.gov/soap/eutils/egquery).
     *
     * This is a complex type.
     */
    public interface Result extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Result.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("resultdbbaelemtype");
        
        /**
         * Gets the "Term" element
         */
        java.lang.String getTerm();
        
        /**
         * Gets (as xml) the "Term" element
         */
        org.apache.xmlbeans.XmlString xgetTerm();
        
        /**
         * Sets the "Term" element
         */
        void setTerm(java.lang.String term);
        
        /**
         * Sets (as xml) the "Term" element
         */
        void xsetTerm(org.apache.xmlbeans.XmlString term);
        
        /**
         * Gets the "eGQueryResult" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType getEGQueryResult();
        
        /**
         * Sets the "eGQueryResult" element
         */
        void setEGQueryResult(gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType egQueryResult);
        
        /**
         * Appends and returns a new empty "eGQueryResult" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType addNewEGQueryResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}