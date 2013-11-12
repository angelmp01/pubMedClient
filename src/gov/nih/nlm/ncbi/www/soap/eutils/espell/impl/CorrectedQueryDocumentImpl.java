/*
 * An XML document type.
 * Localname: CorrectedQuery
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.CorrectedQueryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell.impl;
/**
 * A document containing one CorrectedQuery(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public class CorrectedQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.CorrectedQueryDocument
{
    
    public CorrectedQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRECTEDQUERY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "CorrectedQuery");
    
    
    /**
     * Gets the "CorrectedQuery" element
     */
    public java.lang.String getCorrectedQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRECTEDQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorrectedQuery" element
     */
    public org.apache.xmlbeans.XmlString xgetCorrectedQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRECTEDQUERY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CorrectedQuery" element
     */
    public void setCorrectedQuery(java.lang.String correctedQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRECTEDQUERY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRECTEDQUERY$0);
            }
            target.setStringValue(correctedQuery);
        }
    }
    
    /**
     * Sets (as xml) the "CorrectedQuery" element
     */
    public void xsetCorrectedQuery(org.apache.xmlbeans.XmlString correctedQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRECTEDQUERY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRECTEDQUERY$0);
            }
            target.set(correctedQuery);
        }
    }
}
