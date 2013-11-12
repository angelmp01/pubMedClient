/*
 * XML Type:  FieldType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/einfo
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.einfo.impl;
/**
 * An XML FieldType(@http://www.ncbi.nlm.nih.gov/soap/eutils/einfo).
 *
 * This is a complex type.
 */
public class FieldTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.einfo.FieldType
{
    
    public FieldTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "Name");
    private static final javax.xml.namespace.QName FULLNAME$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "FullName");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "Description");
    private static final javax.xml.namespace.QName TERMCOUNT$6 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "TermCount");
    private static final javax.xml.namespace.QName ISDATE$8 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "IsDate");
    private static final javax.xml.namespace.QName ISNUMERICAL$10 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "IsNumerical");
    private static final javax.xml.namespace.QName SINGLETOKEN$12 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "SingleToken");
    private static final javax.xml.namespace.QName HIERARCHY$14 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "Hierarchy");
    private static final javax.xml.namespace.QName ISHIDDEN$16 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "IsHidden");
    private static final javax.xml.namespace.QName ISRANGABLE$18 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "IsRangable");
    private static final javax.xml.namespace.QName ISTRUNCATABLE$20 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "IsTruncatable");
    
    
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
     * Gets the "FullName" element
     */
    public java.lang.String getFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FullName" element
     */
    public org.apache.xmlbeans.XmlString xgetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FullName" element
     */
    public void setFullName(java.lang.String fullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLNAME$2);
            }
            target.setStringValue(fullName);
        }
    }
    
    /**
     * Sets (as xml) the "FullName" element
     */
    public void xsetFullName(org.apache.xmlbeans.XmlString fullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FULLNAME$2);
            }
            target.set(fullName);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "TermCount" element
     */
    public java.lang.String getTermCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMCOUNT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TermCount" element
     */
    public org.apache.xmlbeans.XmlString xgetTermCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERMCOUNT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TermCount" element
     */
    public void setTermCount(java.lang.String termCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMCOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERMCOUNT$6);
            }
            target.setStringValue(termCount);
        }
    }
    
    /**
     * Sets (as xml) the "TermCount" element
     */
    public void xsetTermCount(org.apache.xmlbeans.XmlString termCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERMCOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERMCOUNT$6);
            }
            target.set(termCount);
        }
    }
    
    /**
     * Gets the "IsDate" element
     */
    public java.lang.String getIsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDate" element
     */
    public org.apache.xmlbeans.XmlString xgetIsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsDate" element
     */
    public void setIsDate(java.lang.String isDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDATE$8);
            }
            target.setStringValue(isDate);
        }
    }
    
    /**
     * Sets (as xml) the "IsDate" element
     */
    public void xsetIsDate(org.apache.xmlbeans.XmlString isDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISDATE$8);
            }
            target.set(isDate);
        }
    }
    
    /**
     * Gets the "IsNumerical" element
     */
    public java.lang.String getIsNumerical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNUMERICAL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsNumerical" element
     */
    public org.apache.xmlbeans.XmlString xgetIsNumerical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISNUMERICAL$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsNumerical" element
     */
    public void setIsNumerical(java.lang.String isNumerical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNUMERICAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISNUMERICAL$10);
            }
            target.setStringValue(isNumerical);
        }
    }
    
    /**
     * Sets (as xml) the "IsNumerical" element
     */
    public void xsetIsNumerical(org.apache.xmlbeans.XmlString isNumerical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISNUMERICAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISNUMERICAL$10);
            }
            target.set(isNumerical);
        }
    }
    
    /**
     * Gets the "SingleToken" element
     */
    public java.lang.String getSingleToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLETOKEN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SingleToken" element
     */
    public org.apache.xmlbeans.XmlString xgetSingleToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINGLETOKEN$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SingleToken" element
     */
    public void setSingleToken(java.lang.String singleToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLETOKEN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SINGLETOKEN$12);
            }
            target.setStringValue(singleToken);
        }
    }
    
    /**
     * Sets (as xml) the "SingleToken" element
     */
    public void xsetSingleToken(org.apache.xmlbeans.XmlString singleToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINGLETOKEN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SINGLETOKEN$12);
            }
            target.set(singleToken);
        }
    }
    
    /**
     * Gets the "Hierarchy" element
     */
    public java.lang.String getHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Hierarchy" element
     */
    public org.apache.xmlbeans.XmlString xgetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHY$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Hierarchy" element
     */
    public void setHierarchy(java.lang.String hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIERARCHY$14);
            }
            target.setStringValue(hierarchy);
        }
    }
    
    /**
     * Sets (as xml) the "Hierarchy" element
     */
    public void xsetHierarchy(org.apache.xmlbeans.XmlString hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIERARCHY$14);
            }
            target.set(hierarchy);
        }
    }
    
    /**
     * Gets the "IsHidden" element
     */
    public java.lang.String getIsHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISHIDDEN$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsHidden" element
     */
    public org.apache.xmlbeans.XmlString xgetIsHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISHIDDEN$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsHidden" element
     */
    public void setIsHidden(java.lang.String isHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISHIDDEN$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISHIDDEN$16);
            }
            target.setStringValue(isHidden);
        }
    }
    
    /**
     * Sets (as xml) the "IsHidden" element
     */
    public void xsetIsHidden(org.apache.xmlbeans.XmlString isHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISHIDDEN$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISHIDDEN$16);
            }
            target.set(isHidden);
        }
    }
    
    /**
     * Gets the "IsRangable" element
     */
    public java.lang.String getIsRangable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRANGABLE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsRangable" element
     */
    public org.apache.xmlbeans.XmlString xgetIsRangable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISRANGABLE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsRangable" element
     */
    public boolean isSetIsRangable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRANGABLE$18) != 0;
        }
    }
    
    /**
     * Sets the "IsRangable" element
     */
    public void setIsRangable(java.lang.String isRangable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRANGABLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRANGABLE$18);
            }
            target.setStringValue(isRangable);
        }
    }
    
    /**
     * Sets (as xml) the "IsRangable" element
     */
    public void xsetIsRangable(org.apache.xmlbeans.XmlString isRangable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISRANGABLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISRANGABLE$18);
            }
            target.set(isRangable);
        }
    }
    
    /**
     * Unsets the "IsRangable" element
     */
    public void unsetIsRangable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRANGABLE$18, 0);
        }
    }
    
    /**
     * Gets the "IsTruncatable" element
     */
    public java.lang.String getIsTruncatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTRUNCATABLE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsTruncatable" element
     */
    public org.apache.xmlbeans.XmlString xgetIsTruncatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISTRUNCATABLE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsTruncatable" element
     */
    public boolean isSetIsTruncatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISTRUNCATABLE$20) != 0;
        }
    }
    
    /**
     * Sets the "IsTruncatable" element
     */
    public void setIsTruncatable(java.lang.String isTruncatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTRUNCATABLE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISTRUNCATABLE$20);
            }
            target.setStringValue(isTruncatable);
        }
    }
    
    /**
     * Sets (as xml) the "IsTruncatable" element
     */
    public void xsetIsTruncatable(org.apache.xmlbeans.XmlString isTruncatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISTRUNCATABLE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISTRUNCATABLE$20);
            }
            target.set(isTruncatable);
        }
    }
    
    /**
     * Unsets the "IsTruncatable" element
     */
    public void unsetIsTruncatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISTRUNCATABLE$20, 0);
        }
    }
}
