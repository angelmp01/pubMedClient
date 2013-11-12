/*
 * XML Type:  ErrorListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * An XML ErrorListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
 *
 * This is a complex type.
 */
public class ErrorListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType
{
    
    public ErrorListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHRASENOTFOUND$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "PhraseNotFound");
    private static final javax.xml.namespace.QName FIELDNOTFOUND$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "FieldNotFound");
    
    
    /**
     * Gets array of all "PhraseNotFound" elements
     */
    public java.lang.String[] getPhraseNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHRASENOTFOUND$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "PhraseNotFound" element
     */
    public java.lang.String getPhraseNotFoundArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHRASENOTFOUND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "PhraseNotFound" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetPhraseNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHRASENOTFOUND$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "PhraseNotFound" element
     */
    public org.apache.xmlbeans.XmlString xgetPhraseNotFoundArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHRASENOTFOUND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "PhraseNotFound" element
     */
    public int sizeOfPhraseNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHRASENOTFOUND$0);
        }
    }
    
    /**
     * Sets array of all "PhraseNotFound" element
     */
    public void setPhraseNotFoundArray(java.lang.String[] phraseNotFoundArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(phraseNotFoundArray, PHRASENOTFOUND$0);
        }
    }
    
    /**
     * Sets ith "PhraseNotFound" element
     */
    public void setPhraseNotFoundArray(int i, java.lang.String phraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHRASENOTFOUND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(phraseNotFound);
        }
    }
    
    /**
     * Sets (as xml) array of all "PhraseNotFound" element
     */
    public void xsetPhraseNotFoundArray(org.apache.xmlbeans.XmlString[]phraseNotFoundArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(phraseNotFoundArray, PHRASENOTFOUND$0);
        }
    }
    
    /**
     * Sets (as xml) ith "PhraseNotFound" element
     */
    public void xsetPhraseNotFoundArray(int i, org.apache.xmlbeans.XmlString phraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHRASENOTFOUND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(phraseNotFound);
        }
    }
    
    /**
     * Inserts the value as the ith "PhraseNotFound" element
     */
    public void insertPhraseNotFound(int i, java.lang.String phraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PHRASENOTFOUND$0, i);
            target.setStringValue(phraseNotFound);
        }
    }
    
    /**
     * Appends the value as the last "PhraseNotFound" element
     */
    public void addPhraseNotFound(java.lang.String phraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHRASENOTFOUND$0);
            target.setStringValue(phraseNotFound);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhraseNotFound" element
     */
    public org.apache.xmlbeans.XmlString insertNewPhraseNotFound(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PHRASENOTFOUND$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PhraseNotFound" element
     */
    public org.apache.xmlbeans.XmlString addNewPhraseNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHRASENOTFOUND$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PhraseNotFound" element
     */
    public void removePhraseNotFound(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHRASENOTFOUND$0, i);
        }
    }
    
    /**
     * Gets array of all "FieldNotFound" elements
     */
    public java.lang.String[] getFieldNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELDNOTFOUND$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "FieldNotFound" element
     */
    public java.lang.String getFieldNotFoundArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNOTFOUND$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "FieldNotFound" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFieldNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELDNOTFOUND$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "FieldNotFound" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldNotFoundArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNOTFOUND$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "FieldNotFound" element
     */
    public int sizeOfFieldNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDNOTFOUND$2);
        }
    }
    
    /**
     * Sets array of all "FieldNotFound" element
     */
    public void setFieldNotFoundArray(java.lang.String[] fieldNotFoundArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fieldNotFoundArray, FIELDNOTFOUND$2);
        }
    }
    
    /**
     * Sets ith "FieldNotFound" element
     */
    public void setFieldNotFoundArray(int i, java.lang.String fieldNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNOTFOUND$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fieldNotFound);
        }
    }
    
    /**
     * Sets (as xml) array of all "FieldNotFound" element
     */
    public void xsetFieldNotFoundArray(org.apache.xmlbeans.XmlString[]fieldNotFoundArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fieldNotFoundArray, FIELDNOTFOUND$2);
        }
    }
    
    /**
     * Sets (as xml) ith "FieldNotFound" element
     */
    public void xsetFieldNotFoundArray(int i, org.apache.xmlbeans.XmlString fieldNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNOTFOUND$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fieldNotFound);
        }
    }
    
    /**
     * Inserts the value as the ith "FieldNotFound" element
     */
    public void insertFieldNotFound(int i, java.lang.String fieldNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FIELDNOTFOUND$2, i);
            target.setStringValue(fieldNotFound);
        }
    }
    
    /**
     * Appends the value as the last "FieldNotFound" element
     */
    public void addFieldNotFound(java.lang.String fieldNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDNOTFOUND$2);
            target.setStringValue(fieldNotFound);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FieldNotFound" element
     */
    public org.apache.xmlbeans.XmlString insertNewFieldNotFound(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FIELDNOTFOUND$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FieldNotFound" element
     */
    public org.apache.xmlbeans.XmlString addNewFieldNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDNOTFOUND$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "FieldNotFound" element
     */
    public void removeFieldNotFound(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDNOTFOUND$2, i);
        }
    }
}
