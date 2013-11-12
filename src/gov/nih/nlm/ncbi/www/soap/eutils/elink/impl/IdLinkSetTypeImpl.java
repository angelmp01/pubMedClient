/*
 * XML Type:  IdLinkSetType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML IdLinkSetType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class IdLinkSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdLinkSetType
{
    
    public IdLinkSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Id");
    private static final javax.xml.namespace.QName LINKINFO$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkInfo");
    
    
    /**
     * Gets the "Id" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Id" element
     */
    public void setId(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Appends and returns a new empty "Id" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().add_element_user(ID$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "LinkInfo" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType[] getLinkInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKINFO$2, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LinkInfo" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType getLinkInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType)get_store().find_element_user(LINKINFO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LinkInfo" element
     */
    public int sizeOfLinkInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKINFO$2);
        }
    }
    
    /**
     * Sets array of all "LinkInfo" element
     */
    public void setLinkInfoArray(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType[] linkInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkInfoArray, LINKINFO$2);
        }
    }
    
    /**
     * Sets ith "LinkInfo" element
     */
    public void setLinkInfoArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType linkInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType)get_store().find_element_user(LINKINFO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LinkInfo" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType insertNewLinkInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType)get_store().insert_element_user(LINKINFO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LinkInfo" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType addNewLinkInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType)get_store().add_element_user(LINKINFO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "LinkInfo" element
     */
    public void removeLinkInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKINFO$2, i);
        }
    }
}
