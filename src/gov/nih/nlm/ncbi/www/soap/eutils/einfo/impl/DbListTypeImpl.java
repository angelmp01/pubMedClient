/*
 * XML Type:  DbListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo.impl;
/**
 * An XML DbListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
 *
 * This is a complex type.
 */
public class DbListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType
{
    
    public DbListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBNAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "DbName");
    
    
    /**
     * Gets array of all "DbName" elements
     */
    public java.lang.String[] getDbNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DBNAME$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DbName" element
     */
    public java.lang.String getDbNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DbName" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDbNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DBNAME$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DbName" element
     */
    public org.apache.xmlbeans.XmlString xgetDbNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "DbName" element
     */
    public int sizeOfDbNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DBNAME$0);
        }
    }
    
    /**
     * Sets array of all "DbName" element
     */
    public void setDbNameArray(java.lang.String[] dbNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dbNameArray, DBNAME$0);
        }
    }
    
    /**
     * Sets ith "DbName" element
     */
    public void setDbNameArray(int i, java.lang.String dbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dbName);
        }
    }
    
    /**
     * Sets (as xml) array of all "DbName" element
     */
    public void xsetDbNameArray(org.apache.xmlbeans.XmlString[]dbNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dbNameArray, DBNAME$0);
        }
    }
    
    /**
     * Sets (as xml) ith "DbName" element
     */
    public void xsetDbNameArray(int i, org.apache.xmlbeans.XmlString dbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dbName);
        }
    }
    
    /**
     * Inserts the value as the ith "DbName" element
     */
    public void insertDbName(int i, java.lang.String dbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DBNAME$0, i);
            target.setStringValue(dbName);
        }
    }
    
    /**
     * Appends the value as the last "DbName" element
     */
    public void addDbName(java.lang.String dbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBNAME$0);
            target.setStringValue(dbName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DbName" element
     */
    public org.apache.xmlbeans.XmlString insertNewDbName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DBNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DbName" element
     */
    public org.apache.xmlbeans.XmlString addNewDbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DBNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DbName" element
     */
    public void removeDbName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DBNAME$0, i);
        }
    }
}
