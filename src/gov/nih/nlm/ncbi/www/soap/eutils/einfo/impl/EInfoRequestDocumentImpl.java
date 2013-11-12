/*
 * An XML document type.
 * Localname: eInfoRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo.impl;
/**
 * A document containing one eInfoRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo) element.
 *
 * This is a complex type.
 */
public class EInfoRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument
{
    
    public EInfoRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EINFOREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "eInfoRequest");
    
    
    /**
     * Gets the "eInfoRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest getEInfoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest)get_store().find_element_user(EINFOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eInfoRequest" element
     */
    public void setEInfoRequest(gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest eInfoRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest)get_store().find_element_user(EINFOREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest)get_store().add_element_user(EINFOREQUEST$0);
            }
            target.set(eInfoRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "eInfoRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest addNewEInfoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest)get_store().add_element_user(EINFOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML eInfoRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
     *
     * This is a complex type.
     */
    public static class EInfoRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestDocument.EInfoRequest
    {
        
        public EInfoRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "db");
        private static final javax.xml.namespace.QName TOOL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "tool");
        private static final javax.xml.namespace.QName EMAIL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "email");
        
        
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
