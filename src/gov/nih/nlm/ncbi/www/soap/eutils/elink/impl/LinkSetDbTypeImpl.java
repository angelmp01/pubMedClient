/*
 * XML Type:  LinkSetDbType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML LinkSetDbType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class LinkSetDbTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType
{
    
    public LinkSetDbTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBTO$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "DbTo");
    private static final javax.xml.namespace.QName LINKNAME$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkName");
    private static final javax.xml.namespace.QName LINK$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Link");
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
     * Gets array of all "Link" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$4, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Link" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType)get_store().find_element_user(LINK$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Link" element
     */
    public int sizeOfLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$4);
        }
    }
    
    /**
     * Sets array of all "Link" element
     */
    public void setLinkArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType[] linkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$4);
        }
    }
    
    /**
     * Sets ith "Link" element
     */
    public void setLinkArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType)get_store().find_element_user(LINK$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(link);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType)get_store().insert_element_user(LINK$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType)get_store().add_element_user(LINK$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Link" element
     */
    public void removeLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$4, i);
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
     * True if has "Info" element
     */
    public boolean isSetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFO$6) != 0;
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
     * Unsets the "Info" element
     */
    public void unsetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFO$6, 0);
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
