/*
 * An XML document type.
 * Localname: eSummaryResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esummary
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esummary.impl;
/**
 * A document containing one eSummaryResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary) element.
 *
 * This is a complex type.
 */
public class ESummaryResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument
{
    
    public ESummaryResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESUMMARYRESULT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "eSummaryResult");
    
    
    /**
     * Gets the "eSummaryResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult getESummaryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult)get_store().find_element_user(ESUMMARYRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eSummaryResult" element
     */
    public void setESummaryResult(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult eSummaryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult)get_store().find_element_user(ESUMMARYRESULT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult)get_store().add_element_user(ESUMMARYRESULT$0);
            }
            target.set(eSummaryResult);
        }
    }
    
    /**
     * Appends and returns a new empty "eSummaryResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult addNewESummaryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult)get_store().add_element_user(ESUMMARYRESULT$0);
            return target;
        }
    }
    /**
     * An XML eSummaryResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary).
     *
     * This is a complex type.
     */
    public static class ESummaryResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultDocument.ESummaryResult
    {
        
        public ESummaryResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERROR$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "ERROR");
        private static final javax.xml.namespace.QName DOCSUM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "DocSum");
        
        
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
         * Gets array of all "DocSum" elements
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType[] getDocSumArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DOCSUM$2, targetList);
                gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DocSum" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType getDocSumArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType)get_store().find_element_user(DOCSUM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DocSum" element
         */
        public int sizeOfDocSumArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOCSUM$2);
            }
        }
        
        /**
         * Sets array of all "DocSum" element
         */
        public void setDocSumArray(gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType[] docSumArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(docSumArray, DOCSUM$2);
            }
        }
        
        /**
         * Sets ith "DocSum" element
         */
        public void setDocSumArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType docSum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType)get_store().find_element_user(DOCSUM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(docSum);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DocSum" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType insertNewDocSum(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType)get_store().insert_element_user(DOCSUM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DocSum" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType addNewDocSum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType)get_store().add_element_user(DOCSUM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "DocSum" element
         */
        public void removeDocSum(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOCSUM$2, i);
            }
        }
    }
}
