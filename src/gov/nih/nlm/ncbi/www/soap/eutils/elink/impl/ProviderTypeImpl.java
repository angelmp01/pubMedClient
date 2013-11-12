/*
 * XML Type:  ProviderType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML ProviderType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class ProviderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType
{
    
    public ProviderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Name");
    private static final javax.xml.namespace.QName NAMEABBR$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "NameAbbr");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Id");
    private static final javax.xml.namespace.QName URL$6 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Url");
    private static final javax.xml.namespace.QName ICONURL$8 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "IconUrl");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "NameAbbr" element
     */
    public java.lang.String getNameAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEABBR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NameAbbr" element
     */
    public org.apache.xmlbeans.XmlString xgetNameAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMEABBR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NameAbbr" element
     */
    public void setNameAbbr(java.lang.String nameAbbr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEABBR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMEABBR$2);
            }
            target.setStringValue(nameAbbr);
        }
    }
    
    /**
     * Sets (as xml) the "NameAbbr" element
     */
    public void xsetNameAbbr(org.apache.xmlbeans.XmlString nameAbbr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMEABBR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAMEABBR$2);
            }
            target.set(nameAbbr);
        }
    }
    
    /**
     * Gets the "Id" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().find_element_user(ID$4, 0);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().add_element_user(ID$4);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdType)get_store().add_element_user(ID$4);
            return target;
        }
    }
    
    /**
     * Gets the "Url" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Url" element
     */
    public void setUrl(gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().add_element_user(URL$6);
            }
            target.set(url);
        }
    }
    
    /**
     * Appends and returns a new empty "Url" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType addNewUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().add_element_user(URL$6);
            return target;
        }
    }
    
    /**
     * Gets the "IconUrl" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType getIconUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType)get_store().find_element_user(ICONURL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IconUrl" element
     */
    public boolean isSetIconUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICONURL$8) != 0;
        }
    }
    
    /**
     * Sets the "IconUrl" element
     */
    public void setIconUrl(gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType iconUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType)get_store().find_element_user(ICONURL$8, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType)get_store().add_element_user(ICONURL$8);
            }
            target.set(iconUrl);
        }
    }
    
    /**
     * Appends and returns a new empty "IconUrl" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType addNewIconUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType)get_store().add_element_user(ICONURL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "IconUrl" element
     */
    public void unsetIconUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICONURL$8, 0);
        }
    }
}
