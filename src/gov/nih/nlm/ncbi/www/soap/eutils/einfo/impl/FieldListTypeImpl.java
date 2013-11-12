/*
 * XML Type:  FieldListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo.impl;
/**
 * An XML FieldListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
 *
 * This is a complex type.
 */
public class FieldListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldListType
{
    
    public FieldListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELD$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "Field");
    
    
    /**
     * Gets array of all "Field" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType[] getFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELD$0, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Field" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType getFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType)get_store().find_element_user(FIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Field" element
     */
    public int sizeOfFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELD$0);
        }
    }
    
    /**
     * Sets array of all "Field" element
     */
    public void setFieldArray(gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType[] fieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fieldArray, FIELD$0);
        }
    }
    
    /**
     * Sets ith "Field" element
     */
    public void setFieldArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType)get_store().find_element_user(FIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(field);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Field" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType insertNewField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType)get_store().insert_element_user(FIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Field" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType addNewField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType)get_store().add_element_user(FIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Field" element
     */
    public void removeField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELD$0, i);
        }
    }
}
