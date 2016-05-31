package com.gzsll.hupu.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table FORUM.
 */
public class Forum {

    private Long id;
    private String fid;
    private String name;
    private String logo;
    private String description;
    private String backImg;
    private String forumId;
    private String categoryName;
    private Integer weight;

    public Forum() {
    }

    public Forum(Long id) {
        this.id = id;
    }

    public Forum(Long id, String fid, String name, String logo, String description, String backImg,
        String forumId, String categoryName, Integer weight) {
        this.id = id;
        this.fid = fid;
        this.name = name;
        this.logo = logo;
        this.description = description;
        this.backImg = backImg;
        this.forumId = forumId;
        this.categoryName = categoryName;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    public String getForumId() {
        return forumId;
    }

    public void setForumId(String forumId) {
        this.forumId = forumId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}
