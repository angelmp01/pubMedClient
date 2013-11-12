/*
 * An XML document type.
 * Localname: WebEnv
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/epost
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.epost.WebEnvDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.epost.impl;
/**
 * A document containing one WebEnv(@http://www.ncbi.nlm.nih.gov/soap/eutils/epost) element.
 *
 * This is a complex type.
 */
public class WebEnvDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.epost.WebEnvDocument
{
    
    public WebEnvDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBENV$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/epost", "WebEnv");
    
    
    /**
     * Gets the "WebEnv" element
     */
    public java.lang.String getWebEnv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBENV$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBENV$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBENV$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBENV$0);
            }
            target.set(webEnv);
        }
    }
}
