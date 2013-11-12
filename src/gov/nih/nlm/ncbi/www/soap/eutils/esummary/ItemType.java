/*
 * XML Type:  ItemType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esummary
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esummary;


/**
 * An XML ItemType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary).
 *
 * This is a complex type.
 */
public interface ItemType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ItemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("itemtype0db4type");
    
    /**
     * Gets array of all "Item" elements
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType[] getItemArray();
    
    /**
     * Gets ith "Item" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType getItemArray(int i);
    
    /**
     * Returns number of "Item" element
     */
    int sizeOfItemArray();
    
    /**
     * Sets array of all "Item" element
     */
    void setItemArray(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType[] itemArray);
    
    /**
     * Sets ith "Item" element
     */
    void setItemArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType item);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType insertNewItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType addNewItem();
    
    /**
     * Removes the ith "Item" element
     */
    void removeItem(int i);
    
    /**
     * Gets the "ItemContent" element
     */
    java.lang.String getItemContent();
    
    /**
     * Gets (as xml) the "ItemContent" element
     */
    org.apache.xmlbeans.XmlString xgetItemContent();
    
    /**
     * True if has "ItemContent" element
     */
    boolean isSetItemContent();
    
    /**
     * Sets the "ItemContent" element
     */
    void setItemContent(java.lang.String itemContent);
    
    /**
     * Sets (as xml) the "ItemContent" element
     */
    void xsetItemContent(org.apache.xmlbeans.XmlString itemContent);
    
    /**
     * Unsets the "ItemContent" element
     */
    void unsetItemContent();
    
    /**
     * Gets the "Name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "Name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "Type" attribute
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type xgetType();
    
    /**
     * Sets the "Type" attribute
     */
    void setType(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type.Enum type);
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    void xsetType(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type type);
    
    /**
     * An XML Type(@).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C699C4E67444BCF8FF3E308E8401FBC").resolveHandle("typea82eattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum INTEGER = Enum.forString("Integer");
        static final Enum DATE = Enum.forString("Date");
        static final Enum STRING = Enum.forString("String");
        static final Enum STRUCTURE = Enum.forString("Structure");
        static final Enum LIST = Enum.forString("List");
        static final Enum FLAGS = Enum.forString("Flags");
        static final Enum QUALIFIER = Enum.forString("Qualifier");
        static final Enum ENUMERATOR = Enum.forString("Enumerator");
        static final Enum UNKNOWN = Enum.forString("Unknown");
        
        static final int INT_INTEGER = Enum.INT_INTEGER;
        static final int INT_DATE = Enum.INT_DATE;
        static final int INT_STRING = Enum.INT_STRING;
        static final int INT_STRUCTURE = Enum.INT_STRUCTURE;
        static final int INT_LIST = Enum.INT_LIST;
        static final int INT_FLAGS = Enum.INT_FLAGS;
        static final int INT_QUALIFIER = Enum.INT_QUALIFIER;
        static final int INT_ENUMERATOR = Enum.INT_ENUMERATOR;
        static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
        
        /**
         * Enumeration value class for gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_INTEGER
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
            
            static final int INT_INTEGER = 1;
            static final int INT_DATE = 2;
            static final int INT_STRING = 3;
            static final int INT_STRUCTURE = 4;
            static final int INT_LIST = 5;
            static final int INT_FLAGS = 6;
            static final int INT_QUALIFIER = 7;
            static final int INT_ENUMERATOR = 8;
            static final int INT_UNKNOWN = 9;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Integer", INT_INTEGER),
                    new Enum("Date", INT_DATE),
                    new Enum("String", INT_STRING),
                    new Enum("Structure", INT_STRUCTURE),
                    new Enum("List", INT_LIST),
                    new Enum("Flags", INT_FLAGS),
                    new Enum("Qualifier", INT_QUALIFIER),
                    new Enum("Enumerator", INT_ENUMERATOR),
                    new Enum("Unknown", INT_UNKNOWN),
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
            public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type newValue(java.lang.Object obj) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type) type.newValue( obj ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type newInstance() {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType newInstance() {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
