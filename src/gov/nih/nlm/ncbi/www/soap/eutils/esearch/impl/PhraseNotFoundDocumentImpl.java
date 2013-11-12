/*
 * An XML document type.
 * Localname: PhraseNotFound
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.PhraseNotFoundDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one PhraseNotFound(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class PhraseNotFoundDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.PhraseNotFoundDocument
{
    
    public PhraseNotFoundDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHRASENOTFOUND$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "PhraseNotFound");
    
    
    /**
     * Gets the "PhraseNotFound" element
     */
    public java.lang.String getPhraseNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHRASENOTFOUND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PhraseNotFound" element
     */
    public org.apache.xmlbeans.XmlString xgetPhraseNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHRASENOTFOUND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PhraseNotFound" element
     */
    public void setPhraseNotFound(java.lang.String phraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHRASENOTFOUND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHRASENOTFOUND$0);
            }
            target.setStringValue(phraseNotFound);
        }
    }
    
    /**
     * Sets (as xml) the "PhraseNotFound" element
     */
    public void xsetPhraseNotFound(org.apache.xmlbeans.XmlString phraseNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHRASENOTFOUND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHRASENOTFOUND$0);
            }
            target.set(phraseNotFound);
        }
    }
}
