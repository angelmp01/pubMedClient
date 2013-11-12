/*
 * An XML document type.
 * Localname: ePostRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/epost
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.epost.impl;
/**
 * A document containing one ePostRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/epost) element.
 *
 * This is a complex type.
 */
public class EPostRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument
{
    
    public EPostRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EPOSTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "ePostRequest");
    
    
    /**
     * Gets the "ePostRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest getEPostRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest)get_store().find_element_user(EPOSTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ePostRequest" element
     */
    public void setEPostRequest(gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest ePostRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest)get_store().find_element_user(EPOSTREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest)get_store().add_element_user(EPOSTREQUEST$0);
            }
            target.set(ePostRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ePostRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest addNewEPostRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest)get_store().add_element_user(EPOSTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ePostRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/epost).
     *
     * This is a complex type.
     */
    public static class EPostRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequestDocument.EPostRequest
    {
        
        public EPostRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "db");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "id");
        private static final javax.xml.namespace.QName WEBENV$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "WebEnv");
        private static final javax.xml.namespace.QName TOOL$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "tool");
        private static final javax.xml.namespace.QName EMAIL$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "email");
        
        
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
         * Gets the "tool" element
         */
        public java.lang.String getTool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$6, 0);
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
                return get_store().count_elements(TOOL$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOOL$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOOL$6);
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
                get_store().remove_element(TOOL$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, 0);
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
                return get_store().count_elements(EMAIL$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$8);
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
                get_store().remove_element(EMAIL$8, 0);
            }
        }
    }
}
