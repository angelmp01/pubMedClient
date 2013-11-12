/*
 * XML Type:  IdCheckListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML IdCheckListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class IdCheckListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType
{
    
    public IdCheckListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Id");
    private static final javax.xml.namespace.QName IDLINKSET$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "IdLinkSet");
    private static final javax.xml.namespace.QName ERROR$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "ERROR");
    
    
    /**
     * Gets array of all "Id" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$0, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Id" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Id" element
     */
    public int sizeOfIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0);
        }
    }
    
    /**
     * Sets array of all "Id" element
     */
    public void setIdArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType[] idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$0);
        }
    }
    
    /**
     * Sets ith "Id" element
     */
    public void setIdArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(id);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Id" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().insert_element_user(ID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Id" element
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
     * Removes the ith "Id" element
     */
    public void removeId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, i);
        }
    }
    
    /**
     * Gets array of all "IdLinkSet" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType[] getIdLinkSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDLINKSET$2, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdLinkSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType getIdLinkSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType)get_store().find_element_user(IDLINKSET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdLinkSet" element
     */
    public int sizeOfIdLinkSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDLINKSET$2);
        }
    }
    
    /**
     * Sets array of all "IdLinkSet" element
     */
    public void setIdLinkSetArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType[] idLinkSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idLinkSetArray, IDLINKSET$2);
        }
    }
    
    /**
     * Sets ith "IdLinkSet" element
     */
    public void setIdLinkSetArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType idLinkSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType)get_store().find_element_user(IDLINKSET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(idLinkSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdLinkSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType insertNewIdLinkSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType)get_store().insert_element_user(IDLINKSET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdLinkSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType addNewIdLinkSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType)get_store().add_element_user(IDLINKSET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdLinkSet" element
     */
    public void removeIdLinkSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDLINKSET$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$4, 0);
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
            return get_store().count_elements(ERROR$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$4);
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
            get_store().remove_element(ERROR$4, 0);
        }
    }
}
