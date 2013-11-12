/*
 * XML Type:  IdListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch;


/**
 * An XML IdListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
 *
 * This is a complex type.
 */
public interface IdListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("idlisttype01e0type");
    
    /**
     * Gets array of all "Id" elements
     */
    java.lang.String[] getIdArray();
    
    /**
     * Gets ith "Id" element
     */
    java.lang.String getIdArray(int i);
    
    /**
     * Gets (as xml) array of all "Id" elements
     */
    org.apache.xmlbeans.XmlString[] xgetIdArray();
    
    /**
     * Gets (as xml) ith "Id" element
     */
    org.apache.xmlbeans.XmlString xgetIdArray(int i);
    
    /**
     * Returns number of "Id" element
     */
    int sizeOfIdArray();
    
    /**
     * Sets array of all "Id" element
     */
    void setIdArray(java.lang.String[] idArray);
    
    /**
     * Sets ith "Id" element
     */
    void setIdArray(int i, java.lang.String id);
    
    /**
     * Sets (as xml) array of all "Id" element
     */
    void xsetIdArray(org.apache.xmlbeans.XmlString[] idArray);
    
    /**
     * Sets (as xml) ith "Id" element
     */
    void xsetIdArray(int i, org.apache.xmlbeans.XmlString id);
    
    /**
     * Inserts the value as the ith "Id" element
     */
    void insertId(int i, java.lang.String id);
    
    /**
     * Appends the value as the last "Id" element
     */
    void addId(java.lang.String id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Id" element
     */
    org.apache.xmlbeans.XmlString insertNewId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Id" element
     */
    org.apache.xmlbeans.XmlString addNewId();
    
    /**
     * Removes the ith "Id" element
     */
    void removeId(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
