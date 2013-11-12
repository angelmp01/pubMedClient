/*
 * An XML document type.
 * Localname: eInfoResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo.impl;
/**
 * A document containing one eInfoResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo) element.
 *
 * This is a complex type.
 */
public class EInfoResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument
{
    
    public EInfoResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EINFORESULT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "eInfoResult");
    
    
    /**
     * Gets the "eInfoResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult getEInfoResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult)get_store().find_element_user(EINFORESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eInfoResult" element
     */
    public void setEInfoResult(gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult eInfoResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult)get_store().find_element_user(EINFORESULT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult)get_store().add_element_user(EINFORESULT$0);
            }
            target.set(eInfoResult);
        }
    }
    
    /**
     * Appends and returns a new empty "eInfoResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult addNewEInfoResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult)get_store().add_element_user(EINFORESULT$0);
            return target;
        }
    }
    /**
     * An XML eInfoResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
     *
     * This is a complex type.
     */
    public static class EInfoResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultDocument.EInfoResult
    {
        
        public EInfoResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERROR$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "ERROR");
        private static final javax.xml.namespace.QName DBLIST$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "DbList");
        private static final javax.xml.namespace.QName DBINFO$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "DbInfo");
        
        
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
         * Gets the "DbList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType getDbList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType)get_store().find_element_user(DBLIST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DbList" element
         */
        public boolean isSetDbList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBLIST$2) != 0;
            }
        }
        
        /**
         * Sets the "DbList" element
         */
        public void setDbList(gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType dbList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType)get_store().find_element_user(DBLIST$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType)get_store().add_element_user(DBLIST$2);
                }
                target.set(dbList);
            }
        }
        
        /**
         * Appends and returns a new empty "DbList" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType addNewDbList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbListType)get_store().add_element_user(DBLIST$2);
                return target;
            }
        }
        
        /**
         * Unsets the "DbList" element
         */
        public void unsetDbList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBLIST$2, 0);
            }
        }
        
        /**
         * Gets the "DbInfo" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType getDbInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType)get_store().find_element_user(DBINFO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DbInfo" element
         */
        public boolean isSetDbInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBINFO$4) != 0;
            }
        }
        
        /**
         * Sets the "DbInfo" element
         */
        public void setDbInfo(gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType dbInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType)get_store().find_element_user(DBINFO$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType)get_store().add_element_user(DBINFO$4);
                }
                target.set(dbInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "DbInfo" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType addNewDbInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.DbInfoType)get_store().add_element_user(DBINFO$4);
                return target;
            }
        }
        
        /**
         * Unsets the "DbInfo" element
         */
        public void unsetDbInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBINFO$4, 0);
            }
        }
    }
}
