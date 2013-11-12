/*
 * XML Type:  DbInfoType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo;


/**
 * An XML DbInfoType(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
 *
 * This is a complex type.
 */
public interface DbInfoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DbInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("dbinfotypef619type");
    
    /**
     * Gets the "DbName" element
     */
    java.lang.String getDbName();
    
    /**
     * Gets (as xml) the "DbName" element
     */
    org.apache.xmlbeans.XmlString xgetDbName();
    
    /**
     * Sets the "DbName" element
     */
    void setDbName(java.lang.String dbName);
    
    /**
     * Sets (as xml) the "DbName" element
     */
    void xsetDbName(org.apache.xmlbeans.XmlString dbName);
    
    /**
     * Gets the "MenuName" element
     */
    java.lang.String getMenuName();
    
    /**
     * Gets (as xml) the "MenuName" element
     */
    org.apache.xmlbeans.XmlString xgetMenuName();
    
    /**
     * Sets the "MenuName" element
     */
    void setMenuName(java.lang.String menuName);
    
    /**
     * Sets (as xml) the "MenuName" element
     */
    void xsetMenuName(org.apache.xmlbeans.XmlString menuName);
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets the "Count" element
     */
    java.lang.String getCount();
    
    /**
     * Gets (as xml) the "Count" element
     */
    org.apache.xmlbeans.XmlString xgetCount();
    
    /**
     * Sets the "Count" element
     */
    void setCount(java.lang.String count);
    
    /**
     * Sets (as xml) the "Count" element
     */
    void xsetCount(org.apache.xmlbeans.XmlString count);
    
    /**
     * Gets the "LastUpdate" element
     */
    java.lang.String getLastUpdate();
    
    /**
     * Gets (as xml) the "LastUpdate" element
     */
    org.apache.xmlbeans.XmlString xgetLastUpdate();
    
    /**
     * Sets the "LastUpdate" element
     */
    void setLastUpdate(java.lang.String lastUpdate);
    
    /**
     * Sets (as xml) the "LastUpdate" element
     */
    void xsetLastUpdate(org.apache.xmlbeans.XmlString lastUpdate);
    
    /**
     * Gets the "FieldList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType getFieldList();
    
    /**
     * Sets the "FieldList" element
     */
    void setFieldList(gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType fieldList);
    
    /**
     * Appends and returns a new empty "FieldList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType addNewFieldList();
    
    /**
     * Gets the "LinkList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType getLinkList();
    
    /**
     * True if has "LinkList" element
     */
    boolean isSetLinkList();
    
    /**
     * Sets the "LinkList" element
     */
    void setLinkList(gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType linkList);
    
    /**
     * Appends and returns a new empty "LinkList" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType addNewLinkList();
    
    /**
     * Unsets the "LinkList" element
     */
    void unsetLinkList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
