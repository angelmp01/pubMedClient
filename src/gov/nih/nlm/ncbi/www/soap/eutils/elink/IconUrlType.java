/*
 * XML Type:  IconUrlType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink;


/**
 * An XML IconUrlType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.
 */
public interface IconUrlType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IconUrlType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("iconurltype00ddtype");
    
    /**
     * Gets the "LNG" attribute
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG.Enum getLNG();
    
    /**
     * Gets (as xml) the "LNG" attribute
     */
    gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG xgetLNG();
    
    /**
     * True if has "LNG" attribute
     */
    boolean isSetLNG();
    
    /**
     * Sets the "LNG" attribute
     */
    void setLNG(gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG.Enum lng);
    
    /**
     * Sets (as xml) the "LNG" attribute
     */
    void xsetLNG(gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG lng);
    
    /**
     * Unsets the "LNG" attribute
     */
    void unsetLNG();
    
    /**
     * An XML LNG(@).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType$LNG.
     */
    public interface LNG extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LNG.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("lngb0caattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum DA = Enum.forString("DA");
        static final Enum DE = Enum.forString("DE");
        static final Enum EN = Enum.forString("EN");
        static final Enum EL = Enum.forString("EL");
        static final Enum ES = Enum.forString("ES");
        static final Enum FR = Enum.forString("FR");
        static final Enum IT = Enum.forString("IT");
        static final Enum IW = Enum.forString("IW");
        static final Enum JA = Enum.forString("JA");
        static final Enum NL = Enum.forString("NL");
        static final Enum NO = Enum.forString("NO");
        static final Enum RU = Enum.forString("RU");
        static final Enum SV = Enum.forString("SV");
        static final Enum ZH = Enum.forString("ZH");
        
        static final int INT_DA = Enum.INT_DA;
        static final int INT_DE = Enum.INT_DE;
        static final int INT_EN = Enum.INT_EN;
        static final int INT_EL = Enum.INT_EL;
        static final int INT_ES = Enum.INT_ES;
        static final int INT_FR = Enum.INT_FR;
        static final int INT_IT = Enum.INT_IT;
        static final int INT_IW = Enum.INT_IW;
        static final int INT_JA = Enum.INT_JA;
        static final int INT_NL = Enum.INT_NL;
        static final int INT_NO = Enum.INT_NO;
        static final int INT_RU = Enum.INT_RU;
        static final int INT_SV = Enum.INT_SV;
        static final int INT_ZH = Enum.INT_ZH;
        
        /**
         * Enumeration value class for gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType$LNG.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_DA
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_DA = 1;
            static final int INT_DE = 2;
            static final int INT_EN = 3;
            static final int INT_EL = 4;
            static final int INT_ES = 5;
            static final int INT_FR = 6;
            static final int INT_IT = 7;
            static final int INT_IW = 8;
            static final int INT_JA = 9;
            static final int INT_NL = 10;
            static final int INT_NO = 11;
            static final int INT_RU = 12;
            static final int INT_SV = 13;
            static final int INT_ZH = 14;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("DA", INT_DA),
                    new Enum("DE", INT_DE),
                    new Enum("EN", INT_EN),
                    new Enum("EL", INT_EL),
                    new Enum("ES", INT_ES),
                    new Enum("FR", INT_FR),
                    new Enum("IT", INT_IT),
                    new Enum("IW", INT_IW),
                    new Enum("JA", INT_JA),
                    new Enum("NL", INT_NL),
                    new Enum("NO", INT_NO),
                    new Enum("RU", INT_RU),
                    new Enum("SV", INT_SV),
                    new Enum("ZH", INT_ZH),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG newValue(java.lang.Object obj) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG) type.newValue( obj ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
