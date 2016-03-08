package com.zyj.website.model;

import java.util.Date;

public class Article {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.category_id
     *
     * @mbggenerated
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.subject
     *
     * @mbggenerated
     */
    private String subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.image_name
     *
     * @mbggenerated
     */
    private String imageName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.digest
     *
     * @mbggenerated
     */
    private String digest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.keyword
     *
     * @mbggenerated
     */
    private String keyword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.top
     *
     * @mbggenerated
     */
    private Boolean top;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.rate
     *
     * @mbggenerated
     */
    private Byte rate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.rate_times
     *
     * @mbggenerated
     */
    private Integer rateTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.views
     *
     * @mbggenerated
     */
    private Integer views;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.allow_comment
     *
     * @mbggenerated
     */
    private Boolean allowComment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.status
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.last_modified_date
     *
     * @mbggenerated
     */
    private Date lastModifiedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.created_date
     *
     * @mbggenerated
     */
    private Date createdDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.message
     *
     * @mbggenerated
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.user_id
     *
     * @return the value of article.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.user_id
     *
     * @param userId the value for article.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.category_id
     *
     * @return the value of article.category_id
     *
     * @mbggenerated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.category_id
     *
     * @param categoryId the value for article.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.subject
     *
     * @return the value of article.subject
     *
     * @mbggenerated
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.subject
     *
     * @param subject the value for article.subject
     *
     * @mbggenerated
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.image_name
     *
     * @return the value of article.image_name
     *
     * @mbggenerated
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.image_name
     *
     * @param imageName the value for article.image_name
     *
     * @mbggenerated
     */
    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.digest
     *
     * @return the value of article.digest
     *
     * @mbggenerated
     */
    public String getDigest() {
        return digest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.digest
     *
     * @param digest the value for article.digest
     *
     * @mbggenerated
     */
    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.keyword
     *
     * @return the value of article.keyword
     *
     * @mbggenerated
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.keyword
     *
     * @param keyword the value for article.keyword
     *
     * @mbggenerated
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.url
     *
     * @return the value of article.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.url
     *
     * @param url the value for article.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.top
     *
     * @return the value of article.top
     *
     * @mbggenerated
     */
    public Boolean getTop() {
        return top;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.top
     *
     * @param top the value for article.top
     *
     * @mbggenerated
     */
    public void setTop(Boolean top) {
        this.top = top;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.rate
     *
     * @return the value of article.rate
     *
     * @mbggenerated
     */
    public Byte getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.rate
     *
     * @param rate the value for article.rate
     *
     * @mbggenerated
     */
    public void setRate(Byte rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.rate_times
     *
     * @return the value of article.rate_times
     *
     * @mbggenerated
     */
    public Integer getRateTimes() {
        return rateTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.rate_times
     *
     * @param rateTimes the value for article.rate_times
     *
     * @mbggenerated
     */
    public void setRateTimes(Integer rateTimes) {
        this.rateTimes = rateTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.views
     *
     * @return the value of article.views
     *
     * @mbggenerated
     */
    public Integer getViews() {
        return views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.views
     *
     * @param views the value for article.views
     *
     * @mbggenerated
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.allow_comment
     *
     * @return the value of article.allow_comment
     *
     * @mbggenerated
     */
    public Boolean getAllowComment() {
        return allowComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.allow_comment
     *
     * @param allowComment the value for article.allow_comment
     *
     * @mbggenerated
     */
    public void setAllowComment(Boolean allowComment) {
        this.allowComment = allowComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.status
     *
     * @return the value of article.status
     *
     * @mbggenerated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.status
     *
     * @param status the value for article.status
     *
     * @mbggenerated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.last_modified_date
     *
     * @return the value of article.last_modified_date
     *
     * @mbggenerated
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.last_modified_date
     *
     * @param lastModifiedDate the value for article.last_modified_date
     *
     * @mbggenerated
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.created_date
     *
     * @return the value of article.created_date
     *
     * @mbggenerated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.created_date
     *
     * @param createdDate the value for article.created_date
     *
     * @mbggenerated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.deleted
     *
     * @return the value of article.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.deleted
     *
     * @param deleted the value for article.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.message
     *
     * @return the value of article.message
     *
     * @mbggenerated
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.message
     *
     * @param message the value for article.message
     *
     * @mbggenerated
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}