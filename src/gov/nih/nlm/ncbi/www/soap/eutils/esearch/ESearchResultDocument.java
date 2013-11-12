/*
 * An XML document type.
 * Localname: eSearchResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch;


/**
 * A document containing one eSearchResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public interface ESearchResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESearchResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("esearchresultf675doctype");
    
    /**
     * Gets the "eSearchResult" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult getESearchResult();
    
    /**
     * Sets the "eSearchResult" element
     */
    void setESearchResult(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult eSearchResult);
    
    /**
     * Appends and returns a new empty "eSearchResult" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult addNewESearchResult();
    
    /**
     * An XML eSearchResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
     *
     * This is a complex type.
     */
    public interface ESearchResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESearchResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("esearchresult15cbelemtype");
        
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
         * Gets the "Count" element
         */
        java.lang.String getCount();
        
        /**
         * Gets (as xml) the "Count" element
         */
        org.apache.xmlbeans.XmlString xgetCount();
        
        /**
         * True if has "Count" element
         */
        boolean isSetCount();
        
        /**
         * Sets the "Count" element
         */
        void setCount(java.lang.String count);
        
        /**
         * Sets (as xml) the "Count" element
         */
        void xsetCount(org.apache.xmlbeans.XmlString count);
        
        /**
         * Unsets the "Count" element
         */
        void unsetCount();
        
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
         * Gets the "IdList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType getIdList();
        
        /**
         * True if has "IdList" element
         */
        boolean isSetIdList();
        
        /**
         * Sets the "IdList" element
         */
        void setIdList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType idList);
        
        /**
         * Appends and returns a new empty "IdList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType addNewIdList();
        
        /**
         * Unsets the "IdList" element
         */
        void unsetIdList();
        
        /**
         * Gets the "TranslationSet" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType getTranslationSet();
        
        /**
         * True if has "TranslationSet" element
         */
        boolean isSetTranslationSet();
        
        /**
         * Sets the "TranslationSet" element
         */
        void setTranslationSet(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType translationSet);
        
        /**
         * Appends and returns a new empty "TranslationSet" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType addNewTranslationSet();
        
        /**
         * Unsets the "TranslationSet" element
         */
        void unsetTranslationSet();
        
        /**
         * Gets the "TranslationStack" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType getTranslationStack();
        
        /**
         * True if has "TranslationStack" element
         */
        boolean isSetTranslationStack();
        
        /**
         * Sets the "TranslationStack" element
         */
        void setTranslationStack(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType translationStack);
        
        /**
         * Appends and returns a new empty "TranslationStack" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType addNewTranslationStack();
        
        /**
         * Unsets the "TranslationStack" element
         */
        void unsetTranslationStack();
        
        /**
         * Gets the "QueryTranslation" element
         */
        java.lang.String getQueryTranslation();
        
        /**
         * Gets (as xml) the "QueryTranslation" element
         */
        org.apache.xmlbeans.XmlString xgetQueryTranslation();
        
        /**
         * True if has "QueryTranslation" element
         */
        boolean isSetQueryTranslation();
        
        /**
         * Sets the "QueryTranslation" element
         */
        void setQueryTranslation(java.lang.String queryTranslation);
        
        /**
         * Sets (as xml) the "QueryTranslation" element
         */
        void xsetQueryTranslation(org.apache.xmlbeans.XmlString queryTranslation);
        
        /**
         * Unsets the "QueryTranslation" element
         */
        void unsetQueryTranslation();
        
        /**
         * Gets the "ErrorList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType getErrorList();
        
        /**
         * True if has "ErrorList" element
         */
        boolean isSetErrorList();
        
        /**
         * Sets the "ErrorList" element
         */
        void setErrorList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType errorList);
        
        /**
         * Appends and returns a new empty "ErrorList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType addNewErrorList();
        
        /**
         * Unsets the "ErrorList" element
         */
        void unsetErrorList();
        
        /**
         * Gets the "WarningList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType getWarningList();
        
        /**
         * True if has "WarningList" element
         */
        boolean isSetWarningList();
        
        /**
         * Sets the "WarningList" element
         */
        void setWarningList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType warningList);
        
        /**
         * Appends and returns a new empty "WarningList" element
         */
        gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType addNewWarningList();
        
        /**
         * Unsets the "WarningList" element
         */
        void unsetWarningList();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
