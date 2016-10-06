package com.suitmedia.eventbase.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by CR055 on 20-Jul-16.
 */
public class AttractionReview extends RealmObject {

    @PrimaryKey
    private String id;

    private String attractionId;
    private String userId;
    private String numberOfStar;
    private String review;
    private String isFeatured;
    private String createdAt;
    private String updatedAt;
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(String attractionId) {
        this.attractionId = attractionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNumberOfStar() {
        return numberOfStar;
    }

    public void setNumberOfStar(String numberOfStar) {
        this.numberOfStar = numberOfStar;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(String isFeatured) {
        this.isFeatured = isFeatured;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
