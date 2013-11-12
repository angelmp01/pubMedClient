/*
 * An XML document type.
 * Localname: PhraseIgnored
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.PhraseIgnoredDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one PhraseIgnored(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class PhraseIgnoredDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.PhraseIgnoredDocument
{
    
    public PhraseIgnoredDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHRASEIGNORED$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "PhraseIgnored");
    
    
    /**
     * Gets the "PhraseIgnored" element
     */
    public java.lang.String getPhraseIgnored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHRASEIGNORED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PhraseIgnored" element
     */
    public org.apache.xmlbeans.XmlString xgetPhraseIgnored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHRASEIGNORED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PhraseIgnored" element
     */
    public void setPhraseIgnored(java.lang.String phraseIgnored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHRASEIGNORED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHRASEIGNORED$0);
            }
            target.setStringValue(phraseIgnored);
        }
    }
    
    /**
     * Sets (as xml) the "PhraseIgnored" element
     */
    public void xsetPhraseIgnored(org.apache.xmlbeans.XmlString phraseIgnored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHRASEIGNORED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHRASEIGNORED$0);
            }
            target.set(phraseIgnored);
        }
    }
}
