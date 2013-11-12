/*
 * XML Type:  LinkSetType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML LinkSetType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class LinkSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType
{
    
    public LinkSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBFROM$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "DbFrom");
    private static final javax.xml.namespace.QName IDLIST$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "IdList");
    private static final javax.xml.namespace.QName LINKSETDB$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkSetDb");
    private static final javax.xml.namespace.QName LINKSETDBHISTORY$6 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkSetDbHistory");
    private static final javax.xml.namespace.QName WEBENV$8 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "WebEnv");
    private static final javax.xml.namespace.QName IDURLLIST$10 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "IdUrlList");
    private static final javax.xml.namespace.QName IDCHECKLIST$12 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "IdCheckList");
    private static final javax.xml.namespace.QName ERROR$14 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "ERROR");
    
    
    /**
     * Gets the "DbFrom" element
     */
    public java.lang.String getDbFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DbFrom" element
     */
    public org.apache.xmlbeans.XmlString xgetDbFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DbFrom" element
     */
    public void setDbFrom(java.lang.String dbFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBFROM$0);
            }
            target.setStringValue(dbFrom);
        }
    }
    
    /**
     * Sets (as xml) the "DbFrom" element
     */
    public void xsetDbFrom(org.apache.xmlbeans.XmlString dbFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DBFROM$0);
            }
            target.set(dbFrom);
        }
    }
    
    /**
     * Gets the "IdList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType getIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType)get_store().find_element_user(IDLIST$2, 0);
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
            return get_store().count_elements(IDLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "IdList" element
     */
    public void setIdList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType idList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType)get_store().find_element_user(IDLIST$2, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType)get_store().add_element_user(IDLIST$2);
            }
            target.set(idList);
        }
    }
    
    /**
     * Appends and returns a new empty "IdList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType addNewIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType)get_store().add_element_user(IDLIST$2);
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
            get_store().remove_element(IDLIST$2, 0);
        }
    }
    
    /**
     * Gets array of all "LinkSetDb" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] getLinkSetDbArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKSETDB$4, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LinkSetDb" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType getLinkSetDbArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType)get_store().find_element_user(LINKSETDB$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LinkSetDb" element
     */
    public int sizeOfLinkSetDbArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKSETDB$4);
        }
    }
    
    /**
     * Sets array of all "LinkSetDb" element
     */
    public void setLinkSetDbArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] linkSetDbArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkSetDbArray, LINKSETDB$4);
        }
    }
    
    /**
     * Sets ith "LinkSetDb" element
     */
    public void setLinkSetDbArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType linkSetDb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType)get_store().find_element_user(LINKSETDB$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkSetDb);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LinkSetDb" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType insertNewLinkSetDb(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType)get_store().insert_element_user(LINKSETDB$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LinkSetDb" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType addNewLinkSetDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType)get_store().add_element_user(LINKSETDB$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "LinkSetDb" element
     */
    public void removeLinkSetDb(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKSETDB$4, i);
        }
    }
    
    /**
     * Gets array of all "LinkSetDbHistory" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] getLinkSetDbHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKSETDBHISTORY$6, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LinkSetDbHistory" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType getLinkSetDbHistoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType)get_store().find_element_user(LINKSETDBHISTORY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LinkSetDbHistory" element
     */
    public int sizeOfLinkSetDbHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKSETDBHISTORY$6);
        }
    }
    
    /**
     * Sets array of all "LinkSetDbHistory" element
     */
    public void setLinkSetDbHistoryArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] linkSetDbHistoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkSetDbHistoryArray, LINKSETDBHISTORY$6);
        }
    }
    
    /**
     * Sets ith "LinkSetDbHistory" element
     */
    public void setLinkSetDbHistoryArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType linkSetDbHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType)get_store().find_element_user(LINKSETDBHISTORY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkSetDbHistory);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LinkSetDbHistory" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType insertNewLinkSetDbHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType)get_store().insert_element_user(LINKSETDBHISTORY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LinkSetDbHistory" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType addNewLinkSetDbHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType)get_store().add_element_user(LINKSETDBHISTORY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "LinkSetDbHistory" element
     */
    public void removeLinkSetDbHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKSETDBHISTORY$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$8, 0);
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
            return get_store().count_elements(WEBENV$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBENV$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBENV$8);
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
            get_store().remove_element(WEBENV$8, 0);
        }
    }
    
    /**
     * Gets the "IdUrlList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType getIdUrlList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType)get_store().find_element_user(IDURLLIST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdUrlList" element
     */
    public boolean isSetIdUrlList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDURLLIST$10) != 0;
        }
    }
    
    /**
     * Sets the "IdUrlList" element
     */
    public void setIdUrlList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType idUrlList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType)get_store().find_element_user(IDURLLIST$10, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType)get_store().add_element_user(IDURLLIST$10);
            }
            target.set(idUrlList);
        }
    }
    
    /**
     * Appends and returns a new empty "IdUrlList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType addNewIdUrlList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType)get_store().add_element_user(IDURLLIST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "IdUrlList" element
     */
    public void unsetIdUrlList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDURLLIST$10, 0);
        }
    }
    
    /**
     * Gets the "IdCheckList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType getIdCheckList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType)get_store().find_element_user(IDCHECKLIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdCheckList" element
     */
    public boolean isSetIdCheckList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDCHECKLIST$12) != 0;
        }
    }
    
    /**
     * Sets the "IdCheckList" element
     */
    public void setIdCheckList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType idCheckList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType)get_store().find_element_user(IDCHECKLIST$12, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType)get_store().add_element_user(IDCHECKLIST$12);
            }
            target.set(idCheckList);
        }
    }
    
    /**
     * Appends and returns a new empty "IdCheckList" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType addNewIdCheckList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType)get_store().add_element_user(IDCHECKLIST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "IdCheckList" element
     */
    public void unsetIdCheckList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDCHECKLIST$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$14, 0);
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
            return get_store().count_elements(ERROR$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$14);
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
            get_store().remove_element(ERROR$14, 0);
        }
    }
}
