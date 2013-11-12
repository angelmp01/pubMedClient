/*
 * XML Type:  LinkType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML LinkType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class LinkTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType
{
    
    public LinkTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Id");
    private static final javax.xml.namespace.QName SCORE$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Score");
    
    
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
     * Gets the "Score" element
     */
    public java.lang.String getScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Score" element
     */
    public org.apache.xmlbeans.XmlString xgetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Score" element
     */
    public boolean isSetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORE$2) != 0;
        }
    }
    
    /**
     * Sets the "Score" element
     */
    public void setScore(java.lang.String score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORE$2);
            }
            target.setStringValue(score);
        }
    }
    
    /**
     * Sets (as xml) the "Score" element
     */
    public void xsetScore(org.apache.xmlbeans.XmlString score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCORE$2);
            }
            target.set(score);
        }
    }
    
    /**
     * Unsets the "Score" element
     */
    public void unsetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORE$2, 0);
        }
    }
}
