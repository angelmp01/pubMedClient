/*
 * XML Type:  FirstCharsType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML FirstCharsType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class FirstCharsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType
{
    
    public FirstCharsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRSTCHAR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "FirstChar");
    
    
    /**
     * Gets array of all "FirstChar" elements
     */
    public java.lang.String[] getFirstCharArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIRSTCHAR$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "FirstChar" element
     */
    public java.lang.String getFirstCharArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTCHAR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "FirstChar" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFirstCharArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIRSTCHAR$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "FirstChar" element
     */
    public org.apache.xmlbeans.XmlString xgetFirstCharArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTCHAR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "FirstChar" element
     */
    public int sizeOfFirstCharArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTCHAR$0);
        }
    }
    
    /**
     * Sets array of all "FirstChar" element
     */
    public void setFirstCharArray(java.lang.String[] firstCharArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(firstCharArray, FIRSTCHAR$0);
        }
    }
    
    /**
     * Sets ith "FirstChar" element
     */
    public void setFirstCharArray(int i, java.lang.String firstChar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTCHAR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(firstChar);
        }
    }
    
    /**
     * Sets (as xml) array of all "FirstChar" element
     */
    public void xsetFirstCharArray(org.apache.xmlbeans.XmlString[]firstCharArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(firstCharArray, FIRSTCHAR$0);
        }
    }
    
    /**
     * Sets (as xml) ith "FirstChar" element
     */
    public void xsetFirstCharArray(int i, org.apache.xmlbeans.XmlString firstChar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTCHAR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(firstChar);
        }
    }
    
    /**
     * Inserts the value as the ith "FirstChar" element
     */
    public void insertFirstChar(int i, java.lang.String firstChar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FIRSTCHAR$0, i);
            target.setStringValue(firstChar);
        }
    }
    
    /**
     * Appends the value as the last "FirstChar" element
     */
    public void addFirstChar(java.lang.String firstChar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTCHAR$0);
            target.setStringValue(firstChar);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FirstChar" element
     */
    public org.apache.xmlbeans.XmlString insertNewFirstChar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FIRSTCHAR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FirstChar" element
     */
    public org.apache.xmlbeans.XmlString addNewFirstChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTCHAR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FirstChar" element
     */
    public void removeFirstChar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTCHAR$0, i);
        }
    }
}
