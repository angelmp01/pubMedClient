/*
 * XML Type:  LinkInfoType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML LinkInfoType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class LinkInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType
{
    
    public LinkInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBTO$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "DbTo");
    private static final javax.xml.namespace.QName LINKNAME$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkName");
    private static final javax.xml.namespace.QName MENUTAG$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "MenuTag");
    private static final javax.xml.namespace.QName HTMLTAG$6 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "HtmlTag");
    private static final javax.xml.namespace.QName URL$8 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Url");
    private static final javax.xml.namespace.QName PRIORITY$10 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Priority");
    
    
    /**
     * Gets the "DbTo" element
     */
    public java.lang.String getDbTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DbTo" element
     */
    public org.apache.xmlbeans.XmlString xgetDbTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DbTo" element
     */
    public void setDbTo(java.lang.String dbTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBTO$0);
            }
            target.setStringValue(dbTo);
        }
    }
    
    /**
     * Sets (as xml) the "DbTo" element
     */
    public void xsetDbTo(org.apache.xmlbeans.XmlString dbTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DBTO$0);
            }
            target.set(dbTo);
        }
    }
    
    /**
     * Gets the "LinkName" element
     */
    public java.lang.String getLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LinkName" element
     */
    public void setLinkName(java.lang.String linkName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKNAME$2);
            }
            target.setStringValue(linkName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkName" element
     */
    public void xsetLinkName(org.apache.xmlbeans.XmlString linkName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKNAME$2);
            }
            target.set(linkName);
        }
    }
    
    /**
     * Gets the "MenuTag" element
     */
    public java.lang.String getMenuTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENUTAG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MenuTag" element
     */
    public org.apache.xmlbeans.XmlString xgetMenuTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENUTAG$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "MenuTag" element
     */
    public boolean isSetMenuTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENUTAG$4) != 0;
        }
    }
    
    /**
     * Sets the "MenuTag" element
     */
    public void setMenuTag(java.lang.String menuTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENUTAG$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENUTAG$4);
            }
            target.setStringValue(menuTag);
        }
    }
    
    /**
     * Sets (as xml) the "MenuTag" element
     */
    public void xsetMenuTag(org.apache.xmlbeans.XmlString menuTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENUTAG$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENUTAG$4);
            }
            target.set(menuTag);
        }
    }
    
    /**
     * Unsets the "MenuTag" element
     */
    public void unsetMenuTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENUTAG$4, 0);
        }
    }
    
    /**
     * Gets the "HtmlTag" element
     */
    public java.lang.String getHtmlTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTMLTAG$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HtmlTag" element
     */
    public org.apache.xmlbeans.XmlString xgetHtmlTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTMLTAG$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "HtmlTag" element
     */
    public boolean isSetHtmlTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HTMLTAG$6) != 0;
        }
    }
    
    /**
     * Sets the "HtmlTag" element
     */
    public void setHtmlTag(java.lang.String htmlTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTMLTAG$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HTMLTAG$6);
            }
            target.setStringValue(htmlTag);
        }
    }
    
    /**
     * Sets (as xml) the "HtmlTag" element
     */
    public void xsetHtmlTag(org.apache.xmlbeans.XmlString htmlTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTMLTAG$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HTMLTAG$6);
            }
            target.set(htmlTag);
        }
    }
    
    /**
     * Unsets the "HtmlTag" element
     */
    public void unsetHtmlTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HTMLTAG$6, 0);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().find_element_user(URL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$8) != 0;
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().find_element_user(URL$8, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().add_element_user(URL$8);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().add_element_user(URL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$8, 0);
        }
    }
    
    /**
     * Gets the "Priority" element
     */
    public java.lang.String getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Priority" element
     */
    public org.apache.xmlbeans.XmlString xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIORITY$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Priority" element
     */
    public void setPriority(java.lang.String priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$10);
            }
            target.setStringValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "Priority" element
     */
    public void xsetPriority(org.apache.xmlbeans.XmlString priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIORITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIORITY$10);
            }
            target.set(priority);
        }
    }
}
