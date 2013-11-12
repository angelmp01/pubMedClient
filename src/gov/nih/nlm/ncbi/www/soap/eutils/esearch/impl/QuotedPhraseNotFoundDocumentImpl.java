/*
 * An XML document type.
 * Localname: QuotedPhraseNotFound
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.QuotedPhraseNotFoundDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one QuotedPhraseNotFound(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class QuotedPhraseNotFoundDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.QuotedPhraseNotFoundDocument
{
    
    public QuotedPhraseNotFoundDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUOTEDPHRASENOTFOUND$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "QuotedPhraseNotFound");
    
    
    /**
     * Gets the "QuotedPhraseNotFound" element
     */
    public java.lang.String getQuotedPhraseNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEDPHRASENOTFOUND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "QuotedPhraseNotFound" element
     */
    public org.apache.xmlbeans.XmlString xgetQuotedPhraseNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUOTEDPHRASENOTFOUND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QuotedPhraseNotFound" element
     */
    public void setQuotedPhraseNotFound(java.lang.String quotedPhraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEDPHRASENOTFOUND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUOTEDPHRASENOTFOUND$0);
            }
            target.setStringValue(quotedPhraseNotFound);
        }
    }
    
    /**
     * Sets (as xml) the "QuotedPhraseNotFound" element
     */
    public void xsetQuotedPhraseNotFound(org.apache.xmlbeans.XmlString quotedPhraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUOTEDPHRASENOTFOUND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUOTEDPHRASENOTFOUND$0);
            }
            target.set(quotedPhraseNotFound);
        }
    }
}
