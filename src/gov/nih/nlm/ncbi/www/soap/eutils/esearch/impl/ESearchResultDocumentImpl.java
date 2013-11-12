/*
 * An XML document type.
 * Localname: eSearchResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one eSearchResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class ESearchResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument
{
    
    public ESearchResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESEARCHRESULT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "eSearchResult");
    
    
    /**
     * Gets the "eSearchResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult getESearchResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult)get_store().find_element_user(ESEARCHRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eSearchResult" element
     */
    public void setESearchResult(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult eSearchResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult)get_store().find_element_user(ESEARCHRESULT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult)get_store().add_element_user(ESEARCHRESULT$0);
            }
            target.set(eSearchResult);
        }
    }
    
    /**
     * Appends and returns a new empty "eSearchResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult addNewESearchResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult)get_store().add_element_user(ESEARCHRESULT$0);
            return target;
        }
    }
    /**
     * An XML eSearchResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
     *
     * This is a complex type.
     */
    public static class ESearchResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultDocument.ESearchResult
    {
        
        public ESearchResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERROR$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "ERROR");
        private static final javax.xml.namespace.QName COUNT$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "Count");
        private static final javax.xml.namespace.QName RETMAX$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "RetMax");
        private static final javax.xml.namespace.QName RETSTART$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "RetStart");
        private static final javax.xml.namespace.QName QUERYKEY$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "QueryKey");
        private static final javax.xml.namespace.QName WEBENV$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "WebEnv");
        private static final javax.xml.namespace.QName IDLIST$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "IdList");
        private static final javax.xml.namespace.QName TRANSLATIONSET$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "TranslationSet");
        private static final javax.xml.namespace.QName TRANSLATIONSTACK$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "TranslationStack");
        private static final javax.xml.namespace.QName QUERYTRANSLATION$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "QueryTranslation");
        private static final javax.xml.namespace.QName ERRORLIST$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "ErrorList");
        private static final javax.xml.namespace.QName WARNINGLIST$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "WarningList");
        
        
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
         * Gets the "Count" element
         */
        public java.lang.String getCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Count" element
         */
        public org.apache.xmlbeans.XmlString xgetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Count" element
         */
        public boolean isSetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNT$2) != 0;
            }
        }
        
        /**
         * Sets the "Count" element
         */
        public void setCount(java.lang.String count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$2);
                }
                target.setStringValue(count);
            }
        }
        
        /**
         * Sets (as xml) the "Count" element
         */
        public void xsetCount(org.apache.xmlbeans.XmlString count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNT$2);
                }
                target.set(count);
            }
        }
        
        /**
         * Unsets the "Count" element
         */
        public void unsetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNT$2, 0);
            }
        }
        
        /**
         * Gets the "RetMax" element
         */
        public java.lang.String getRetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETMAX$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RetMax" element
         */
        public org.apache.xmlbeans.XmlString xgetRetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETMAX$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "RetMax" element
         */
        public boolean isSetRetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETMAX$4) != 0;
            }
        }
        
        /**
         * Sets the "RetMax" element
         */
        public void setRetMax(java.lang.String retMax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETMAX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETMAX$4);
                }
                target.setStringValue(retMax);
            }
        }
        
        /**
         * Sets (as xml) the "RetMax" element
         */
        public void xsetRetMax(org.apache.xmlbeans.XmlString retMax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETMAX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETMAX$4);
                }
                target.set(retMax);
            }
        }
        
        /**
         * Unsets the "RetMax" element
         */
        public void unsetRetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETMAX$4, 0);
            }
        }
        
        /**
         * Gets the "RetStart" element
         */
        public java.lang.String getRetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETSTART$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RetStart" element
         */
        public org.apache.xmlbeans.XmlString xgetRetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETSTART$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "RetStart" element
         */
        public boolean isSetRetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETSTART$6) != 0;
            }
        }
        
        /**
         * Sets the "RetStart" element
         */
        public void setRetStart(java.lang.String retStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETSTART$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETSTART$6);
                }
                target.setStringValue(retStart);
            }
        }
        
        /**
         * Sets (as xml) the "RetStart" element
         */
        public void xsetRetStart(org.apache.xmlbeans.XmlString retStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETSTART$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETSTART$6);
                }
                target.set(retStart);
            }
        }
        
        /**
         * Unsets the "RetStart" element
         */
        public void unsetRetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETSTART$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$8, 0);
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
                return get_store().count_elements(QUERYKEY$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYKEY$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYKEY$8);
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
                get_store().remove_element(QUERYKEY$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$10, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$10, 0);
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
                return get_store().count_elements(WEBENV$10) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBENV$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBENV$10);
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
                get_store().remove_element(WEBENV$10, 0);
            }
        }
        
        /**
         * Gets the "IdList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType getIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType)get_store().find_element_user(IDLIST$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "IdList" element
         */
        public boolean isSetIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDLIST$12) != 0;
            }
        }
        
        /**
         * Sets the "IdList" element
         */
        public void setIdList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType idList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType)get_store().find_element_user(IDLIST$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType)get_store().add_element_user(IDLIST$12);
                }
                target.set(idList);
            }
        }
        
        /**
         * Appends and returns a new empty "IdList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType addNewIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType)get_store().add_element_user(IDLIST$12);
                return target;
            }
        }
        
        /**
         * Unsets the "IdList" element
         */
        public void unsetIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDLIST$12, 0);
            }
        }
        
        /**
         * Gets the "TranslationSet" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType getTranslationSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType)get_store().find_element_user(TRANSLATIONSET$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TranslationSet" element
         */
        public boolean isSetTranslationSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSLATIONSET$14) != 0;
            }
        }
        
        /**
         * Sets the "TranslationSet" element
         */
        public void setTranslationSet(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType translationSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType)get_store().find_element_user(TRANSLATIONSET$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType)get_store().add_element_user(TRANSLATIONSET$14);
                }
                target.set(translationSet);
            }
        }
        
        /**
         * Appends and returns a new empty "TranslationSet" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType addNewTranslationSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType)get_store().add_element_user(TRANSLATIONSET$14);
                return target;
            }
        }
        
        /**
         * Unsets the "TranslationSet" element
         */
        public void unsetTranslationSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSLATIONSET$14, 0);
            }
        }
        
        /**
         * Gets the "TranslationStack" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType getTranslationStack()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType)get_store().find_element_user(TRANSLATIONSTACK$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TranslationStack" element
         */
        public boolean isSetTranslationStack()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSLATIONSTACK$16) != 0;
            }
        }
        
        /**
         * Sets the "TranslationStack" element
         */
        public void setTranslationStack(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType translationStack)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType)get_store().find_element_user(TRANSLATIONSTACK$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType)get_store().add_element_user(TRANSLATIONSTACK$16);
                }
                target.set(translationStack);
            }
        }
        
        /**
         * Appends and returns a new empty "TranslationStack" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType addNewTranslationStack()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType)get_store().add_element_user(TRANSLATIONSTACK$16);
                return target;
            }
        }
        
        /**
         * Unsets the "TranslationStack" element
         */
        public void unsetTranslationStack()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSLATIONSTACK$16, 0);
            }
        }
        
        /**
         * Gets the "QueryTranslation" element
         */
        public java.lang.String getQueryTranslation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTRANSLATION$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "QueryTranslation" element
         */
        public org.apache.xmlbeans.XmlString xgetQueryTranslation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYTRANSLATION$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "QueryTranslation" element
         */
        public boolean isSetQueryTranslation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYTRANSLATION$18) != 0;
            }
        }
        
        /**
         * Sets the "QueryTranslation" element
         */
        public void setQueryTranslation(java.lang.String queryTranslation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTRANSLATION$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYTRANSLATION$18);
                }
                target.setStringValue(queryTranslation);
            }
        }
        
        /**
         * Sets (as xml) the "QueryTranslation" element
         */
        public void xsetQueryTranslation(org.apache.xmlbeans.XmlString queryTranslation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYTRANSLATION$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYTRANSLATION$18);
                }
                target.set(queryTranslation);
            }
        }
        
        /**
         * Unsets the "QueryTranslation" element
         */
        public void unsetQueryTranslation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYTRANSLATION$18, 0);
            }
        }
        
        /**
         * Gets the "ErrorList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType getErrorList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType)get_store().find_element_user(ERRORLIST$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ErrorList" element
         */
        public boolean isSetErrorList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORLIST$20) != 0;
            }
        }
        
        /**
         * Sets the "ErrorList" element
         */
        public void setErrorList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType errorList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType)get_store().find_element_user(ERRORLIST$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType)get_store().add_element_user(ERRORLIST$20);
                }
                target.set(errorList);
            }
        }
        
        /**
         * Appends and returns a new empty "ErrorList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType addNewErrorList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType)get_store().add_element_user(ERRORLIST$20);
                return target;
            }
        }
        
        /**
         * Unsets the "ErrorList" element
         */
        public void unsetErrorList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORLIST$20, 0);
            }
        }
        
        /**
         * Gets the "WarningList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType getWarningList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType)get_store().find_element_user(WARNINGLIST$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "WarningList" element
         */
        public boolean isSetWarningList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARNINGLIST$22) != 0;
            }
        }
        
        /**
         * Sets the "WarningList" element
         */
        public void setWarningList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType warningList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType)get_store().find_element_user(WARNINGLIST$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType)get_store().add_element_user(WARNINGLIST$22);
                }
                target.set(warningList);
            }
        }
        
        /**
         * Appends and returns a new empty "WarningList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType addNewWarningList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType)get_store().add_element_user(WARNINGLIST$22);
                return target;
            }
        }
        
        /**
         * Unsets the "WarningList" element
         */
        public void unsetWarningList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARNINGLIST$22, 0);
            }
        }
    }
}
