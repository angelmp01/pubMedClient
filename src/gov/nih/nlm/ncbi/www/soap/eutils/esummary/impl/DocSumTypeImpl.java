/*
 * XML Type:  DocSumType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esummary
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esummary.impl;
/**
 * An XML DocSumType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary).
 *
 * This is a complex type.
 */
public class DocSumTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType
{
    
    public DocSumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "Id");
    private static final javax.xml.namespace.QName ITEM$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "Item");
    
    
    /**
     * Gets the "Id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "Id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets array of all "Item" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$2, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Item" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType)get_store().find_element_user(ITEM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$2);
        }
    }
    
    /**
     * Sets array of all "Item" element
     */
    public void setItemArray(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType[] itemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemArray, ITEM$2);
        }
    }
    
    /**
     * Sets ith "Item" element
     */
    public void setItemArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType)get_store().find_element_user(ITEM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType)get_store().insert_element_user(ITEM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType)get_store().add_element_user(ITEM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$2, i);
        }
    }
}
