/*
 * XML Type:  LinkSetDbHistoryType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML LinkSetDbHistoryType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class LinkSetDbHistoryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType
{
    
    public LinkSetDbHistoryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBTO$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "DbTo");
    private static final javax.xml.namespace.QName LINKNAME$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkName");
    private static final javax.xml.namespace.QName QUERYKEY$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "QueryKey");
    private static final javax.xml.namespace.QName INFO$6 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Info");
    private static final javax.xml.namespace.QName ERROR$8 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "ERROR");
    
    
    /**
     * Gets the "DbTo" element
     */
    public java.lang.String getDbTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DbTo" element
     */
    public org.apache.xmlbeans.XmlString xgetDbTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DbTo" element
     */
    public void setDbTo(java.lang.String dbTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBTO$0);
            }
            target.setStringValue(dbTo);
        }
    }
    
    /**
     * Sets (as xml) the "DbTo" element
     */
    public void xsetDbTo(org.apache.xmlbeans.XmlString dbTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DBTO$0);
            }
            target.set(dbTo);
        }
    }
    
    /**
     * Gets the "LinkName" element
     */
    public java.lang.String getLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LinkName" element
     */
    public void setLinkName(java.lang.String linkName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKNAME$2);
            }
            target.setStringValue(linkName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkName" element
     */
    public void xsetLinkName(org.apache.xmlbeans.XmlString linkName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKNAME$2);
            }
            target.set(linkName);
        }
    }
    
    /**
     * Gets the "QueryKey" element
     */
    public java.lang.String getQueryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryKey" element
     */
    public org.apache.xmlbeans.XmlString xgetQueryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QueryKey" element
     */
    public void setQueryKey(java.lang.String queryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYKEY$4);
            }
            target.setStringValue(queryKey);
        }
    }
    
    /**
     * Sets (as xml) the "QueryKey" element
     */
    public void xsetQueryKey(org.apache.xmlbeans.XmlString queryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYKEY$4);
            }
            target.set(queryKey);
        }
    }
    
    /**
     * Gets the "Info" element
     */
    public java.lang.String getInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Info" element
     */
    public org.apache.xmlbeans.XmlString xgetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Info" element
     */
    public void setInfo(java.lang.String info)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFO$6);
            }
            target.setStringValue(info);
        }
    }
    
    /**
     * Sets (as xml) the "Info" element
     */
    public void xsetInfo(org.apache.xmlbeans.XmlString info)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INFO$6);
            }
            target.set(info);
        }
    }
    
    /**
     * Gets the "ERROR" element
     */
    public java.lang.String getERROR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ERROR" element
     */
    public org.apache.xmlbeans.XmlString xgetERROR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ERROR" element
     */
    public boolean isSetERROR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$8) != 0;
        }
    }
    
    /**
     * Sets the "ERROR" element
     */
    public void setERROR(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$8);
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) the "ERROR" element
     */
    public void xsetERROR(org.apache.xmlbeans.XmlString error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$8);
            }
            target.set(error);
        }
    }
    
    /**
     * Unsets the "ERROR" element
     */
    public void unsetERROR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$8, 0);
        }
    }
}
