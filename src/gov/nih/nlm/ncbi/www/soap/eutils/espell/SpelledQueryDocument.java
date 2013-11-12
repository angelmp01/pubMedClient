/*
 * An XML document type.
 * Localname: SpelledQuery
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell;


/**
 * A document containing one SpelledQuery(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public interface SpelledQueryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpelledQueryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("spelledquery5852doctype");
    
    /**
     * Gets the "SpelledQuery" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery getSpelledQuery();
    
    /**
     * Sets the "SpelledQuery" element
     */
    void setSpelledQuery(gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery spelledQuery);
    
    /**
     * Appends and returns a new empty "SpelledQuery" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery addNewSpelledQuery();
    
    /**
     * An XML SpelledQuery(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell).
     *
     * This is a complex type.
     */
    public interface SpelledQuery extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpelledQuery.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("spelledquery8d8felemtype");
        
        /**
         * Gets array of all "Replaced" elements
         */
        java.lang.String[] getReplacedArray();
        
        /**
         * Gets ith "Replaced" element
         */
        java.lang.String getReplacedArray(int i);
        
        /**
         * Gets (as xml) array of all "Replaced" elements
         */
        org.apache.xmlbeans.XmlString[] xgetReplacedArray();
        
        /**
         * Gets (as xml) ith "Replaced" element
         */
        org.apache.xmlbeans.XmlString xgetReplacedArray(int i);
        
        /**
         * Returns number of "Replaced" element
         */
        int sizeOfReplacedArray();
        
        /**
         * Sets array of all "Replaced" element
         */
        void setReplacedArray(java.lang.String[] replacedArray);
        
        /**
         * Sets ith "Replaced" element
         */
        void setReplacedArray(int i, java.lang.String replaced);
        
        /**
         * Sets (as xml) array of all "Replaced" element
         */
        void xsetReplacedArray(org.apache.xmlbeans.XmlString[] replacedArray);
        
        /**
         * Sets (as xml) ith "Replaced" element
         */
        void xsetReplacedArray(int i, org.apache.xmlbeans.XmlString replaced);
        
        /**
         * Inserts the value as the ith "Replaced" element
         */
        void insertReplaced(int i, java.lang.String replaced);
        
        /**
         * Appends the value as the last "Replaced" element
         */
        void addReplaced(java.lang.String replaced);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Replaced" element
         */
        org.apache.xmlbeans.XmlString insertNewReplaced(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Replaced" element
         */
        org.apache.xmlbeans.XmlString addNewReplaced();
        
        /**
         * Removes the ith "Replaced" element
         */
        void removeReplaced(int i);
        
        /**
         * Gets array of all "Original" elements
         */
        java.lang.String[] getOriginalArray();
        
        /**
         * Gets ith "Original" element
         */
        java.lang.String getOriginalArray(int i);
        
        /**
         * Gets (as xml) array of all "Original" elements
         */
        org.apache.xmlbeans.XmlString[] xgetOriginalArray();
        
        /**
         * Gets (as xml) ith "Original" element
         */
        org.apache.xmlbeans.XmlString xgetOriginalArray(int i);
        
        /**
         * Returns number of "Original" element
         */
        int sizeOfOriginalArray();
        
        /**
         * Sets array of all "Original" element
         */
        void setOriginalArray(java.lang.String[] originalArray);
        
        /**
         * Sets ith "Original" element
         */
        void setOriginalArray(int i, java.lang.String original);
        
        /**
         * Sets (as xml) array of all "Original" element
         */
        void xsetOriginalArray(org.apache.xmlbeans.XmlString[] originalArray);
        
        /**
         * Sets (as xml) ith "Original" element
         */
        void xsetOriginalArray(int i, org.apache.xmlbeans.XmlString original);
        
        /**
         * Inserts the value as the ith "Original" element
         */
        void insertOriginal(int i, java.lang.String original);
        
        /**
         * Appends the value as the last "Original" element
         */
        void addOriginal(java.lang.String original);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Original" element
         */
        org.apache.xmlbeans.XmlString insertNewOriginal(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Original" element
         */
        org.apache.xmlbeans.XmlString addNewOriginal();
        
        /**
         * Removes the ith "Original" element
         */
        void removeOriginal(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
