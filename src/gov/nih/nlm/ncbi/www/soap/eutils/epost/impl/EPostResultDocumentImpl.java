/*
 * An XML document type.
 * Localname: ePostResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/epost
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.epost.impl;
/**
 * A document containing one ePostResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/epost) element.
 *
 * This is a complex type.
 */
public class EPostResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument
{
    
    public EPostResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EPOSTRESULT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "ePostResult");
    
    
    /**
     * Gets the "ePostResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult getEPostResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult)get_store().find_element_user(EPOSTRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ePostResult" element
     */
    public void setEPostResult(gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult ePostResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult)get_store().find_element_user(EPOSTRESULT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult)get_store().add_element_user(EPOSTRESULT$0);
            }
            target.set(ePostResult);
        }
    }
    
    /**
     * Appends and returns a new empty "ePostResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult addNewEPostResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult)get_store().add_element_user(EPOSTRESULT$0);
            return target;
        }
    }
    /**
     * An XML ePostResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/epost).
     *
     * This is a complex type.
     */
    public static class EPostResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResultDocument.EPostResult
    {
        
        public EPostResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INVALIDIDLIST$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "InvalidIdList");
        private static final javax.xml.namespace.QName QUERYKEY$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "QueryKey");
        private static final javax.xml.namespace.QName WEBENV$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "WebEnv");
        private static final javax.xml.namespace.QName ERROR$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "ERROR");
        
        
        /**
         * Gets the "InvalidIdList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType getInvalidIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType)get_store().find_element_user(INVALIDIDLIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "InvalidIdList" element
         */
        public boolean isSetInvalidIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INVALIDIDLIST$0) != 0;
            }
        }
        
        /**
         * Sets the "InvalidIdList" element
         */
        public void setInvalidIdList(gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType invalidIdList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType)get_store().find_element_user(INVALIDIDLIST$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType)get_store().add_element_user(INVALIDIDLIST$0);
                }
                target.set(invalidIdList);
            }
        }
        
        /**
         * Appends and returns a new empty "InvalidIdList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType addNewInvalidIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.InvalidIdListType)get_store().add_element_user(INVALIDIDLIST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "InvalidIdList" element
         */
        public void unsetInvalidIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INVALIDIDLIST$0, 0);
            }
        }
        
        /**
         * Gets the "QueryKey" element
         */
        public java.lang.String getQueryKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "QueryKey" element
         */
        public org.apache.xmlbeans.XmlString xgetQueryKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "QueryKey" element
         */
        public boolean isSetQueryKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYKEY$2) != 0;
            }
        }
        
        /**
         * Sets the "QueryKey" element
         */
        public void setQueryKey(java.lang.String queryKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYKEY$2);
                }
                target.setStringValue(queryKey);
            }
        }
        
        /**
         * Sets (as xml) the "QueryKey" element
         */
        public void xsetQueryKey(org.apache.xmlbeans.XmlString queryKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYKEY$2);
                }
                target.set(queryKey);
            }
        }
        
        /**
         * Unsets the "QueryKey" element
         */
        public void unsetQueryKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYKEY$2, 0);
            }
        }
        
        /**
         * Gets the "WebEnv" element
         */
        public java.lang.String getWebEnv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WebEnv" element
         */
        public org.apache.xmlbeans.XmlString xgetWebEnv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "WebEnv" element
         */
        public boolean isSetWebEnv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBENV$4) != 0;
            }
        }
        
        /**
         * Sets the "WebEnv" element
         */
        public void setWebEnv(java.lang.String webEnv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBENV$4);
                }
                target.setStringValue(webEnv);
            }
        }
        
        /**
         * Sets (as xml) the "WebEnv" element
         */
        public void xsetWebEnv(org.apache.xmlbeans.XmlString webEnv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBENV$4);
                }
                target.set(webEnv);
            }
        }
        
        /**
         * Unsets the "WebEnv" element
         */
        public void unsetWebEnv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBENV$4, 0);
            }
        }
        
        /**
         * Gets the "ERROR" element
         */
        public java.lang.String getERROR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$6, 0);
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
                return get_store().count_elements(ERROR$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$6);
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
                get_store().remove_element(ERROR$6, 0);
            }
        }
    }
}
