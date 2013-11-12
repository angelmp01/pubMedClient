/*
 * XML Type:  TranslationStackType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch;


/**
 * An XML TranslationStackType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
 *
 * This is a complex type.
 */
public interface TranslationStackType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TranslationStackType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("translationstacktype119etype");
    
    /**
     * Gets array of all "TermSet" elements
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType[] getTermSetArray();
    
    /**
     * Gets ith "TermSet" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType getTermSetArray(int i);
    
    /**
     * Returns number of "TermSet" element
     */
    int sizeOfTermSetArray();
    
    /**
     * Sets array of all "TermSet" element
     */
    void setTermSetArray(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType[] termSetArray);
    
    /**
     * Sets ith "TermSet" element
     */
    void setTermSetArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType termSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TermSet" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType insertNewTermSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TermSet" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType addNewTermSet();
    
    /**
     * Removes the ith "TermSet" element
     */
    void removeTermSet(int i);
    
    /**
     * Gets array of all "OP" elements
     */
    java.lang.String[] getOPArray();
    
    /**
     * Gets ith "OP" element
     */
    java.lang.String getOPArray(int i);
    
    /**
     * Gets (as xml) array of all "OP" elements
     */
    org.apache.xmlbeans.XmlString[] xgetOPArray();
    
    /**
     * Gets (as xml) ith "OP" element
     */
    org.apache.xmlbeans.XmlString xgetOPArray(int i);
    
    /**
     * Returns number of "OP" element
     */
    int sizeOfOPArray();
    
    /**
     * Sets array of all "OP" element
     */
    void setOPArray(java.lang.String[] opArray);
    
    /**
     * Sets ith "OP" element
     */
    void setOPArray(int i, java.lang.String op);
    
    /**
     * Sets (as xml) array of all "OP" element
     */
    void xsetOPArray(org.apache.xmlbeans.XmlString[] opArray);
    
    /**
     * Sets (as xml) ith "OP" element
     */
    void xsetOPArray(int i, org.apache.xmlbeans.XmlString op);
    
    /**
     * Inserts the value as the ith "OP" element
     */
    void insertOP(int i, java.lang.String op);
    
    /**
     * Appends the value as the last "OP" element
     */
    void addOP(java.lang.String op);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OP" element
     */
    org.apache.xmlbeans.XmlString insertNewOP(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OP" element
     */
    org.apache.xmlbeans.XmlString addNewOP();
    
    /**
     * Removes the ith "OP" element
     */
    void removeOP(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
