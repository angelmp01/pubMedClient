/*
 * XML Type:  TranslationSetType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * An XML TranslationSetType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
 *
 * This is a complex type.
 */
public class TranslationSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType
{
    
    public TranslationSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSLATION$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "Translation");
    
    
    /**
     * Gets array of all "Translation" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType[] getTranslationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSLATION$0, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Translation" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType getTranslationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType)get_store().find_element_user(TRANSLATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Translation" element
     */
    public int sizeOfTranslationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSLATION$0);
        }
    }
    
    /**
     * Sets array of all "Translation" element
     */
    public void setTranslationArray(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType[] translationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(translationArray, TRANSLATION$0);
        }
    }
    
    /**
     * Sets ith "Translation" element
     */
    public void setTranslationArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType translation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType)get_store().find_element_user(TRANSLATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(translation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Translation" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType insertNewTranslation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType)get_store().insert_element_user(TRANSLATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Translation" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType addNewTranslation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType)get_store().add_element_user(TRANSLATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Translation" element
     */
    public void removeTranslation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSLATION$0, i);
        }
    }
}
