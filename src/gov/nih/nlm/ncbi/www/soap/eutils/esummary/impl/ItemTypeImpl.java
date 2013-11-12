/*
 * XML Type:  ItemType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esummary
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esummary.impl;
/**
 * An XML ItemType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary).
 *
 * This is a complex type.
 */
public class ItemTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType
{
    
    public ItemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "Item");
    private static final javax.xml.namespace.QName ITEMCONTENT$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "ItemContent");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "Type");
    
    
    /**
     * Gets array of all "Item" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$0, targetList);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType)get_store().find_element_user(ITEM$0, i);
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
            return get_store().count_elements(ITEM$0);
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
            arraySetterHelper(itemArray, ITEM$0);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType)get_store().find_element_user(ITEM$0, i);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType)get_store().insert_element_user(ITEM$0, i);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType)get_store().add_element_user(ITEM$0);
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
            get_store().remove_element(ITEM$0, i);
        }
    }
    
    /**
     * Gets the "ItemContent" element
     */
    public java.lang.String getItemContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMCONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ItemContent" element
     */
    public org.apache.xmlbeans.XmlString xgetItemContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ITEMCONTENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ItemContent" element
     */
    public boolean isSetItemContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEMCONTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "ItemContent" element
     */
    public void setItemContent(java.lang.String itemContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMCONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ITEMCONTENT$2);
            }
            target.setStringValue(itemContent);
        }
    }
    
    /**
     * Sets (as xml) the "ItemContent" element
     */
    public void xsetItemContent(org.apache.xmlbeans.XmlString itemContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ITEMCONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ITEMCONTENT$2);
            }
            target.set(itemContent);
        }
    }
    
    /**
     * Unsets the "ItemContent" element
     */
    public void unsetItemContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEMCONTENT$2, 0);
        }
    }
    
    /**
     * Gets the "Name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Sets the "Name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                return null;
            }
            return (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type)get_store().find_attribute_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type)get_store().add_attribute_user(TYPE$6);
            }
            target.set(type);
        }
    }
    /**
     * An XML Type(@).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.ItemType.Type
    {
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
