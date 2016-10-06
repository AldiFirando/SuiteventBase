package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Aldio Firando on 8/15/2016.
 */
public class Wishlist extends RealmObject {

    @PrimaryKey
    private String id;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("event_location")
    private String eventLocation;
    @SerializedName("international_performer")
    private String internationalPerformer;
    @SerializedName("local_performer")
    private String localPerformer;
    private String text;
    private String publishedAt;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getInternationalPerformer() {
        return internationalPerformer;
    }

    public void setInternationalPerformer(String internationalPerformer) {
        this.internationalPerformer = internationalPerformer;
    }

    public String getLocalPerformer() {
        return localPerformer;
    }

    public void setLocalPerformer(String localPerformer) {
        this.localPerformer = localPerformer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
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
