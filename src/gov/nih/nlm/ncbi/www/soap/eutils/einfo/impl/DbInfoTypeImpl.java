/*
 * XML Type:  DbInfoType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo.impl;
/**
 * An XML DbInfoType(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
 *
 * This is a complex type.
 */
public class DbInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType
{
    
    public DbInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBNAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "DbName");
    private static final javax.xml.namespace.QName MENUNAME$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "MenuName");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "Description");
    private static final javax.xml.namespace.QName COUNT$6 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "Count");
    private static final javax.xml.namespace.QName LASTUPDATE$8 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "LastUpdate");
    private static final javax.xml.namespace.QName FIELDLIST$10 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "FieldList");
    private static final javax.xml.namespace.QName LINKLIST$12 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "LinkList");
    
    
    /**
     * Gets the "DbName" element
     */
    public java.lang.String getDbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DbName" element
     */
    public org.apache.xmlbeans.XmlString xgetDbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DbName" element
     */
    public void setDbName(java.lang.String dbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBNAME$0);
            }
            target.setStringValue(dbName);
        }
    }
    
    /**
     * Sets (as xml) the "DbName" element
     */
    public void xsetDbName(org.apache.xmlbeans.XmlString dbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DBNAME$0);
            }
            target.set(dbName);
        }
    }
    
    /**
     * Gets the "MenuName" element
     */
    public java.lang.String getMenuName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENUNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MenuName" element
     */
    public org.apache.xmlbeans.XmlString xgetMenuName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENUNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MenuName" element
     */
    public void setMenuName(java.lang.String menuName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENUNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENUNAME$2);
            }
            target.setStringValue(menuName);
        }
    }
    
    /**
     * Sets (as xml) the "MenuName" element
     */
    public void xsetMenuName(org.apache.xmlbeans.XmlString menuName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENUNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENUNAME$2);
            }
            target.set(menuName);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "Count" element
     */
    public java.lang.String getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Count" element
     */
    public org.apache.xmlbeans.XmlString xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Count" element
     */
    public void setCount(java.lang.String count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$6);
            }
            target.setStringValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "Count" element
     */
    public void xsetCount(org.apache.xmlbeans.XmlString count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNT$6);
            }
            target.set(count);
        }
    }
    
    /**
     * Gets the "LastUpdate" element
     */
    public java.lang.String getLastUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastUpdate" element
     */
    public org.apache.xmlbeans.XmlString xgetLastUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LastUpdate" element
     */
    public void setLastUpdate(java.lang.String lastUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATE$8);
            }
            target.setStringValue(lastUpdate);
        }
    }
    
    /**
     * Sets (as xml) the "LastUpdate" element
     */
    public void xsetLastUpdate(org.apache.xmlbeans.XmlString lastUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTUPDATE$8);
            }
            target.set(lastUpdate);
        }
    }
    
    /**
     * Gets the "FieldList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType getFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType)get_store().find_element_user(FIELDLIST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FieldList" element
     */
    public void setFieldList(gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType fieldList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType)get_store().find_element_user(FIELDLIST$10, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType)get_store().add_element_user(FIELDLIST$10);
            }
            target.set(fieldList);
        }
    }
    
    /**
     * Appends and returns a new empty "FieldList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType addNewFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType)get_store().add_element_user(FIELDLIST$10);
            return target;
        }
    }
    
    /**
     * Gets the "LinkList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType getLinkList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType)get_store().find_element_user(LINKLIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LinkList" element
     */
    public boolean isSetLinkList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKLIST$12) != 0;
        }
    }
    
    /**
     * Sets the "LinkList" element
     */
    public void setLinkList(gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType linkList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType)get_store().find_element_user(LINKLIST$12, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType)get_store().add_element_user(LINKLIST$12);
            }
            target.set(linkList);
        }
    }
    
    /**
     * Appends and returns a new empty "LinkList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType addNewLinkList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType)get_store().add_element_user(LINKLIST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "LinkList" element
     */
    public void unsetLinkList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKLIST$12, 0);
        }
    }
}
