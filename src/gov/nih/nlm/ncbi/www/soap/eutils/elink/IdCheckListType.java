/*
 * XML Type:  IdCheckListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink;


/**
 * An XML IdCheckListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public interface IdCheckListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdCheckListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("idchecklisttypebad2type");
    
    /**
     * Gets array of all "Id" elements
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType[] getIdArray();
    
    /**
     * Gets ith "Id" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType getIdArray(int i);
    
    /**
     * Returns number of "Id" element
     */
    int sizeOfIdArray();
    
    /**
     * Sets array of all "Id" element
     */
    void setIdArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType[] idArray);
    
    /**
     * Sets ith "Id" element
     */
    void setIdArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Id" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType insertNewId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Id" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType addNewId();
    
    /**
     * Removes the ith "Id" element
     */
    void removeId(int i);
    
    /**
     * Gets array of all "IdLinkSet" elements
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType[] getIdLinkSetArray();
    
    /**
     * Gets ith "IdLinkSet" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType getIdLinkSetArray(int i);
    
    /**
     * Returns number of "IdLinkSet" element
     */
    int sizeOfIdLinkSetArray();
    
    /**
     * Sets array of all "IdLinkSet" element
     */
    void setIdLinkSetArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType[] idLinkSetArray);
    
    /**
     * Sets ith "IdLinkSet" element
     */
    void setIdLinkSetArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType idLinkSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdLinkSet" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType insertNewIdLinkSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdLinkSet" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType addNewIdLinkSet();
    
    /**
     * Removes the ith "IdLinkSet" element
     */
    void removeIdLinkSet(int i);
    
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
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
