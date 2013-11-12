/*
 * An XML document type.
 * Localname: eGqueryRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/egquery
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.egquery.impl;
/**
 * A document containing one eGqueryRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/egquery) element.
 *
 * This is a complex type.
 */
public class EGqueryRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument
{
    
    public EGqueryRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EGQUERYREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "eGqueryRequest");
    
    
    /**
     * Gets the "eGqueryRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest getEGqueryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest)get_store().find_element_user(EGQUERYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eGqueryRequest" element
     */
    public void setEGqueryRequest(gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest eGqueryRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest)get_store().find_element_user(EGQUERYREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest)get_store().add_element_user(EGQUERYREQUEST$0);
            }
            target.set(eGqueryRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "eGqueryRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest addNewEGqueryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest)get_store().add_element_user(EGQUERYREQUEST$0);
            return target;
        }
    }
    /**
     * An XML eGqueryRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/egquery).
     *
     * This is a complex type.
     */
    public static class EGqueryRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestDocument.EGqueryRequest
    {
        
        public EGqueryRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TERM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "term");
        private static final javax.xml.namespace.QName TOOL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "tool");
        private static final javax.xml.namespace.QName EMAIL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "email");
        
        
        /**
         * Gets the "term" element
         */
        public java.lang.String getTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$0, 0);
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
                return get_store().count_elements(TERM$0) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERM$0);
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
                get_store().remove_element(TERM$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$2, 0);
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
                return get_store().count_elements(TOOL$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOOL$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOOL$2);
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
                get_store().remove_element(TOOL$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
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
                return get_store().count_elements(EMAIL$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$4);
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
                get_store().remove_element(EMAIL$4, 0);
            }
        }
    }
}
