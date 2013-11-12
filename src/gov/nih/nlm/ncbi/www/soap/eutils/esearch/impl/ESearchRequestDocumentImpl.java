/*
 * An XML document type.
 * Localname: eSearchRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one eSearchRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class ESearchRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument
{
    
    public ESearchRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESEARCHREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "eSearchRequest");
    
    
    /**
     * Gets the "eSearchRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest getESearchRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest)get_store().find_element_user(ESEARCHREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eSearchRequest" element
     */
    public void setESearchRequest(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest eSearchRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest)get_store().find_element_user(ESEARCHREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest)get_store().add_element_user(ESEARCHREQUEST$0);
            }
            target.set(eSearchRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "eSearchRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest addNewESearchRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest)get_store().add_element_user(ESEARCHREQUEST$0);
            return target;
        }
    }
    /**
     * An XML eSearchRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch).
     *
     * This is a complex type.
     */
    public static class ESearchRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestDocument.ESearchRequest
    {
        
        public ESearchRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "db");
        private static final javax.xml.namespace.QName TERM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "term");
        private static final javax.xml.namespace.QName WEBENV$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "WebEnv");
        private static final javax.xml.namespace.QName QUERYKEY$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "QueryKey");
        private static final javax.xml.namespace.QName USEHISTORY$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "usehistory");
        private static final javax.xml.namespace.QName TOOL$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "tool");
        private static final javax.xml.namespace.QName EMAIL$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "email");
        private static final javax.xml.namespace.QName FIELD$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "field");
        private static final javax.xml.namespace.QName RELDATE$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "reldate");
        private static final javax.xml.namespace.QName MINDATE$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "mindate");
        private static final javax.xml.namespace.QName MAXDATE$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "maxdate");
        private static final javax.xml.namespace.QName DATETYPE$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "datetype");
        private static final javax.xml.namespace.QName RETSTART$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "RetStart");
        private static final javax.xml.namespace.QName RETMAX$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "RetMax");
        private static final javax.xml.namespace.QName RETTYPE$28 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "rettype");
        private static final javax.xml.namespace.QName SORT$30 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "sort");
        
        
        /**
         * Gets the "db" element
         */
        public java.lang.String getDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "db" element
         */
        public org.apache.xmlbeans.XmlString xgetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "db" element
         */
        public boolean isSetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DB$0) != 0;
            }
        }
        
        /**
         * Sets the "db" element
         */
        public void setDb(java.lang.String db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DB$0);
                }
                target.setStringValue(db);
            }
        }
        
        /**
         * Sets (as xml) the "db" element
         */
        public void xsetDb(org.apache.xmlbeans.XmlString db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DB$0);
                }
                target.set(db);
            }
        }
        
        /**
         * Unsets the "db" element
         */
        public void unsetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DB$0, 0);
            }
        }
        
        /**
         * Gets the "term" element
         */
        public java.lang.String getTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "term" element
         */
        public org.apache.xmlbeans.XmlString xgetTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "term" element
         */
        public boolean isSetTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TERM$2) != 0;
            }
        }
        
        /**
         * Sets the "term" element
         */
        public void setTerm(java.lang.String term)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$2);
                }
                target.setStringValue(term);
            }
        }
        
        /**
         * Sets (as xml) the "term" element
         */
        public void xsetTerm(org.apache.xmlbeans.XmlString term)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERM$2);
                }
                target.set(term);
            }
        }
        
        /**
         * Unsets the "term" element
         */
        public void unsetTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TERM$2, 0);
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
         * Gets the "QueryKey" element
         */
        public java.lang.String getQueryKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$6, 0);
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
                return get_store().count_elements(QUERYKEY$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYKEY$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYKEY$6);
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
                get_store().remove_element(QUERYKEY$6, 0);
            }
        }
        
        /**
         * Gets the "usehistory" element
         */
        public java.lang.String getUsehistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEHISTORY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "usehistory" element
         */
        public org.apache.xmlbeans.XmlString xgetUsehistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEHISTORY$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "usehistory" element
         */
        public boolean isSetUsehistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USEHISTORY$8) != 0;
            }
        }
        
        /**
         * Sets the "usehistory" element
         */
        public void setUsehistory(java.lang.String usehistory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEHISTORY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEHISTORY$8);
                }
                target.setStringValue(usehistory);
            }
        }
        
        /**
         * Sets (as xml) the "usehistory" element
         */
        public void xsetUsehistory(org.apache.xmlbeans.XmlString usehistory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEHISTORY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEHISTORY$8);
                }
                target.set(usehistory);
            }
        }
        
        /**
         * Unsets the "usehistory" element
         */
        public void unsetUsehistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USEHISTORY$8, 0);
            }
        }
        
        /**
         * Gets the "tool" element
         */
        public java.lang.String getTool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tool" element
         */
        public org.apache.xmlbeans.XmlString xgetTool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "tool" element
         */
        public boolean isSetTool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TOOL$10) != 0;
            }
        }
        
        /**
         * Sets the "tool" element
         */
        public void setTool(java.lang.String tool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOOL$10);
                }
                target.setStringValue(tool);
            }
        }
        
        /**
         * Sets (as xml) the "tool" element
         */
        public void xsetTool(org.apache.xmlbeans.XmlString tool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOOL$10);
                }
                target.set(tool);
            }
        }
        
        /**
         * Unsets the "tool" element
         */
        public void unsetTool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TOOL$10, 0);
            }
        }
        
        /**
         * Gets the "email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "email" element
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "email" element
         */
        public boolean isSetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAIL$12) != 0;
            }
        }
        
        /**
         * Sets the "email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$12);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "email" element
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$12);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "email" element
         */
        public void unsetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAIL$12, 0);
            }
        }
        
        /**
         * Gets the "field" element
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELD$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field" element
         */
        public org.apache.xmlbeans.XmlString xgetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELD$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "field" element
         */
        public boolean isSetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELD$14) != 0;
            }
        }
        
        /**
         * Sets the "field" element
         */
        public void setField(java.lang.String field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELD$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELD$14);
                }
                target.setStringValue(field);
            }
        }
        
        /**
         * Sets (as xml) the "field" element
         */
        public void xsetField(org.apache.xmlbeans.XmlString field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELD$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELD$14);
                }
                target.set(field);
            }
        }
        
        /**
         * Unsets the "field" element
         */
        public void unsetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELD$14, 0);
            }
        }
        
        /**
         * Gets the "reldate" element
         */
        public java.lang.String getReldate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "reldate" element
         */
        public org.apache.xmlbeans.XmlString xgetReldate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELDATE$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "reldate" element
         */
        public boolean isSetReldate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELDATE$16) != 0;
            }
        }
        
        /**
         * Sets the "reldate" element
         */
        public void setReldate(java.lang.String reldate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELDATE$16);
                }
                target.setStringValue(reldate);
            }
        }
        
        /**
         * Sets (as xml) the "reldate" element
         */
        public void xsetReldate(org.apache.xmlbeans.XmlString reldate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELDATE$16);
                }
                target.set(reldate);
            }
        }
        
        /**
         * Unsets the "reldate" element
         */
        public void unsetReldate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELDATE$16, 0);
            }
        }
        
        /**
         * Gets the "mindate" element
         */
        public java.lang.String getMindate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINDATE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mindate" element
         */
        public org.apache.xmlbeans.XmlString xgetMindate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINDATE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "mindate" element
         */
        public boolean isSetMindate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MINDATE$18) != 0;
            }
        }
        
        /**
         * Sets the "mindate" element
         */
        public void setMindate(java.lang.String mindate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINDATE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINDATE$18);
                }
                target.setStringValue(mindate);
            }
        }
        
        /**
         * Sets (as xml) the "mindate" element
         */
        public void xsetMindate(org.apache.xmlbeans.XmlString mindate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINDATE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINDATE$18);
                }
                target.set(mindate);
            }
        }
        
        /**
         * Unsets the "mindate" element
         */
        public void unsetMindate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MINDATE$18, 0);
            }
        }
        
        /**
         * Gets the "maxdate" element
         */
        public java.lang.String getMaxdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDATE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxdate" element
         */
        public org.apache.xmlbeans.XmlString xgetMaxdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXDATE$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "maxdate" element
         */
        public boolean isSetMaxdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXDATE$20) != 0;
            }
        }
        
        /**
         * Sets the "maxdate" element
         */
        public void setMaxdate(java.lang.String maxdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXDATE$20);
                }
                target.setStringValue(maxdate);
            }
        }
        
        /**
         * Sets (as xml) the "maxdate" element
         */
        public void xsetMaxdate(org.apache.xmlbeans.XmlString maxdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXDATE$20);
                }
                target.set(maxdate);
            }
        }
        
        /**
         * Unsets the "maxdate" element
         */
        public void unsetMaxdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXDATE$20, 0);
            }
        }
        
        /**
         * Gets the "datetype" element
         */
        public java.lang.String getDatetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETYPE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "datetype" element
         */
        public org.apache.xmlbeans.XmlString xgetDatetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATETYPE$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "datetype" element
         */
        public boolean isSetDatetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATETYPE$22) != 0;
            }
        }
        
        /**
         * Sets the "datetype" element
         */
        public void setDatetype(java.lang.String datetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETYPE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETYPE$22);
                }
                target.setStringValue(datetype);
            }
        }
        
        /**
         * Sets (as xml) the "datetype" element
         */
        public void xsetDatetype(org.apache.xmlbeans.XmlString datetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATETYPE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATETYPE$22);
                }
                target.set(datetype);
            }
        }
        
        /**
         * Unsets the "datetype" element
         */
        public void unsetDatetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATETYPE$22, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETSTART$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETSTART$24, 0);
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
                return get_store().count_elements(RETSTART$24) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETSTART$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETSTART$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETSTART$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETSTART$24);
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
                get_store().remove_element(RETSTART$24, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETMAX$26, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETMAX$26, 0);
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
                return get_store().count_elements(RETMAX$26) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETMAX$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETMAX$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETMAX$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETMAX$26);
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
                get_store().remove_element(RETMAX$26, 0);
            }
        }
        
        /**
         * Gets the "rettype" element
         */
        public java.lang.String getRettype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETTYPE$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rettype" element
         */
        public org.apache.xmlbeans.XmlString xgetRettype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETTYPE$28, 0);
                return target;
            }
        }
        
        /**
         * True if has "rettype" element
         */
        public boolean isSetRettype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETTYPE$28) != 0;
            }
        }
        
        /**
         * Sets the "rettype" element
         */
        public void setRettype(java.lang.String rettype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETTYPE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETTYPE$28);
                }
                target.setStringValue(rettype);
            }
        }
        
        /**
         * Sets (as xml) the "rettype" element
         */
        public void xsetRettype(org.apache.xmlbeans.XmlString rettype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETTYPE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETTYPE$28);
                }
                target.set(rettype);
            }
        }
        
        /**
         * Unsets the "rettype" element
         */
        public void unsetRettype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETTYPE$28, 0);
            }
        }
        
        /**
         * Gets the "sort" element
         */
        public java.lang.String getSort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SORT$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sort" element
         */
        public org.apache.xmlbeans.XmlString xgetSort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SORT$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "sort" element
         */
        public boolean isSetSort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SORT$30) != 0;
            }
        }
        
        /**
         * Sets the "sort" element
         */
        public void setSort(java.lang.String sort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SORT$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SORT$30);
                }
                target.setStringValue(sort);
            }
        }
        
        /**
         * Sets (as xml) the "sort" element
         */
        public void xsetSort(org.apache.xmlbeans.XmlString sort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SORT$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SORT$30);
                }
                target.set(sort);
            }
        }
        
        /**
         * Unsets the "sort" element
         */
        public void unsetSort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SORT$30, 0);
            }
        }
    }
}
