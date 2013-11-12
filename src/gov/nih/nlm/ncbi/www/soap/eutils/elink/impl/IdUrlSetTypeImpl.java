/*
 * XML Type:  IdUrlSetType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML IdUrlSetType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class IdUrlSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType
{
    
    public IdUrlSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Id");
    private static final javax.xml.namespace.QName OBJURL$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "ObjUrl");
    private static final javax.xml.namespace.QName INFO$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Info");
    
    
    /**
     * Gets the "Id" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Id" element
     */
    public void setId(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Appends and returns a new empty "Id" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().add_element_user(ID$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "ObjUrl" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType[] getObjUrlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJURL$2, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ObjUrl" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType getObjUrlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType)get_store().find_element_user(OBJURL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ObjUrl" element
     */
    public int sizeOfObjUrlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJURL$2);
        }
    }
    
    /**
     * Sets array of all "ObjUrl" element
     */
    public void setObjUrlArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType[] objUrlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objUrlArray, OBJURL$2);
        }
    }
    
    /**
     * Sets ith "ObjUrl" element
     */
    public void setObjUrlArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType objUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType)get_store().find_element_user(OBJURL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objUrl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ObjUrl" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType insertNewObjUrl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType)get_store().insert_element_user(OBJURL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ObjUrl" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType addNewObjUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType)get_store().add_element_user(OBJURL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ObjUrl" element
     */
    public void removeObjUrl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJURL$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFO$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFO$4, 0);
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
            return get_store().count_elements(INFO$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFO$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INFO$4);
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
            get_store().remove_element(INFO$4, 0);
        }
    }
}
