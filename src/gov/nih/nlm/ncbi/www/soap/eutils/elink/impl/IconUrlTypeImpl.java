/*
 * XML Type:  IconUrlType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML IconUrlType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.
 */
public class IconUrlTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType
{
    
    public IconUrlTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected IconUrlTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LNG$0 = 
        new javax.xml.namespace.QName("", "LNG");
    
    
    /**
     * Gets the "LNG" attribute
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG.Enum getLNG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LNG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LNG$0);
            }
            if (target == null)
            {
                return null;
            }
            return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LNG" attribute
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG xgetLNG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG)get_store().find_attribute_user(LNG$0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG)get_default_attribute_value(LNG$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "LNG" attribute
     */
    public boolean isSetLNG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LNG$0) != null;
        }
    }
    
    /**
     * Sets the "LNG" attribute
     */
    public void setLNG(gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG.Enum lng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LNG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LNG$0);
            }
            target.setEnumValue(lng);
        }
    }
    
    /**
     * Sets (as xml) the "LNG" attribute
     */
    public void xsetLNG(gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG lng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG)get_store().find_attribute_user(LNG$0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG)get_store().add_attribute_user(LNG$0);
            }
            target.set(lng);
        }
    }
    
    /**
     * Unsets the "LNG" attribute
     */
    public void unsetLNG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LNG$0);
        }
    }
    /**
     * An XML LNG(@).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType$LNG.
     */
    public static class LNGImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType.LNG
    {
        
        public LNGImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LNGImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
