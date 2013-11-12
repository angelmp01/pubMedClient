/*
 * An XML document type.
 * Localname: eSummaryRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esummary
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esummary.impl;
/**
 * A document containing one eSummaryRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary) element.
 *
 * This is a complex type.
 */
public class ESummaryRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument
{
    
    public ESummaryRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESUMMARYREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "eSummaryRequest");
    
    
    /**
     * Gets the "eSummaryRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest getESummaryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest)get_store().find_element_user(ESUMMARYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eSummaryRequest" element
     */
    public void setESummaryRequest(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest eSummaryRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest)get_store().find_element_user(ESUMMARYREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest)get_store().add_element_user(ESUMMARYREQUEST$0);
            }
            target.set(eSummaryRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "eSummaryRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest addNewESummaryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest)get_store().add_element_user(ESUMMARYREQUEST$0);
            return target;
        }
    }
    /**
     * An XML eSummaryRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary).
     *
     * This is a complex type.
     */
    public static class ESummaryRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestDocument.ESummaryRequest
    {
        
        public ESummaryRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "db");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "id");
        private static final javax.xml.namespace.QName WEBENV$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "WebEnv");
        private static final javax.xml.namespace.QName QUERYKEY$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "query_key");
        private static final javax.xml.namespace.QName RETSTART$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "retstart");
        private static final javax.xml.namespace.QName RETMAX$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "retmax");
        private static final javax.xml.namespace.QName TOOL$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "tool");
        private static final javax.xml.namespace.QName EMAIL$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "email");
        
        
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
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$2) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$2);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$2, 0);
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
         * Gets the "query_key" element
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
         * Gets (as xml) the "query_key" element
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
         * True if has "query_key" element
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
         * Sets the "query_key" element
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
         * Sets (as xml) the "query_key" element
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
         * Unsets the "query_key" element
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
         * Gets the "retstart" element
         */
        public java.lang.String getRetstart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETSTART$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "retstart" element
         */
        public org.apache.xmlbeans.XmlString xgetRetstart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETSTART$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "retstart" element
         */
        public boolean isSetRetstart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETSTART$8) != 0;
            }
        }
        
        /**
         * Sets the "retstart" element
         */
        public void setRetstart(java.lang.String retstart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETSTART$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETSTART$8);
                }
                target.setStringValue(retstart);
            }
        }
        
        /**
         * Sets (as xml) the "retstart" element
         */
        public void xsetRetstart(org.apache.xmlbeans.XmlString retstart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETSTART$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETSTART$8);
                }
                target.set(retstart);
            }
        }
        
        /**
         * Unsets the "retstart" element
         */
        public void unsetRetstart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETSTART$8, 0);
            }
        }
        
        /**
         * Gets the "retmax" element
         */
        public java.lang.String getRetmax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETMAX$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "retmax" element
         */
        public org.apache.xmlbeans.XmlString xgetRetmax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETMAX$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "retmax" element
         */
        public boolean isSetRetmax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETMAX$10) != 0;
            }
        }
        
        /**
         * Sets the "retmax" element
         */
        public void setRetmax(java.lang.String retmax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETMAX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETMAX$10);
                }
                target.setStringValue(retmax);
            }
        }
        
        /**
         * Sets (as xml) the "retmax" element
         */
        public void xsetRetmax(org.apache.xmlbeans.XmlString retmax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETMAX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETMAX$10);
                }
                target.set(retmax);
            }
        }
        
        /**
         * Unsets the "retmax" element
         */
        public void unsetRetmax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETMAX$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$12, 0);
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
                return get_store().count_elements(TOOL$12) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOOL$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOOL$12);
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
                get_store().remove_element(TOOL$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$14, 0);
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
                return get_store().count_elements(EMAIL$14) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$14);
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
                get_store().remove_element(EMAIL$14, 0);
            }
        }
    }
}
