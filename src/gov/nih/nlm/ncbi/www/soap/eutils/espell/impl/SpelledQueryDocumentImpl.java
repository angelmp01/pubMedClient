/*
 * An XML document type.
 * Localname: SpelledQuery
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell.impl;
/**
 * A document containing one SpelledQuery(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public class SpelledQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument
{
    
    public SpelledQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPELLEDQUERY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "SpelledQuery");
    
    
    /**
     * Gets the "SpelledQuery" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery getSpelledQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery)get_store().find_element_user(SPELLEDQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SpelledQuery" element
     */
    public void setSpelledQuery(gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery spelledQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery)get_store().find_element_user(SPELLEDQUERY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery)get_store().add_element_user(SPELLEDQUERY$0);
            }
            target.set(spelledQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "SpelledQuery" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery addNewSpelledQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery)get_store().add_element_user(SPELLEDQUERY$0);
            return target;
        }
    }
    /**
     * An XML SpelledQuery(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell).
     *
     * This is a complex type.
     */
    public static class SpelledQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery
    {
        
        public SpelledQueryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPLACED$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "Replaced");
        private static final javax.xml.namespace.QName ORIGINAL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "Original");
        
        
        /**
         * Gets array of all "Replaced" elements
         */
        public java.lang.String[] getReplacedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPLACED$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "Replaced" element
         */
        public java.lang.String getReplacedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "Replaced" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetReplacedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPLACED$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "Replaced" element
         */
        public org.apache.xmlbeans.XmlString xgetReplacedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLACED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "Replaced" element
         */
        public int sizeOfReplacedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPLACED$0);
            }
        }
        
        /**
         * Sets array of all "Replaced" element
         */
        public void setReplacedArray(java.lang.String[] replacedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(replacedArray, REPLACED$0);
            }
        }
        
        /**
         * Sets ith "Replaced" element
         */
        public void setReplacedArray(int i, java.lang.String replaced)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(replaced);
            }
        }
        
        /**
         * Sets (as xml) array of all "Replaced" element
         */
        public void xsetReplacedArray(org.apache.xmlbeans.XmlString[]replacedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(replacedArray, REPLACED$0);
            }
        }
        
        /**
         * Sets (as xml) ith "Replaced" element
         */
        public void xsetReplacedArray(int i, org.apache.xmlbeans.XmlString replaced)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLACED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(replaced);
            }
        }
        
        /**
         * Inserts the value as the ith "Replaced" element
         */
        public void insertReplaced(int i, java.lang.String replaced)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REPLACED$0, i);
                target.setStringValue(replaced);
            }
        }
        
        /**
         * Appends the value as the last "Replaced" element
         */
        public void addReplaced(java.lang.String replaced)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLACED$0);
                target.setStringValue(replaced);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Replaced" element
         */
        public org.apache.xmlbeans.XmlString insertNewReplaced(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(REPLACED$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Replaced" element
         */
        public org.apache.xmlbeans.XmlString addNewReplaced()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLACED$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Replaced" element
         */
        public void removeReplaced(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPLACED$0, i);
            }
        }
        
        /**
         * Gets array of all "Original" elements
         */
        public java.lang.String[] getOriginalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORIGINAL$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "Original" element
         */
        public java.lang.String getOriginalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINAL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "Original" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetOriginalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORIGINAL$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "Original" element
         */
        public org.apache.xmlbeans.XmlString xgetOriginalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINAL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "Original" element
         */
        public int sizeOfOriginalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORIGINAL$2);
            }
        }
        
        /**
         * Sets array of all "Original" element
         */
        public void setOriginalArray(java.lang.String[] originalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(originalArray, ORIGINAL$2);
            }
        }
        
        /**
         * Sets ith "Original" element
         */
        public void setOriginalArray(int i, java.lang.String original)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINAL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(original);
            }
        }
        
        /**
         * Sets (as xml) array of all "Original" element
         */
        public void xsetOriginalArray(org.apache.xmlbeans.XmlString[]originalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(originalArray, ORIGINAL$2);
            }
        }
        
        /**
         * Sets (as xml) ith "Original" element
         */
        public void xsetOriginalArray(int i, org.apache.xmlbeans.XmlString original)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINAL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(original);
            }
        }
        
        /**
         * Inserts the value as the ith "Original" element
         */
        public void insertOriginal(int i, java.lang.String original)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ORIGINAL$2, i);
                target.setStringValue(original);
            }
        }
        
        /**
         * Appends the value as the last "Original" element
         */
        public void addOriginal(java.lang.String original)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINAL$2);
                target.setStringValue(original);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Original" element
         */
        public org.apache.xmlbeans.XmlString insertNewOriginal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ORIGINAL$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Original" element
         */
        public org.apache.xmlbeans.XmlString addNewOriginal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGINAL$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Original" element
         */
        public void removeOriginal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORIGINAL$2, i);
            }
        }
    }
}
