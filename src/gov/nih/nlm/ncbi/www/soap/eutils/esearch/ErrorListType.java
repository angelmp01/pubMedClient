/*
 * XML Type:  ErrorListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch;


/**
 * An XML ErrorListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
 *
 * This is a complex type.
 */
public interface ErrorListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("errorlisttype689btype");
    
    /**
     * Gets array of all "PhraseNotFound" elements
     */
    java.lang.String[] getPhraseNotFoundArray();
    
    /**
     * Gets ith "PhraseNotFound" element
     */
    java.lang.String getPhraseNotFoundArray(int i);
    
    /**
     * Gets (as xml) array of all "PhraseNotFound" elements
     */
    org.apache.xmlbeans.XmlString[] xgetPhraseNotFoundArray();
    
    /**
     * Gets (as xml) ith "PhraseNotFound" element
     */
    org.apache.xmlbeans.XmlString xgetPhraseNotFoundArray(int i);
    
    /**
     * Returns number of "PhraseNotFound" element
     */
    int sizeOfPhraseNotFoundArray();
    
    /**
     * Sets array of all "PhraseNotFound" element
     */
    void setPhraseNotFoundArray(java.lang.String[] phraseNotFoundArray);
    
    /**
     * Sets ith "PhraseNotFound" element
     */
    void setPhraseNotFoundArray(int i, java.lang.String phraseNotFound);
    
    /**
     * Sets (as xml) array of all "PhraseNotFound" element
     */
    void xsetPhraseNotFoundArray(org.apache.xmlbeans.XmlString[] phraseNotFoundArray);
    
    /**
     * Sets (as xml) ith "PhraseNotFound" element
     */
    void xsetPhraseNotFoundArray(int i, org.apache.xmlbeans.XmlString phraseNotFound);
    
    /**
     * Inserts the value as the ith "PhraseNotFound" element
     */
    void insertPhraseNotFound(int i, java.lang.String phraseNotFound);
    
    /**
     * Appends the value as the last "PhraseNotFound" element
     */
    void addPhraseNotFound(java.lang.String phraseNotFound);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhraseNotFound" element
     */
    org.apache.xmlbeans.XmlString insertNewPhraseNotFound(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PhraseNotFound" element
     */
    org.apache.xmlbeans.XmlString addNewPhraseNotFound();
    
    /**
     * Removes the ith "PhraseNotFound" element
     */
    void removePhraseNotFound(int i);
    
    /**
     * Gets array of all "FieldNotFound" elements
     */
    java.lang.String[] getFieldNotFoundArray();
    
    /**
     * Gets ith "FieldNotFound" element
     */
    java.lang.String getFieldNotFoundArray(int i);
    
    /**
     * Gets (as xml) array of all "FieldNotFound" elements
     */
    org.apache.xmlbeans.XmlString[] xgetFieldNotFoundArray();
    
    /**
     * Gets (as xml) ith "FieldNotFound" element
     */
    org.apache.xmlbeans.XmlString xgetFieldNotFoundArray(int i);
    
    /**
     * Returns number of "FieldNotFound" element
     */
    int sizeOfFieldNotFoundArray();
    
    /**
     * Sets array of all "FieldNotFound" element
     */
    void setFieldNotFoundArray(java.lang.String[] fieldNotFoundArray);
    
    /**
     * Sets ith "FieldNotFound" element
     */
    void setFieldNotFoundArray(int i, java.lang.String fieldNotFound);
    
    /**
     * Sets (as xml) array of all "FieldNotFound" element
     */
    void xsetFieldNotFoundArray(org.apache.xmlbeans.XmlString[] fieldNotFoundArray);
    
    /**
     * Sets (as xml) ith "FieldNotFound" element
     */
    void xsetFieldNotFoundArray(int i, org.apache.xmlbeans.XmlString fieldNotFound);
    
    /**
     * Inserts the value as the ith "FieldNotFound" element
     */
    void insertFieldNotFound(int i, java.lang.String fieldNotFound);
    
    /**
     * Appends the value as the last "FieldNotFound" element
     */
    void addFieldNotFound(java.lang.String fieldNotFound);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FieldNotFound" element
     */
    org.apache.xmlbeans.XmlString insertNewFieldNotFound(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FieldNotFound" element
     */
    org.apache.xmlbeans.XmlString addNewFieldNotFound();
    
    /**
     * Removes the ith "FieldNotFound" element
     */
    void removeFieldNotFound(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
