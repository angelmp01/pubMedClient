/*
 * XML Type:  ObjUrlType
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * An XML ObjUrlType(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink).
 *
 * This is a complex type.
 */
public class ObjUrlTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.ObjUrlType
{
    
    public ObjUrlTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Url");
    private static final javax.xml.namespace.QName ICONURL$2 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "IconUrl");
    private static final javax.xml.namespace.QName LINKNAME$4 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkName");
    private static final javax.xml.namespace.QName SUBJECTTYPE$6 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "SubjectType");
    private static final javax.xml.namespace.QName CATEGORY$8 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Category");
    private static final javax.xml.namespace.QName ATTRIBUTE$10 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Attribute");
    private static final javax.xml.namespace.QName PROVIDER$12 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Provider");
    private static final javax.xml.namespace.QName SUBPROVIDER$14 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "SubProvider");
    
    
    /**
     * Gets the "Url" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().find_element_user(URL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().find_element_user(URL$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().add_element_user(URL$0);
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
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.UrlType)get_store().add_element_user(URL$0);
            return target;
        }
    }
    
    /**
     * Gets the "IconUrl" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType getIconUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType)get_store().find_element_user(ICONURL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IconUrl" element
     */
    public boolean isSetIconUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICONURL$2) != 0;
        }
    }
    
    /**
     * Sets the "IconUrl" element
     */
    public void setIconUrl(gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType iconUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType)get_store().find_element_user(ICONURL$2, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType)get_store().add_element_user(ICONURL$2);
            }
            target.set(iconUrl);
        }
    }
    
    /**
     * Appends and returns a new empty "IconUrl" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType addNewIconUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.IconUrlType)get_store().add_element_user(ICONURL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "IconUrl" element
     */
    public void unsetIconUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICONURL$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKNAME$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LinkName" element
     */
    public boolean isSetLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKNAME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKNAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKNAME$4);
            }
            target.set(linkName);
        }
    }
    
    /**
     * Unsets the "LinkName" element
     */
    public void unsetLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKNAME$4, 0);
        }
    }
    
    /**
     * Gets array of all "SubjectType" elements
     */
    public java.lang.String[] getSubjectTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBJECTTYPE$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SubjectType" element
     */
    public java.lang.String getSubjectTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SubjectType" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetSubjectTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBJECTTYPE$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SubjectType" element
     */
    public org.apache.xmlbeans.XmlString xgetSubjectTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "SubjectType" element
     */
    public int sizeOfSubjectTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTTYPE$6);
        }
    }
    
    /**
     * Sets array of all "SubjectType" element
     */
    public void setSubjectTypeArray(java.lang.String[] subjectTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subjectTypeArray, SUBJECTTYPE$6);
        }
    }
    
    /**
     * Sets ith "SubjectType" element
     */
    public void setSubjectTypeArray(int i, java.lang.String subjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(subjectType);
        }
    }
    
    /**
     * Sets (as xml) array of all "SubjectType" element
     */
    public void xsetSubjectTypeArray(org.apache.xmlbeans.XmlString[]subjectTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subjectTypeArray, SUBJECTTYPE$6);
        }
    }
    
    /**
     * Sets (as xml) ith "SubjectType" element
     */
    public void xsetSubjectTypeArray(int i, org.apache.xmlbeans.XmlString subjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subjectType);
        }
    }
    
    /**
     * Inserts the value as the ith "SubjectType" element
     */
    public void insertSubjectType(int i, java.lang.String subjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUBJECTTYPE$6, i);
            target.setStringValue(subjectType);
        }
    }
    
    /**
     * Appends the value as the last "SubjectType" element
     */
    public void addSubjectType(java.lang.String subjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECTTYPE$6);
            target.setStringValue(subjectType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubjectType" element
     */
    public org.apache.xmlbeans.XmlString insertNewSubjectType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SUBJECTTYPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubjectType" element
     */
    public org.apache.xmlbeans.XmlString addNewSubjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECTTYPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubjectType" element
     */
    public void removeSubjectType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTTYPE$6, i);
        }
    }
    
    /**
     * Gets array of all "Category" elements
     */
    public java.lang.String[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Category" element
     */
    public java.lang.String getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Category" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Category" element
     */
    public org.apache.xmlbeans.XmlString xgetCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$8);
        }
    }
    
    /**
     * Sets array of all "Category" element
     */
    public void setCategoryArray(java.lang.String[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$8);
        }
    }
    
    /**
     * Sets ith "Category" element
     */
    public void setCategoryArray(int i, java.lang.String category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(category);
        }
    }
    
    /**
     * Sets (as xml) array of all "Category" element
     */
    public void xsetCategoryArray(org.apache.xmlbeans.XmlString[]categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$8);
        }
    }
    
    /**
     * Sets (as xml) ith "Category" element
     */
    public void xsetCategoryArray(int i, org.apache.xmlbeans.XmlString category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts the value as the ith "Category" element
     */
    public void insertCategory(int i, java.lang.String category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORY$8, i);
            target.setStringValue(category);
        }
    }
    
    /**
     * Appends the value as the last "Category" element
     */
    public void addCategory(java.lang.String category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$8);
            target.setStringValue(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    public org.apache.xmlbeans.XmlString insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CATEGORY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    public org.apache.xmlbeans.XmlString addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$8, i);
        }
    }
    
    /**
     * Gets array of all "Attribute" elements
     */
    public java.lang.String[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Attribute" element
     */
    public java.lang.String getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Attribute" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Attribute" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$10);
        }
    }
    
    /**
     * Sets array of all "Attribute" element
     */
    public void setAttributeArray(java.lang.String[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$10);
        }
    }
    
    /**
     * Sets ith "Attribute" element
     */
    public void setAttributeArray(int i, java.lang.String attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(attribute);
        }
    }
    
    /**
     * Sets (as xml) array of all "Attribute" element
     */
    public void xsetAttributeArray(org.apache.xmlbeans.XmlString[]attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$10);
        }
    }
    
    /**
     * Sets (as xml) ith "Attribute" element
     */
    public void xsetAttributeArray(int i, org.apache.xmlbeans.XmlString attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts the value as the ith "Attribute" element
     */
    public void insertAttribute(int i, java.lang.String attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTRIBUTE$10, i);
            target.setStringValue(attribute);
        }
    }
    
    /**
     * Appends the value as the last "Attribute" element
     */
    public void addAttribute(java.lang.String attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTE$10);
            target.setStringValue(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    public org.apache.xmlbeans.XmlString insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ATTRIBUTE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    public org.apache.xmlbeans.XmlString addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$10, i);
        }
    }
    
    /**
     * Gets the "Provider" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType getProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType)get_store().find_element_user(PROVIDER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Provider" element
     */
    public void setProvider(gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType provider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType)get_store().find_element_user(PROVIDER$12, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType)get_store().add_element_user(PROVIDER$12);
            }
            target.set(provider);
        }
    }
    
    /**
     * Appends and returns a new empty "Provider" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType addNewProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.elink.ProviderType)get_store().add_element_user(PROVIDER$12);
            return target;
        }
    }
    
    /**
     * Gets the "SubProvider" element
     */
    public java.lang.String getSubProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROVIDER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubProvider" element
     */
    public org.apache.xmlbeans.XmlString xgetSubProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROVIDER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubProvider" element
     */
    public boolean isSetSubProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBPROVIDER$14) != 0;
        }
    }
    
    /**
     * Sets the "SubProvider" element
     */
    public void setSubProvider(java.lang.String subProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROVIDER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBPROVIDER$14);
            }
            target.setStringValue(subProvider);
        }
    }
    
    /**
     * Sets (as xml) the "SubProvider" element
     */
    public void xsetSubProvider(org.apache.xmlbeans.XmlString subProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROVIDER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBPROVIDER$14);
            }
            target.set(subProvider);
        }
    }
    
    /**
     * Unsets the "SubProvider" element
     */
    public void unsetSubProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBPROVIDER$14, 0);
        }
    }
}
