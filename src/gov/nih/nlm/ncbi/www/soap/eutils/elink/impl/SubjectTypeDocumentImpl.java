/*
 * An XML document type.
 * Localname: SubjectType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.SubjectTypeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * A document containing one SubjectType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public class SubjectTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.SubjectTypeDocument
{
    
    public SubjectTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "SubjectType");
    
    
    /**
     * Gets the "SubjectType" element
     */
    public java.lang.String getSubjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubjectType" element
     */
    public org.apache.xmlbeans.XmlString xgetSubjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubjectType" element
     */
    public void setSubjectType(java.lang.String subjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECTTYPE$0);
            }
            target.setStringValue(subjectType);
        }
    }
    
    /**
     * Sets (as xml) the "SubjectType" element
     */
    public void xsetSubjectType(org.apache.xmlbeans.XmlString subjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECTTYPE$0);
            }
            target.set(subjectType);
        }
    }
}
