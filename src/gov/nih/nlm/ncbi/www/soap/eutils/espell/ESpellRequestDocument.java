/*
 * An XML document type.
 * Localname: eSpellRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell;


/**
 * A document containing one eSpellRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public interface ESpellRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESpellRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("espellrequest6a19doctype");
    
    /**
     * Gets the "eSpellRequest" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest getESpellRequest();
    
    /**
     * Sets the "eSpellRequest" element
     */
    void setESpellRequest(gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest eSpellRequest);
    
    /**
     * Appends and returns a new empty "eSpellRequest" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest addNewESpellRequest();
    
    /**
     * An XML eSpellRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell).
     *
     * This is a complex type.
     */
    public interface ESpellRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESpellRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("espellrequest5361elemtype");
        
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
         * Gets the "term" element
         */
        java.lang.String getTerm();
        
        /**
         * Gets (as xml) the "term" element
         */
        org.apache.xmlbeans.XmlString xgetTerm();
        
        /**
         * True if has "term" element
         */
        boolean isSetTerm();
        
        /**
         * Sets the "term" element
         */
        void setTerm(java.lang.String term);
        
        /**
         * Sets (as xml) the "term" element
         */
        void xsetTerm(org.apache.xmlbeans.XmlString term);
        
        /**
         * Unsets the "term" element
         */
        void unsetTerm();
        
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
            public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
