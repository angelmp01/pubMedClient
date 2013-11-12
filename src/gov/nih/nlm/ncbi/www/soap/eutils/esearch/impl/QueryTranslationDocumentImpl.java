/*
 * An XML document type.
 * Localname: QueryTranslation
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.QueryTranslationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one QueryTranslation(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class QueryTranslationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.QueryTranslationDocument
{
    
    public QueryTranslationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYTRANSLATION$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "QueryTranslation");
    
    
    /**
     * Gets the "QueryTranslation" element
     */
    public java.lang.String getQueryTranslation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTRANSLATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryTranslation" element
     */
    public org.apache.xmlbeans.XmlString xgetQueryTranslation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYTRANSLATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QueryTranslation" element
     */
    public void setQueryTranslation(java.lang.String queryTranslation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTRANSLATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYTRANSLATION$0);
            }
            target.setStringValue(queryTranslation);
        }
    }
    
    /**
     * Sets (as xml) the "QueryTranslation" element
     */
    public void xsetQueryTranslation(org.apache.xmlbeans.XmlString queryTranslation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYTRANSLATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYTRANSLATION$0);
            }
            target.set(queryTranslation);
        }
    }
}
