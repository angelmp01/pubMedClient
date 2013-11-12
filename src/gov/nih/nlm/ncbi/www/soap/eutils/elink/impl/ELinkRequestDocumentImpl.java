/*
 * An XML document type.
 * Localname: eLinkRequest
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * A document containing one eLinkRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public class ELinkRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument
{
    
    public ELinkRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELINKREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "eLinkRequest");
    
    
    /**
     * Gets the "eLinkRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest getELinkRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest)get_store().find_element_user(ELINKREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eLinkRequest" element
     */
    public void setELinkRequest(gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest eLinkRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest)get_store().find_element_user(ELINKREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest)get_store().add_element_user(ELINKREQUEST$0);
            }
            target.set(eLinkRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "eLinkRequest" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest addNewELinkRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest)get_store().add_element_user(ELINKREQUEST$0);
            return target;
        }
    }
    /**
     * An XML eLinkRequest(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
     *
     * This is a complex type.
     */
    public static class ELinkRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestDocument.ELinkRequest
    {
        
        public ELinkRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "db");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "id");
        private static final javax.xml.namespace.QName RELDATE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "reldate");
        private static final javax.xml.namespace.QName MINDATE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "mindate");
        private static final javax.xml.namespace.QName MAXDATE$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "maxdate");
        private static final javax.xml.namespace.QName DATETYPE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "datetype");
        private static final javax.xml.namespace.QName TERM$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "term");
        private static final javax.xml.namespace.QName DBFROM$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "dbfrom");
        private static final javax.xml.namespace.QName LINKNAME$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "linkname");
        private static final javax.xml.namespace.QName WEBENV$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "WebEnv");
        private static final javax.xml.namespace.QName QUERYKEY$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "query_key");
        private static final javax.xml.namespace.QName CMD$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "cmd");
        private static final javax.xml.namespace.QName TOOL$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "tool");
        private static final javax.xml.namespace.QName EMAIL$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "email");
        
        
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
         * Gets array of all "id" elements
         */
        public java.lang.String[] getIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ID$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "id" element
         */
        public java.lang.String getIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "id" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ID$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "id" element
         */
        public org.apache.xmlbeans.XmlString xgetIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "id" element
         */
        public int sizeOfIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$2);
            }
        }
        
        /**
         * Sets array of all "id" element
         */
        public void setIdArray(java.lang.String[] idArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(idArray, ID$2);
            }
        }
        
        /**
         * Sets ith "id" element
         */
        public void setIdArray(int i, java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) array of all "id" element
         */
        public void xsetIdArray(org.apache.xmlbeans.XmlString[]idArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(idArray, ID$2);
            }
        }
        
        /**
         * Sets (as xml) ith "id" element
         */
        public void xsetIdArray(int i, org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(id);
            }
        }
        
        /**
         * Inserts the value as the ith "id" element
         */
        public void insertId(int i, java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ID$2, i);
                target.setStringValue(id);
            }
        }
        
        /**
         * Appends the value as the last "id" element
         */
        public void addId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
                target.setStringValue(id);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "id" element
         */
        public org.apache.xmlbeans.XmlString insertNewId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ID$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "id" element
         */
        public org.apache.xmlbeans.XmlString addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "id" element
         */
        public void removeId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELDATE$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELDATE$4, 0);
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
                return get_store().count_elements(RELDATE$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELDATE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELDATE$4);
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
                get_store().remove_element(RELDATE$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINDATE$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINDATE$6, 0);
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
                return get_store().count_elements(MINDATE$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINDATE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINDATE$6);
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
                get_store().remove_element(MINDATE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDATE$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXDATE$8, 0);
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
                return get_store().count_elements(MAXDATE$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXDATE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXDATE$8);
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
                get_store().remove_element(MAXDATE$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETYPE$10, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATETYPE$10, 0);
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
                return get_store().count_elements(DATETYPE$10) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETYPE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETYPE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATETYPE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATETYPE$10);
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
                get_store().remove_element(DATETYPE$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$12, 0);
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
                return get_store().count_elements(TERM$12) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERM$12);
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
                get_store().remove_element(TERM$12, 0);
            }
        }
        
        /**
         * Gets the "dbfrom" element
         */
        public java.lang.String getDbfrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBFROM$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dbfrom" element
         */
        public org.apache.xmlbeans.XmlString xgetDbfrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBFROM$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "dbfrom" element
         */
        public boolean isSetDbfrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBFROM$14) != 0;
            }
        }
        
        /**
         * Sets the "dbfrom" element
         */
        public void setDbfrom(java.lang.String dbfrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBFROM$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBFROM$14);
                }
                target.setStringValue(dbfrom);
            }
        }
        
        /**
         * Sets (as xml) the "dbfrom" element
         */
        public void xsetDbfrom(org.apache.xmlbeans.XmlString dbfrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBFROM$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DBFROM$14);
                }
                target.set(dbfrom);
            }
        }
        
        /**
         * Unsets the "dbfrom" element
         */
        public void unsetDbfrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBFROM$14, 0);
            }
        }
        
        /**
         * Gets the "linkname" element
         */
        public java.lang.String getLinkname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKNAME$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "linkname" element
         */
        public org.apache.xmlbeans.XmlString xgetLinkname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKNAME$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "linkname" element
         */
        public boolean isSetLinkname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKNAME$16) != 0;
            }
        }
        
        /**
         * Sets the "linkname" element
         */
        public void setLinkname(java.lang.String linkname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKNAME$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKNAME$16);
                }
                target.setStringValue(linkname);
            }
        }
        
        /**
         * Sets (as xml) the "linkname" element
         */
        public void xsetLinkname(org.apache.xmlbeans.XmlString linkname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKNAME$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKNAME$16);
                }
                target.set(linkname);
            }
        }
        
        /**
         * Unsets the "linkname" element
         */
        public void unsetLinkname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKNAME$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$18, 0);
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
                return get_store().count_elements(WEBENV$18) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBENV$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBENV$18);
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
                get_store().remove_element(WEBENV$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$20, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$20, 0);
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
                return get_store().count_elements(QUERYKEY$20) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYKEY$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYKEY$20);
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
                get_store().remove_element(QUERYKEY$20, 0);
            }
        }
        
        /**
         * Gets the "cmd" element
         */
        public java.lang.String getCmd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CMD$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cmd" element
         */
        public org.apache.xmlbeans.XmlString xgetCmd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CMD$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "cmd" element
         */
        public boolean isSetCmd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CMD$22) != 0;
            }
        }
        
        /**
         * Sets the "cmd" element
         */
        public void setCmd(java.lang.String cmd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CMD$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CMD$22);
                }
                target.setStringValue(cmd);
            }
        }
        
        /**
         * Sets (as xml) the "cmd" element
         */
        public void xsetCmd(org.apache.xmlbeans.XmlString cmd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CMD$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CMD$22);
                }
                target.set(cmd);
            }
        }
        
        /**
         * Unsets the "cmd" element
         */
        public void unsetCmd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CMD$22, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$24, 0);
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
                return get_store().count_elements(TOOL$24) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOOL$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOOL$24);
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
                get_store().remove_element(TOOL$24, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$26, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$26, 0);
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
                return get_store().count_elements(EMAIL$26) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$26);
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
                get_store().remove_element(EMAIL$26, 0);
            }
        }
    }
}
