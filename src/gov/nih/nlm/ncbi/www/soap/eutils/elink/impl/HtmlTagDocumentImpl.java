/*
 * An XML document type.
 * Localname: HtmlTag
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.HtmlTagDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * A document containing one HtmlTag(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public class HtmlTagDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.HtmlTagDocument
{
    
    public HtmlTagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HTMLTAG$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "HtmlTag");
    
    
    /**
     * Gets the "HtmlTag" element
     */
    public java.lang.String getHtmlTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTMLTAG$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTMLTAG$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTMLTAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HTMLTAG$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTMLTAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HTMLTAG$0);
            }
            target.set(htmlTag);
        }
    }
}
