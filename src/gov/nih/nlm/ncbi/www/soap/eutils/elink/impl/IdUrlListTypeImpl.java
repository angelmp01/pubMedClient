/*
 * XML Type:  IdUrlListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML IdUrlListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class IdUrlListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType
{
    
    public IdUrlListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDURLSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "IdUrlSet");
    private static final javax.xml.namespace.QName FIRSTCHARS$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "FirstChars");
    
    
    /**
     * Gets array of all "IdUrlSet" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[] getIdUrlSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDURLSET$0, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdUrlSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType getIdUrlSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType)get_store().find_element_user(IDURLSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdUrlSet" element
     */
    public int sizeOfIdUrlSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDURLSET$0);
        }
    }
    
    /**
     * Sets array of all "IdUrlSet" element
     */
    public void setIdUrlSetArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[] idUrlSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idUrlSetArray, IDURLSET$0);
        }
    }
    
    /**
     * Sets ith "IdUrlSet" element
     */
    public void setIdUrlSetArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType idUrlSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType)get_store().find_element_user(IDURLSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(idUrlSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdUrlSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType insertNewIdUrlSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType)get_store().insert_element_user(IDURLSET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdUrlSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType addNewIdUrlSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType)get_store().add_element_user(IDURLSET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdUrlSet" element
     */
    public void removeIdUrlSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDURLSET$0, i);
        }
    }
    
    /**
     * Gets array of all "FirstChars" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[] getFirstCharsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIRSTCHARS$2, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FirstChars" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType getFirstCharsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType)get_store().find_element_user(FIRSTCHARS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "FirstChars" element
     */
    public int sizeOfFirstCharsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTCHARS$2);
        }
    }
    
    /**
     * Sets array of all "FirstChars" element
     */
    public void setFirstCharsArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[] firstCharsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(firstCharsArray, FIRSTCHARS$2);
        }
    }
    
    /**
     * Sets ith "FirstChars" element
     */
    public void setFirstCharsArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType firstChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType)get_store().find_element_user(FIRSTCHARS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(firstChars);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FirstChars" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType insertNewFirstChars(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType)get_store().insert_element_user(FIRSTCHARS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FirstChars" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType addNewFirstChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType)get_store().add_element_user(FIRSTCHARS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "FirstChars" element
     */
    public void removeFirstChars(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTCHARS$2, i);
        }
    }
}
