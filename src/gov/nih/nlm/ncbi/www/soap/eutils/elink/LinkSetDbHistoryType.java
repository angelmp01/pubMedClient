/*
 * XML Type:  LinkSetDbHistoryType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink;


/**
 * An XML LinkSetDbHistoryType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public interface LinkSetDbHistoryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkSetDbHistoryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("linksetdbhistorytyped467type");
    
    /**
     * Gets the "DbTo" element
     */
    java.lang.String getDbTo();
    
    /**
     * Gets (as xml) the "DbTo" element
     */
    org.apache.xmlbeans.XmlString xgetDbTo();
    
    /**
     * Sets the "DbTo" element
     */
    void setDbTo(java.lang.String dbTo);
    
    /**
     * Sets (as xml) the "DbTo" element
     */
    void xsetDbTo(org.apache.xmlbeans.XmlString dbTo);
    
    /**
     * Gets the "LinkName" element
     */
    java.lang.String getLinkName();
    
    /**
     * Gets (as xml) the "LinkName" element
     */
    org.apache.xmlbeans.XmlString xgetLinkName();
    
    /**
     * Sets the "LinkName" element
     */
    void setLinkName(java.lang.String linkName);
    
    /**
     * Sets (as xml) the "LinkName" element
     */
    void xsetLinkName(org.apache.xmlbeans.XmlString linkName);
    
    /**
     * Gets the "QueryKey" element
     */
    java.lang.String getQueryKey();
    
    /**
     * Gets (as xml) the "QueryKey" element
     */
    org.apache.xmlbeans.XmlString xgetQueryKey();
    
    /**
     * Sets the "QueryKey" element
     */
    void setQueryKey(java.lang.String queryKey);
    
    /**
     * Sets (as xml) the "QueryKey" element
     */
    void xsetQueryKey(org.apache.xmlbeans.XmlString queryKey);
    
    /**
     * Gets the "Info" element
     */
    java.lang.String getInfo();
    
    /**
     * Gets (as xml) the "Info" element
     */
    org.apache.xmlbeans.XmlString xgetInfo();
    
    /**
     * Sets the "Info" element
     */
    void setInfo(java.lang.String info);
    
    /**
     * Sets (as xml) the "Info" element
     */
    void xsetInfo(org.apache.xmlbeans.XmlString info);
    
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
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
