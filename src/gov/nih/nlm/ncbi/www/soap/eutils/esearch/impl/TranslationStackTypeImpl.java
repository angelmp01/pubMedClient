/*
 * XML Type:  TranslationStackType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * An XML TranslationStackType(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
 *
 * This is a complex type.
 */
public class TranslationStackTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType
{
    
    public TranslationStackTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "TermSet");
    private static final javax.xml.namespace.QName OP$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "OP");
    
    
    /**
     * Gets array of all "TermSet" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType[] getTermSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TERMSET$0, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TermSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType getTermSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType)get_store().find_element_user(TERMSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TermSet" element
     */
    public int sizeOfTermSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERMSET$0);
        }
    }
    
    /**
     * Sets array of all "TermSet" element
     */
    public void setTermSetArray(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType[] termSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(termSetArray, TERMSET$0);
        }
    }
    
    /**
     * Sets ith "TermSet" element
     */
    public void setTermSetArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType termSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType)get_store().find_element_user(TERMSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(termSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TermSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType insertNewTermSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType)get_store().insert_element_user(TERMSET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TermSet" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType addNewTermSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TermSetType)get_store().add_element_user(TERMSET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TermSet" element
     */
    public void removeTermSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERMSET$0, i);
        }
    }
    
    /**
     * Gets array of all "OP" elements
     */
    public java.lang.String[] getOPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OP$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "OP" element
     */
    public java.lang.String getOPArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "OP" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OP$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "OP" element
     */
    public org.apache.xmlbeans.XmlString xgetOPArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "OP" element
     */
    public int sizeOfOPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OP$2);
        }
    }
    
    /**
     * Sets array of all "OP" element
     */
    public void setOPArray(java.lang.String[] opArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(opArray, OP$2);
        }
    }
    
    /**
     * Sets ith "OP" element
     */
    public void setOPArray(int i, java.lang.String op)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(op);
        }
    }
    
    /**
     * Sets (as xml) array of all "OP" element
     */
    public void xsetOPArray(org.apache.xmlbeans.XmlString[]opArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(opArray, OP$2);
        }
    }
    
    /**
     * Sets (as xml) ith "OP" element
     */
    public void xsetOPArray(int i, org.apache.xmlbeans.XmlString op)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(op);
        }
    }
    
    /**
     * Inserts the value as the ith "OP" element
     */
    public void insertOP(int i, java.lang.String op)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OP$2, i);
            target.setStringValue(op);
        }
    }
    
    /**
     * Appends the value as the last "OP" element
     */
    public void addOP(java.lang.String op)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OP$2);
            target.setStringValue(op);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OP" element
     */
    public org.apache.xmlbeans.XmlString insertNewOP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OP" element
     */
    public org.apache.xmlbeans.XmlString addNewOP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "OP" element
     */
    public void removeOP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OP$2, i);
        }
    }
}
