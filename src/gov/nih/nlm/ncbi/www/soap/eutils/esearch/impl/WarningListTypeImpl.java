/*
 * XML Type:  WarningListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * An XML WarningListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
 *
 * This is a complex type.
 */
public class WarningListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType
{
    
    public WarningListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHRASEIGNORED$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "PhraseIgnored");
    private static final javax.xml.namespace.QName QUOTEDPHRASENOTFOUND$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "QuotedPhraseNotFound");
    private static final javax.xml.namespace.QName OUTPUTMESSAGE$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "OutputMessage");
    
    
    /**
     * Gets array of all "PhraseIgnored" elements
     */
    public java.lang.String[] getPhraseIgnoredArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHRASEIGNORED$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "PhraseIgnored" element
     */
    public java.lang.String getPhraseIgnoredArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHRASEIGNORED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "PhraseIgnored" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetPhraseIgnoredArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHRASEIGNORED$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "PhraseIgnored" element
     */
    public org.apache.xmlbeans.XmlString xgetPhraseIgnoredArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHRASEIGNORED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "PhraseIgnored" element
     */
    public int sizeOfPhraseIgnoredArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHRASEIGNORED$0);
        }
    }
    
    /**
     * Sets array of all "PhraseIgnored" element
     */
    public void setPhraseIgnoredArray(java.lang.String[] phraseIgnoredArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(phraseIgnoredArray, PHRASEIGNORED$0);
        }
    }
    
    /**
     * Sets ith "PhraseIgnored" element
     */
    public void setPhraseIgnoredArray(int i, java.lang.String phraseIgnored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHRASEIGNORED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(phraseIgnored);
        }
    }
    
    /**
     * Sets (as xml) array of all "PhraseIgnored" element
     */
    public void xsetPhraseIgnoredArray(org.apache.xmlbeans.XmlString[]phraseIgnoredArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(phraseIgnoredArray, PHRASEIGNORED$0);
        }
    }
    
    /**
     * Sets (as xml) ith "PhraseIgnored" element
     */
    public void xsetPhraseIgnoredArray(int i, org.apache.xmlbeans.XmlString phraseIgnored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHRASEIGNORED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(phraseIgnored);
        }
    }
    
    /**
     * Inserts the value as the ith "PhraseIgnored" element
     */
    public void insertPhraseIgnored(int i, java.lang.String phraseIgnored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PHRASEIGNORED$0, i);
            target.setStringValue(phraseIgnored);
        }
    }
    
    /**
     * Appends the value as the last "PhraseIgnored" element
     */
    public void addPhraseIgnored(java.lang.String phraseIgnored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHRASEIGNORED$0);
            target.setStringValue(phraseIgnored);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhraseIgnored" element
     */
    public org.apache.xmlbeans.XmlString insertNewPhraseIgnored(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PHRASEIGNORED$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PhraseIgnored" element
     */
    public org.apache.xmlbeans.XmlString addNewPhraseIgnored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHRASEIGNORED$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PhraseIgnored" element
     */
    public void removePhraseIgnored(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHRASEIGNORED$0, i);
        }
    }
    
    /**
     * Gets array of all "QuotedPhraseNotFound" elements
     */
    public java.lang.String[] getQuotedPhraseNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUOTEDPHRASENOTFOUND$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "QuotedPhraseNotFound" element
     */
    public java.lang.String getQuotedPhraseNotFoundArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEDPHRASENOTFOUND$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "QuotedPhraseNotFound" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetQuotedPhraseNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUOTEDPHRASENOTFOUND$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "QuotedPhraseNotFound" element
     */
    public org.apache.xmlbeans.XmlString xgetQuotedPhraseNotFoundArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUOTEDPHRASENOTFOUND$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "QuotedPhraseNotFound" element
     */
    public int sizeOfQuotedPhraseNotFoundArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUOTEDPHRASENOTFOUND$2);
        }
    }
    
    /**
     * Sets array of all "QuotedPhraseNotFound" element
     */
    public void setQuotedPhraseNotFoundArray(java.lang.String[] quotedPhraseNotFoundArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(quotedPhraseNotFoundArray, QUOTEDPHRASENOTFOUND$2);
        }
    }
    
    /**
     * Sets ith "QuotedPhraseNotFound" element
     */
    public void setQuotedPhraseNotFoundArray(int i, java.lang.String quotedPhraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEDPHRASENOTFOUND$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(quotedPhraseNotFound);
        }
    }
    
    /**
     * Sets (as xml) array of all "QuotedPhraseNotFound" element
     */
    public void xsetQuotedPhraseNotFoundArray(org.apache.xmlbeans.XmlString[]quotedPhraseNotFoundArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(quotedPhraseNotFoundArray, QUOTEDPHRASENOTFOUND$2);
        }
    }
    
    /**
     * Sets (as xml) ith "QuotedPhraseNotFound" element
     */
    public void xsetQuotedPhraseNotFoundArray(int i, org.apache.xmlbeans.XmlString quotedPhraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUOTEDPHRASENOTFOUND$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(quotedPhraseNotFound);
        }
    }
    
    /**
     * Inserts the value as the ith "QuotedPhraseNotFound" element
     */
    public void insertQuotedPhraseNotFound(int i, java.lang.String quotedPhraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(QUOTEDPHRASENOTFOUND$2, i);
            target.setStringValue(quotedPhraseNotFound);
        }
    }
    
    /**
     * Appends the value as the last "QuotedPhraseNotFound" element
     */
    public void addQuotedPhraseNotFound(java.lang.String quotedPhraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUOTEDPHRASENOTFOUND$2);
            target.setStringValue(quotedPhraseNotFound);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuotedPhraseNotFound" element
     */
    public org.apache.xmlbeans.XmlString insertNewQuotedPhraseNotFound(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(QUOTEDPHRASENOTFOUND$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuotedPhraseNotFound" element
     */
    public org.apache.xmlbeans.XmlString addNewQuotedPhraseNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUOTEDPHRASENOTFOUND$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuotedPhraseNotFound" element
     */
    public void removeQuotedPhraseNotFound(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUOTEDPHRASENOTFOUND$2, i);
        }
    }
    
    /**
     * Gets array of all "OutputMessage" elements
     */
    public java.lang.String[] getOutputMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUTMESSAGE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "OutputMessage" element
     */
    public java.lang.String getOutputMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTMESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "OutputMessage" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOutputMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUTMESSAGE$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "OutputMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetOutputMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTPUTMESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "OutputMessage" element
     */
    public int sizeOfOutputMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTMESSAGE$4);
        }
    }
    
    /**
     * Sets array of all "OutputMessage" element
     */
    public void setOutputMessageArray(java.lang.String[] outputMessageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputMessageArray, OUTPUTMESSAGE$4);
        }
    }
    
    /**
     * Sets ith "OutputMessage" element
     */
    public void setOutputMessageArray(int i, java.lang.String outputMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTMESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(outputMessage);
        }
    }
    
    /**
     * Sets (as xml) array of all "OutputMessage" element
     */
    public void xsetOutputMessageArray(org.apache.xmlbeans.XmlString[]outputMessageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputMessageArray, OUTPUTMESSAGE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "OutputMessage" element
     */
    public void xsetOutputMessageArray(int i, org.apache.xmlbeans.XmlString outputMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTPUTMESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outputMessage);
        }
    }
    
    /**
     * Inserts the value as the ith "OutputMessage" element
     */
    public void insertOutputMessage(int i, java.lang.String outputMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OUTPUTMESSAGE$4, i);
            target.setStringValue(outputMessage);
        }
    }
    
    /**
     * Appends the value as the last "OutputMessage" element
     */
    public void addOutputMessage(java.lang.String outputMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTPUTMESSAGE$4);
            target.setStringValue(outputMessage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OutputMessage" element
     */
    public org.apache.xmlbeans.XmlString insertNewOutputMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OUTPUTMESSAGE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OutputMessage" element
     */
    public org.apache.xmlbeans.XmlString addNewOutputMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTPUTMESSAGE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "OutputMessage" element
     */
    public void removeOutputMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTMESSAGE$4, i);
        }
    }
}
