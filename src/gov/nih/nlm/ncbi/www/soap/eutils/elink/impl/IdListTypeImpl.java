/*
 * XML Type:  IdListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML IdListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class IdListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType
{
    
    public IdListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Id");
    
    
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
}
