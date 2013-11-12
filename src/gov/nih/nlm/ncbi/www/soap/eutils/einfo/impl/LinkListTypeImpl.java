/*
 * XML Type:  LinkListType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo.impl;
/**
 * An XML LinkListType(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
 *
 * This is a complex type.
 */
public class LinkListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkListType
{
    
    public LinkListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "Link");
    
    
    /**
     * Gets array of all "Link" elements
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$0, targetList);
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType[] result = new gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Link" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType)get_store().find_element_user(LINK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Link" element
     */
    public int sizeOfLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$0);
        }
    }
    
    /**
     * Sets array of all "Link" element
     */
    public void setLinkArray(gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType[] linkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$0);
        }
    }
    
    /**
     * Sets ith "Link" element
     */
    public void setLinkArray(int i, gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType)get_store().find_element_user(LINK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(link);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType)get_store().insert_element_user(LINK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType)get_store().add_element_user(LINK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Link" element
     */
    public void removeLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$0, i);
        }
    }
}
