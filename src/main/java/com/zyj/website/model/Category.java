package com.zyj.website.model;

import java.util.Date;

public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.father_category_id
     *
     * @mbggenerated
     */
    private Integer fatherCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name
     *
     * @mbggenerated
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.display_order
     *
     * @mbggenerated
     */
    private Short displayOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.show_type
     *
     * @mbggenerated
     */
    private String showType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.allow_comment
     *
     * @mbggenerated
     */
    private Boolean allowComment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.allow_publish
     *
     * @mbggenerated
     */
    private Boolean allowPublish;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.show_nav
     *
     * @mbggenerated
     */
    private Boolean showNav;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.last_modified_date
     *
     * @mbggenerated
     */
    private Date lastModifiedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.created_date
     *
     * @mbggenerated
     */
    private Date createdDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.father_category_id
     *
     * @return the value of category.father_category_id
     *
     * @mbggenerated
     */
    public Integer getFatherCategoryId() {
        return fatherCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.father_category_id
     *
     * @param fatherCategoryId the value for category.father_category_id
     *
     * @mbggenerated
     */
    public void setFatherCategoryId(Integer fatherCategoryId) {
        this.fatherCategoryId = fatherCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     *
     * @mbggenerated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     *
     * @mbggenerated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.display_order
     *
     * @return the value of category.display_order
     *
     * @mbggenerated
     */
    public Short getDisplayOrder() {
        return displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.display_order
     *
     * @param displayOrder the value for category.display_order
     *
     * @mbggenerated
     */
    public void setDisplayOrder(Short displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.show_type
     *
     * @return the value of category.show_type
     *
     * @mbggenerated
     */
    public String getShowType() {
        return showType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.show_type
     *
     * @param showType the value for category.show_type
     *
     * @mbggenerated
     */
    public void setShowType(String showType) {
        this.showType = showType == null ? null : showType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.url
     *
     * @return the value of category.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.url
     *
     * @param url the value for category.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.allow_comment
     *
     * @return the value of category.allow_comment
     *
     * @mbggenerated
     */
    public Boolean getAllowComment() {
        return allowComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.allow_comment
     *
     * @param allowComment the value for category.allow_comment
     *
     * @mbggenerated
     */
    public void setAllowComment(Boolean allowComment) {
        this.allowComment = allowComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.allow_publish
     *
     * @return the value of category.allow_publish
     *
     * @mbggenerated
     */
    public Boolean getAllowPublish() {
        return allowPublish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.allow_publish
     *
     * @param allowPublish the value for category.allow_publish
     *
     * @mbggenerated
     */
    public void setAllowPublish(Boolean allowPublish) {
        this.allowPublish = allowPublish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.show_nav
     *
     * @return the value of category.show_nav
     *
     * @mbggenerated
     */
    public Boolean getShowNav() {
        return showNav;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.show_nav
     *
     * @param showNav the value for category.show_nav
     *
     * @mbggenerated
     */
    public void setShowNav(Boolean showNav) {
        this.showNav = showNav;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.last_modified_date
     *
     * @return the value of category.last_modified_date
     *
     * @mbggenerated
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.last_modified_date
     *
     * @param lastModifiedDate the value for category.last_modified_date
     *
     * @mbggenerated
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.created_date
     *
     * @return the value of category.created_date
     *
     * @mbggenerated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.created_date
     *
     * @param createdDate the value for category.created_date
     *
     * @mbggenerated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.deleted
     *
     * @return the value of category.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.deleted
     *
     * @param deleted the value for category.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.description
     *
     * @return the value of category.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.description
     *
     * @param description the value for category.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}