/*
 * An XML document type.
 * Localname: eSearchRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch;


/**
 * A document containing one eSearchRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public interface ESearchRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESearchRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("esearchrequest897fdoctype");
    
    /**
     * Gets the "eSearchRequest" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest getESearchRequest();
    
    /**
     * Sets the "eSearchRequest" element
     */
    void setESearchRequest(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest eSearchRequest);
    
    /**
     * Appends and returns a new empty "eSearchRequest" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest addNewESearchRequest();
    
    /**
     * An XML eSearchRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
     *
     * This is a complex type.
     */
    public interface ESearchRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESearchRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("esearchrequeste741elemtype");
        
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
         * Gets the "QueryKey" element
         */
        java.lang.String getQueryKey();
        
        /**
         * Gets (as xml) the "QueryKey" element
         */
        org.apache.xmlbeans.XmlString xgetQueryKey();
        
        /**
         * True if has "QueryKey" element
         */
        boolean isSetQueryKey();
        
        /**
         * Sets the "QueryKey" element
         */
        void setQueryKey(java.lang.String queryKey);
        
        /**
         * Sets (as xml) the "QueryKey" element
         */
        void xsetQueryKey(org.apache.xmlbeans.XmlString queryKey);
        
        /**
         * Unsets the "QueryKey" element
         */
        void unsetQueryKey();
        
        /**
         * Gets the "usehistory" element
         */
        java.lang.String getUsehistory();
        
        /**
         * Gets (as xml) the "usehistory" element
         */
        org.apache.xmlbeans.XmlString xgetUsehistory();
        
        /**
         * True if has "usehistory" element
         */
        boolean isSetUsehistory();
        
        /**
         * Sets the "usehistory" element
         */
        void setUsehistory(java.lang.String usehistory);
        
        /**
         * Sets (as xml) the "usehistory" element
         */
        void xsetUsehistory(org.apache.xmlbeans.XmlString usehistory);
        
        /**
         * Unsets the "usehistory" element
         */
        void unsetUsehistory();
        
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
         * Gets the "field" element
         */
        java.lang.String getField();
        
        /**
         * Gets (as xml) the "field" element
         */
        org.apache.xmlbeans.XmlString xgetField();
        
        /**
         * True if has "field" element
         */
        boolean isSetField();
        
        /**
         * Sets the "field" element
         */
        void setField(java.lang.String field);
        
        /**
         * Sets (as xml) the "field" element
         */
        void xsetField(org.apache.xmlbeans.XmlString field);
        
        /**
         * Unsets the "field" element
         */
        void unsetField();
        
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
         * Gets the "RetStart" element
         */
        java.lang.String getRetStart();
        
        /**
         * Gets (as xml) the "RetStart" element
         */
        org.apache.xmlbeans.XmlString xgetRetStart();
        
        /**
         * True if has "RetStart" element
         */
        boolean isSetRetStart();
        
        /**
         * Sets the "RetStart" element
         */
        void setRetStart(java.lang.String retStart);
        
        /**
         * Sets (as xml) the "RetStart" element
         */
        void xsetRetStart(org.apache.xmlbeans.XmlString retStart);
        
        /**
         * Unsets the "RetStart" element
         */
        void unsetRetStart();
        
        /**
         * Gets the "RetMax" element
         */
        java.lang.String getRetMax();
        
        /**
         * Gets (as xml) the "RetMax" element
         */
        org.apache.xmlbeans.XmlString xgetRetMax();
        
        /**
         * True if has "RetMax" element
         */
        boolean isSetRetMax();
        
        /**
         * Sets the "RetMax" element
         */
        void setRetMax(java.lang.String retMax);
        
        /**
         * Sets (as xml) the "RetMax" element
         */
        void xsetRetMax(org.apache.xmlbeans.XmlString retMax);
        
        /**
         * Unsets the "RetMax" element
         */
        void unsetRetMax();
        
        /**
         * Gets the "rettype" element
         */
        java.lang.String getRettype();
        
        /**
         * Gets (as xml) the "rettype" element
         */
        org.apache.xmlbeans.XmlString xgetRettype();
        
        /**
         * True if has "rettype" element
         */
        boolean isSetRettype();
        
        /**
         * Sets the "rettype" element
         */
        void setRettype(java.lang.String rettype);
        
        /**
         * Sets (as xml) the "rettype" element
         */
        void xsetRettype(org.apache.xmlbeans.XmlString rettype);
        
        /**
         * Unsets the "rettype" element
         */
        void unsetRettype();
        
        /**
         * Gets the "sort" element
         */
        java.lang.String getSort();
        
        /**
         * Gets (as xml) the "sort" element
         */
        org.apache.xmlbeans.XmlString xgetSort();
        
        /**
         * True if has "sort" element
         */
        boolean isSetSort();
        
        /**
         * Sets the "sort" element
         */
        void setSort(java.lang.String sort);
        
        /**
         * Sets (as xml) the "sort" element
         */
        void xsetSort(org.apache.xmlbeans.XmlString sort);
        
        /**
         * Unsets the "sort" element
         */
        void unsetSort();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
