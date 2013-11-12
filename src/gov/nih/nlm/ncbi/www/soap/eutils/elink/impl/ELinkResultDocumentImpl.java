/*
 * An XML document type.
 * Localname: eLinkResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * A document containing one eLinkResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public class ELinkResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument
{
    
    public ELinkResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELINKRESULT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "eLinkResult");
    
    
    /**
     * Gets the "eLinkResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult getELinkResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult)get_store().find_element_user(ELINKRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eLinkResult" element
     */
    public void setELinkResult(gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult eLinkResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult)get_store().find_element_user(ELINKRESULT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult)get_store().add_element_user(ELINKRESULT$0);
            }
            target.set(eLinkResult);
        }
    }
    
    /**
     * Appends and returns a new empty "eLinkResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult addNewELinkResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult)get_store().add_element_user(ELINKRESULT$0);
            return target;
        }
    }
    /**
     * An XML eLinkResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
     *
     * This is a complex type.
     */
    public static class ELinkResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultDocument.ELinkResult
    {
        
        public ELinkResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINKSET$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkSet");
        private static final javax.xml.namespace.QName ERROR$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "ERROR");
        
        
        /**
         * Gets array of all "LinkSet" elements
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType[] getLinkSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINKSET$0, targetList);
                gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "LinkSet" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType getLinkSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType)get_store().find_element_user(LINKSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "LinkSet" element
         */
        public int sizeOfLinkSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKSET$0);
            }
        }
        
        /**
         * Sets array of all "LinkSet" element
         */
        public void setLinkSetArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType[] linkSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(linkSetArray, LINKSET$0);
            }
        }
        
        /**
         * Sets ith "LinkSet" element
         */
        public void setLinkSetArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType linkSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType)get_store().find_element_user(LINKSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(linkSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "LinkSet" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType insertNewLinkSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType)get_store().insert_element_user(LINKSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "LinkSet" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType addNewLinkSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType)get_store().add_element_user(LINKSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "LinkSet" element
         */
        public void removeLinkSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKSET$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$2, 0);
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
                return get_store().count_elements(ERROR$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$2);
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
                get_store().remove_element(ERROR$2, 0);
            }
        }
    }
}
