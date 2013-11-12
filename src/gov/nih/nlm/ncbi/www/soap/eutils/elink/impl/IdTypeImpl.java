/*
 * XML Type:  IdType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML IdType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.
 */
public class IdTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType
{
    
    public IdTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected IdTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName HASLINKOUT$0 = 
        new javax.xml.namespace.QName("", "HasLinkOut");
    private static final javax.xml.namespace.QName HASNEIGHBOR$2 = 
        new javax.xml.namespace.QName("", "HasNeighbor");
    
    
    /**
     * Gets the "HasLinkOut" attribute
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut.Enum getHasLinkOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASLINKOUT$0);
            if (target == null)
            {
                return null;
            }
            return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasLinkOut" attribute
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut xgetHasLinkOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut)get_store().find_attribute_user(HASLINKOUT$0);
            return target;
        }
    }
    
    /**
     * True if has "HasLinkOut" attribute
     */
    public boolean isSetHasLinkOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HASLINKOUT$0) != null;
        }
    }
    
    /**
     * Sets the "HasLinkOut" attribute
     */
    public void setHasLinkOut(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut.Enum hasLinkOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASLINKOUT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HASLINKOUT$0);
            }
            target.setEnumValue(hasLinkOut);
        }
    }
    
    /**
     * Sets (as xml) the "HasLinkOut" attribute
     */
    public void xsetHasLinkOut(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut hasLinkOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut)get_store().find_attribute_user(HASLINKOUT$0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut)get_store().add_attribute_user(HASLINKOUT$0);
            }
            target.set(hasLinkOut);
        }
    }
    
    /**
     * Unsets the "HasLinkOut" attribute
     */
    public void unsetHasLinkOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HASLINKOUT$0);
        }
    }
    
    /**
     * Gets the "HasNeighbor" attribute
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor.Enum getHasNeighbor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASNEIGHBOR$2);
            if (target == null)
            {
                return null;
            }
            return (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasNeighbor" attribute
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor xgetHasNeighbor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor)get_store().find_attribute_user(HASNEIGHBOR$2);
            return target;
        }
    }
    
    /**
     * True if has "HasNeighbor" attribute
     */
    public boolean isSetHasNeighbor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HASNEIGHBOR$2) != null;
        }
    }
    
    /**
     * Sets the "HasNeighbor" attribute
     */
    public void setHasNeighbor(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor.Enum hasNeighbor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASNEIGHBOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HASNEIGHBOR$2);
            }
            target.setEnumValue(hasNeighbor);
        }
    }
    
    /**
     * Sets (as xml) the "HasNeighbor" attribute
     */
    public void xsetHasNeighbor(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor hasNeighbor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor)get_store().find_attribute_user(HASNEIGHBOR$2);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor)get_store().add_attribute_user(HASNEIGHBOR$2);
            }
            target.set(hasNeighbor);
        }
    }
    
    /**
     * Unsets the "HasNeighbor" attribute
     */
    public void unsetHasNeighbor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HASNEIGHBOR$2);
        }
    }
    /**
     * An XML HasLinkOut(@).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType$HasLinkOut.
     */
    public static class HasLinkOutImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasLinkOut
    {
        
        public HasLinkOutImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected HasLinkOutImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML HasNeighbor(@).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType$HasNeighbor.
     */
    public static class HasNeighborImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType.HasNeighbor
    {
        
        public HasNeighborImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected HasNeighborImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
