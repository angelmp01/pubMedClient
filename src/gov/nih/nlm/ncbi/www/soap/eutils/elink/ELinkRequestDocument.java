/*
 * An XML document type.
 * Localname: eLinkRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink;


/**
 * A document containing one eLinkRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public interface ELinkRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ELinkRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("elinkrequesta77fdoctype");
    
    /**
     * Gets the "eLinkRequest" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest getELinkRequest();
    
    /**
     * Sets the "eLinkRequest" element
     */
    void setELinkRequest(gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest eLinkRequest);
    
    /**
     * Appends and returns a new empty "eLinkRequest" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest addNewELinkRequest();
    
    /**
     * An XML eLinkRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
     *
     * This is a complex type.
     */
    public interface ELinkRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ELinkRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("elinkrequest3ed3elemtype");
        
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
         * Gets array of all "id" elements
         */
        java.lang.String[] getIdArray();
        
        /**
         * Gets ith "id" element
         */
        java.lang.String getIdArray(int i);
        
        /**
         * Gets (as xml) array of all "id" elements
         */
        org.apache.xmlbeans.XmlString[] xgetIdArray();
        
        /**
         * Gets (as xml) ith "id" element
         */
        org.apache.xmlbeans.XmlString xgetIdArray(int i);
        
        /**
         * Returns number of "id" element
         */
        int sizeOfIdArray();
        
        /**
         * Sets array of all "id" element
         */
        void setIdArray(java.lang.String[] idArray);
        
        /**
         * Sets ith "id" element
         */
        void setIdArray(int i, java.lang.String id);
        
        /**
         * Sets (as xml) array of all "id" element
         */
        void xsetIdArray(org.apache.xmlbeans.XmlString[] idArray);
        
        /**
         * Sets (as xml) ith "id" element
         */
        void xsetIdArray(int i, org.apache.xmlbeans.XmlString id);
        
        /**
         * Inserts the value as the ith "id" element
         */
        void insertId(int i, java.lang.String id);
        
        /**
         * Appends the value as the last "id" element
         */
        void addId(java.lang.String id);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "id" element
         */
        org.apache.xmlbeans.XmlString insertNewId(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "id" element
         */
        org.apache.xmlbeans.XmlString addNewId();
        
        /**
         * Removes the ith "id" element
         */
        void removeId(int i);
        
        /**
         * Gets the "reldate" element
         */
        java.lang.String getReldate();
        
        /**
         * Gets (as xml) the "reldate" element
         */
        org.apache.xmlbeans.XmlString xgetReldate();
        
        /**
         * True if has "reldate" element
         */
        boolean isSetReldate();
        
        /**
         * Sets the "reldate" element
         */
        void setReldate(java.lang.String reldate);
        
        /**
         * Sets (as xml) the "reldate" element
         */
        void xsetReldate(org.apache.xmlbeans.XmlString reldate);
        
        /**
         * Unsets the "reldate" element
         */
        void unsetReldate();
        
        /**
         * Gets the "mindate" element
         */
        java.lang.String getMindate();
        
        /**
         * Gets (as xml) the "mindate" element
         */
        org.apache.xmlbeans.XmlString xgetMindate();
        
        /**
         * True if has "mindate" element
         */
        boolean isSetMindate();
        
        /**
         * Sets the "mindate" element
         */
        void setMindate(java.lang.String mindate);
        
        /**
         * Sets (as xml) the "mindate" element
         */
        void xsetMindate(org.apache.xmlbeans.XmlString mindate);
        
        /**
         * Unsets the "mindate" element
         */
        void unsetMindate();
        
        /**
         * Gets the "maxdate" element
         */
        java.lang.String getMaxdate();
        
        /**
         * Gets (as xml) the "maxdate" element
         */
        org.apache.xmlbeans.XmlString xgetMaxdate();
        
        /**
         * True if has "maxdate" element
         */
        boolean isSetMaxdate();
        
        /**
         * Sets the "maxdate" element
         */
        void setMaxdate(java.lang.String maxdate);
        
        /**
         * Sets (as xml) the "maxdate" element
         */
        void xsetMaxdate(org.apache.xmlbeans.XmlString maxdate);
        
        /**
         * Unsets the "maxdate" element
         */
        void unsetMaxdate();
        
        /**
         * Gets the "datetype" element
         */
        java.lang.String getDatetype();
        
        /**
         * Gets (as xml) the "datetype" element
         */
        org.apache.xmlbeans.XmlString xgetDatetype();
        
        /**
         * True if has "datetype" element
         */
        boolean isSetDatetype();
        
        /**
         * Sets the "datetype" element
         */
        void setDatetype(java.lang.String datetype);
        
        /**
         * Sets (as xml) the "datetype" element
         */
        void xsetDatetype(org.apache.xmlbeans.XmlString datetype);
        
        /**
         * Unsets the "datetype" element
         */
        void unsetDatetype();
        
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
         * Gets the "dbfrom" element
         */
        java.lang.String getDbfrom();
        
        /**
         * Gets (as xml) the "dbfrom" element
         */
        org.apache.xmlbeans.XmlString xgetDbfrom();
        
        /**
         * True if has "dbfrom" element
         */
        boolean isSetDbfrom();
        
        /**
         * Sets the "dbfrom" element
         */
        void setDbfrom(java.lang.String dbfrom);
        
        /**
         * Sets (as xml) the "dbfrom" element
         */
        void xsetDbfrom(org.apache.xmlbeans.XmlString dbfrom);
        
        /**
         * Unsets the "dbfrom" element
         */
        void unsetDbfrom();
        
        /**
         * Gets the "linkname" element
         */
        java.lang.String getLinkname();
        
        /**
         * Gets (as xml) the "linkname" element
         */
        org.apache.xmlbeans.XmlString xgetLinkname();
        
        /**
         * True if has "linkname" element
         */
        boolean isSetLinkname();
        
        /**
         * Sets the "linkname" element
         */
        void setLinkname(java.lang.String linkname);
        
        /**
         * Sets (as xml) the "linkname" element
         */
        void xsetLinkname(org.apache.xmlbeans.XmlString linkname);
        
        /**
         * Unsets the "linkname" element
         */
        void unsetLinkname();
        
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
         * Gets the "query_key" element
         */
        java.lang.String getQueryKey();
        
        /**
         * Gets (as xml) the "query_key" element
         */
        org.apache.xmlbeans.XmlString xgetQueryKey();
        
        /**
         * True if has "query_key" element
         */
        boolean isSetQueryKey();
        
        /**
         * Sets the "query_key" element
         */
        void setQueryKey(java.lang.String queryKey);
        
        /**
         * Sets (as xml) the "query_key" element
         */
        void xsetQueryKey(org.apache.xmlbeans.XmlString queryKey);
        
        /**
         * Unsets the "query_key" element
         */
        void unsetQueryKey();
        
        /**
         * Gets the "cmd" element
         */
        java.lang.String getCmd();
        
        /**
         * Gets (as xml) the "cmd" element
         */
        org.apache.xmlbeans.XmlString xgetCmd();
        
        /**
         * True if has "cmd" element
         */
        boolean isSetCmd();
        
        /**
         * Sets the "cmd" element
         */
        void setCmd(java.lang.String cmd);
        
        /**
         * Sets (as xml) the "cmd" element
         */
        void xsetCmd(org.apache.xmlbeans.XmlString cmd);
        
        /**
         * Unsets the "cmd" element
         */
        void unsetCmd();
        
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
            public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
