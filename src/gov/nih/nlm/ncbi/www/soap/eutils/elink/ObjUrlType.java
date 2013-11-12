/*
 * XML Type:  ObjUrlType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink;


/**
 * An XML ObjUrlType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public interface ObjUrlType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjUrlType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("objurltypeb111type");
    
    /**
     * Gets the "Url" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType getUrl();
    
    /**
     * Sets the "Url" element
     */
    void setUrl(gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType url);
    
    /**
     * Appends and returns a new empty "Url" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType addNewUrl();
    
    /**
     * Gets the "IconUrl" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType getIconUrl();
    
    /**
     * True if has "IconUrl" element
     */
    boolean isSetIconUrl();
    
    /**
     * Sets the "IconUrl" element
     */
    void setIconUrl(gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType iconUrl);
    
    /**
     * Appends and returns a new empty "IconUrl" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType addNewIconUrl();
    
    /**
     * Unsets the "IconUrl" element
     */
    void unsetIconUrl();
    
    /**
     * Gets the "LinkName" element
     */
    java.lang.String getLinkName();
    
    /**
     * Gets (as xml) the "LinkName" element
     */
    org.apache.xmlbeans.XmlString xgetLinkName();
    
    /**
     * True if has "LinkName" element
     */
    boolean isSetLinkName();
    
    /**
     * Sets the "LinkName" element
     */
    void setLinkName(java.lang.String linkName);
    
    /**
     * Sets (as xml) the "LinkName" element
     */
    void xsetLinkName(org.apache.xmlbeans.XmlString linkName);
    
    /**
     * Unsets the "LinkName" element
     */
    void unsetLinkName();
    
    /**
     * Gets array of all "SubjectType" elements
     */
    java.lang.String[] getSubjectTypeArray();
    
    /**
     * Gets ith "SubjectType" element
     */
    java.lang.String getSubjectTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "SubjectType" elements
     */
    org.apache.xmlbeans.XmlString[] xgetSubjectTypeArray();
    
    /**
     * Gets (as xml) ith "SubjectType" element
     */
    org.apache.xmlbeans.XmlString xgetSubjectTypeArray(int i);
    
    /**
     * Returns number of "SubjectType" element
     */
    int sizeOfSubjectTypeArray();
    
    /**
     * Sets array of all "SubjectType" element
     */
    void setSubjectTypeArray(java.lang.String[] subjectTypeArray);
    
    /**
     * Sets ith "SubjectType" element
     */
    void setSubjectTypeArray(int i, java.lang.String subjectType);
    
    /**
     * Sets (as xml) array of all "SubjectType" element
     */
    void xsetSubjectTypeArray(org.apache.xmlbeans.XmlString[] subjectTypeArray);
    
    /**
     * Sets (as xml) ith "SubjectType" element
     */
    void xsetSubjectTypeArray(int i, org.apache.xmlbeans.XmlString subjectType);
    
    /**
     * Inserts the value as the ith "SubjectType" element
     */
    void insertSubjectType(int i, java.lang.String subjectType);
    
    /**
     * Appends the value as the last "SubjectType" element
     */
    void addSubjectType(java.lang.String subjectType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubjectType" element
     */
    org.apache.xmlbeans.XmlString insertNewSubjectType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubjectType" element
     */
    org.apache.xmlbeans.XmlString addNewSubjectType();
    
    /**
     * Removes the ith "SubjectType" element
     */
    void removeSubjectType(int i);
    
    /**
     * Gets array of all "Category" elements
     */
    java.lang.String[] getCategoryArray();
    
    /**
     * Gets ith "Category" element
     */
    java.lang.String getCategoryArray(int i);
    
    /**
     * Gets (as xml) array of all "Category" elements
     */
    org.apache.xmlbeans.XmlString[] xgetCategoryArray();
    
    /**
     * Gets (as xml) ith "Category" element
     */
    org.apache.xmlbeans.XmlString xgetCategoryArray(int i);
    
    /**
     * Returns number of "Category" element
     */
    int sizeOfCategoryArray();
    
    /**
     * Sets array of all "Category" element
     */
    void setCategoryArray(java.lang.String[] categoryArray);
    
    /**
     * Sets ith "Category" element
     */
    void setCategoryArray(int i, java.lang.String category);
    
    /**
     * Sets (as xml) array of all "Category" element
     */
    void xsetCategoryArray(org.apache.xmlbeans.XmlString[] categoryArray);
    
    /**
     * Sets (as xml) ith "Category" element
     */
    void xsetCategoryArray(int i, org.apache.xmlbeans.XmlString category);
    
    /**
     * Inserts the value as the ith "Category" element
     */
    void insertCategory(int i, java.lang.String category);
    
    /**
     * Appends the value as the last "Category" element
     */
    void addCategory(java.lang.String category);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    org.apache.xmlbeans.XmlString insertNewCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    org.apache.xmlbeans.XmlString addNewCategory();
    
    /**
     * Removes the ith "Category" element
     */
    void removeCategory(int i);
    
    /**
     * Gets array of all "Attribute" elements
     */
    java.lang.String[] getAttributeArray();
    
    /**
     * Gets ith "Attribute" element
     */
    java.lang.String getAttributeArray(int i);
    
    /**
     * Gets (as xml) array of all "Attribute" elements
     */
    org.apache.xmlbeans.XmlString[] xgetAttributeArray();
    
    /**
     * Gets (as xml) ith "Attribute" element
     */
    org.apache.xmlbeans.XmlString xgetAttributeArray(int i);
    
    /**
     * Returns number of "Attribute" element
     */
    int sizeOfAttributeArray();
    
    /**
     * Sets array of all "Attribute" element
     */
    void setAttributeArray(java.lang.String[] attributeArray);
    
    /**
     * Sets ith "Attribute" element
     */
    void setAttributeArray(int i, java.lang.String attribute);
    
    /**
     * Sets (as xml) array of all "Attribute" element
     */
    void xsetAttributeArray(org.apache.xmlbeans.XmlString[] attributeArray);
    
    /**
     * Sets (as xml) ith "Attribute" element
     */
    void xsetAttributeArray(int i, org.apache.xmlbeans.XmlString attribute);
    
    /**
     * Inserts the value as the ith "Attribute" element
     */
    void insertAttribute(int i, java.lang.String attribute);
    
    /**
     * Appends the value as the last "Attribute" element
     */
    void addAttribute(java.lang.String attribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    org.apache.xmlbeans.XmlString insertNewAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    org.apache.xmlbeans.XmlString addNewAttribute();
    
    /**
     * Removes the ith "Attribute" element
     */
    void removeAttribute(int i);
    
    /**
     * Gets the "Provider" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType getProvider();
    
    /**
     * Sets the "Provider" element
     */
    void setProvider(gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType provider);
    
    /**
     * Appends and returns a new empty "Provider" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType addNewProvider();
    
    /**
     * Gets the "SubProvider" element
     */
    java.lang.String getSubProvider();
    
    /**
     * Gets (as xml) the "SubProvider" element
     */
    org.apache.xmlbeans.XmlString xgetSubProvider();
    
    /**
     * True if has "SubProvider" element
     */
    boolean isSetSubProvider();
    
    /**
     * Sets the "SubProvider" element
     */
    void setSubProvider(java.lang.String subProvider);
    
    /**
     * Sets (as xml) the "SubProvider" element
     */
    void xsetSubProvider(org.apache.xmlbeans.XmlString subProvider);
    
    /**
     * Unsets the "SubProvider" element
     */
    void unsetSubProvider();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
