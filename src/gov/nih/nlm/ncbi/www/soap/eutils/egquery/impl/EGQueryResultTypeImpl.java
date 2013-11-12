/*
 * XML Type:  eGQueryResultType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/egquery
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.egquery.impl;
/**
 * An XML eGQueryResultType(@http://www.ncbi.nlm.nih.gov/soap/eutils/egquery).
 *
 * This is a complex type.
 */
public class EGQueryResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType
{
    
    public EGQueryResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "ERROR");
    private static final javax.xml.namespace.QName RESULTITEM$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "ResultItem");
    
    
    /**
     * Gets the "ERROR" element
     */
    public java.lang.String getERROR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, 0);
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
            return get_store().count_elements(ERROR$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$0);
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
            get_store().remove_element(ERROR$0, 0);
        }
    }
    
    /**
     * Gets array of all "ResultItem" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType[] getResultItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESULTITEM$2, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResultItem" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType getResultItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType)get_store().find_element_user(RESULTITEM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ResultItem" element
     */
    public int sizeOfResultItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTITEM$2);
        }
    }
    
    /**
     * Sets array of all "ResultItem" element
     */
    public void setResultItemArray(gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType[] resultItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resultItemArray, RESULTITEM$2);
        }
    }
    
    /**
     * Sets ith "ResultItem" element
     */
    public void setResultItemArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType resultItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType)get_store().find_element_user(RESULTITEM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resultItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResultItem" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType insertNewResultItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType)get_store().insert_element_user(RESULTITEM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResultItem" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType addNewResultItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultItemType)get_store().add_element_user(RESULTITEM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ResultItem" element
     */
    public void removeResultItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTITEM$2, i);
        }
    }
}
