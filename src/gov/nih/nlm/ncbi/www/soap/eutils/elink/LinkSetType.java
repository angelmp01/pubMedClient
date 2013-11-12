/*
 * XML Type:  LinkSetType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink;


/**
 * An XML LinkSetType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public interface LinkSetType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("linksettypef02ftype");
    
    /**
     * Gets the "DbFrom" element
     */
    java.lang.String getDbFrom();
    
    /**
     * Gets (as xml) the "DbFrom" element
     */
    org.apache.xmlbeans.XmlString xgetDbFrom();
    
    /**
     * Sets the "DbFrom" element
     */
    void setDbFrom(java.lang.String dbFrom);
    
    /**
     * Sets (as xml) the "DbFrom" element
     */
    void xsetDbFrom(org.apache.xmlbeans.XmlString dbFrom);
    
    /**
     * Gets the "IdList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType getIdList();
    
    /**
     * True if has "IdList" element
     */
    boolean isSetIdList();
    
    /**
     * Sets the "IdList" element
     */
    void setIdList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType idList);
    
    /**
     * Appends and returns a new empty "IdList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType addNewIdList();
    
    /**
     * Unsets the "IdList" element
     */
    void unsetIdList();
    
    /**
     * Gets array of all "LinkSetDb" elements
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] getLinkSetDbArray();
    
    /**
     * Gets ith "LinkSetDb" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType getLinkSetDbArray(int i);
    
    /**
     * Returns number of "LinkSetDb" element
     */
    int sizeOfLinkSetDbArray();
    
    /**
     * Sets array of all "LinkSetDb" element
     */
    void setLinkSetDbArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] linkSetDbArray);
    
    /**
     * Sets ith "LinkSetDb" element
     */
    void setLinkSetDbArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType linkSetDb);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LinkSetDb" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType insertNewLinkSetDb(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LinkSetDb" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType addNewLinkSetDb();
    
    /**
     * Removes the ith "LinkSetDb" element
     */
    void removeLinkSetDb(int i);
    
    /**
     * Gets array of all "LinkSetDbHistory" elements
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] getLinkSetDbHistoryArray();
    
    /**
     * Gets ith "LinkSetDbHistory" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType getLinkSetDbHistoryArray(int i);
    
    /**
     * Returns number of "LinkSetDbHistory" element
     */
    int sizeOfLinkSetDbHistoryArray();
    
    /**
     * Sets array of all "LinkSetDbHistory" element
     */
    void setLinkSetDbHistoryArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] linkSetDbHistoryArray);
    
    /**
     * Sets ith "LinkSetDbHistory" element
     */
    void setLinkSetDbHistoryArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType linkSetDbHistory);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LinkSetDbHistory" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType insertNewLinkSetDbHistory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LinkSetDbHistory" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType addNewLinkSetDbHistory();
    
    /**
     * Removes the ith "LinkSetDbHistory" element
     */
    void removeLinkSetDbHistory(int i);
    
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
     * Gets the "IdUrlList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType getIdUrlList();
    
    /**
     * True if has "IdUrlList" element
     */
    boolean isSetIdUrlList();
    
    /**
     * Sets the "IdUrlList" element
     */
    void setIdUrlList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType idUrlList);
    
    /**
     * Appends and returns a new empty "IdUrlList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType addNewIdUrlList();
    
    /**
     * Unsets the "IdUrlList" element
     */
    void unsetIdUrlList();
    
    /**
     * Gets the "IdCheckList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType getIdCheckList();
    
    /**
     * True if has "IdCheckList" element
     */
    boolean isSetIdCheckList();
    
    /**
     * Sets the "IdCheckList" element
     */
    void setIdCheckList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType idCheckList);
    
    /**
     * Appends and returns a new empty "IdCheckList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType addNewIdCheckList();
    
    /**
     * Unsets the "IdCheckList" element
     */
    void unsetIdCheckList();
    
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
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
