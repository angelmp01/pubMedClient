/*
 * XML Type:  InvalidIdListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/epost
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.epost.impl;
/**
 * An XML InvalidIdListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/epost).
 *
 * This is a complex type.
 */
public class InvalidIdListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType
{
    
    public InvalidIdListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "Id");
    
    
    /**
     * Gets array of all "Id" elements
     */
    public java.lang.String[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Id" element
     */
    public java.lang.String getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Id" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Id" element
     */
    public org.apache.xmlbeans.XmlString xgetIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
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
    public void setIdArray(java.lang.String[] idArray)
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
    public void setIdArray(int i, java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) array of all "Id" element
     */
    public void xsetIdArray(org.apache.xmlbeans.XmlString[]idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Id" element
     */
    public void xsetIdArray(int i, org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(id);
        }
    }
    
    /**
     * Inserts the value as the ith "Id" element
     */
    public void insertId(int i, java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ID$0, i);
            target.setStringValue(id);
        }
    }
    
    /**
     * Appends the value as the last "Id" element
     */
    public void addId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            target.setStringValue(id);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Id" element
     */
    public org.apache.xmlbeans.XmlString insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Id" element
     */
    public org.apache.xmlbeans.XmlString addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
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
}
