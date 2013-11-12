/*
 * An XML document type.
 * Localname: eSpellRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell.impl;
/**
 * A document containing one eSpellRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public class ESpellRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument
{
    
    public ESpellRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESPELLREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "eSpellRequest");
    
    
    /**
     * Gets the "eSpellRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest getESpellRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest)get_store().find_element_user(ESPELLREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eSpellRequest" element
     */
    public void setESpellRequest(gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest eSpellRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest)get_store().find_element_user(ESPELLREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest)get_store().add_element_user(ESPELLREQUEST$0);
            }
            target.set(eSpellRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "eSpellRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest addNewESpellRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest)get_store().add_element_user(ESPELLREQUEST$0);
            return target;
        }
    }
    /**
     * An XML eSpellRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell).
     *
     * This is a complex type.
     */
    public static class ESpellRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestDocument.ESpellRequest
    {
        
        public ESpellRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "db");
        private static final javax.xml.namespace.QName TERM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "term");
        private static final javax.xml.namespace.QName TOOL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "tool");
        private static final javax.xml.namespace.QName EMAIL$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "email");
        
        
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
         * Gets the "tool" element
         */
        public java.lang.String getTool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$4, 0);
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
                return get_store().count_elements(TOOL$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOOL$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOOL$4);
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
                get_store().remove_element(TOOL$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$6, 0);
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
                return get_store().count_elements(EMAIL$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$6);
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
                get_store().remove_element(EMAIL$6, 0);
            }
        }
    }
}
