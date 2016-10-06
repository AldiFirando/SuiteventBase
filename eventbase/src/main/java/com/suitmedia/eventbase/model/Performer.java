package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by CR055 on 18-Jul-16.
 */
public class Performer extends RealmObject{

    @PrimaryKey
    private String id;

    private String name;
    private String biography;
    private String topic;
    private String avatar;
    @SerializedName("avatar_type")
    private String avatarType;
    private String avatarInfo;
    @SerializedName("additional_avatar")
    private String additionalAvatar;
    @SerializedName("additional_avatar_type")
    private int additionalAvatarType;
    @SerializedName("additional_avatar_info")
    private ImageInfo additionalAvatarInfo;
    @SerializedName("job_title")
    private String jobTitle;
    private String company;
    private String email;
    private String phone;
    private String order;
    @SerializedName("is_confirm")
    private String isConfirm;
    @SerializedName("created_at")
    private Date createdAt;
    @SerializedName("updated_at")
    private Date updatedAt;
    @SerializedName("avatar_small")
    private String avatarSmall;
    @SerializedName("avatar_medium")
    private String avatarMedium;
    @SerializedName("additional_avatar_small")
    private String additionalAvatarSmall;
    @SerializedName("additional_avatar_medium")
    private String additionalAvatarMedium;
    private RealmList<Schedule> schedules;
    private Pivot pivot;
    @SerializedName("performer_link")
    private RealmList<PerformerLink> performerLink;
    @SerializedName("performer_reviews")
    private RealmList<Review> performerReviews;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarType() {
        return avatarType;
    }

    public void setAvatarType(String avatarType) {
        this.avatarType = avatarType;
    }

    public String getAvatarInfo() {
        return avatarInfo;
    }

    public void setAvatarInfo(String avatarInfo) {
        this.avatarInfo = avatarInfo;
    }

    public String getAdditionalAvatar() {
        return additionalAvatar;
    }

    public void setAdditionalAvatar(String additionalAvatar) {
        this.additionalAvatar = additionalAvatar;
    }

    public int getAdditionalAvatarType() {
        return additionalAvatarType;
    }

    public void setAdditionalAvatarType(int additionalAvatarType) {
        this.additionalAvatarType = additionalAvatarType;
    }

    public ImageInfo getAdditionalAvatarInfo() {
        return additionalAvatarInfo;
    }

    public void setAdditionalAvatarInfo(ImageInfo additionalAvatarInfo) {
        this.additionalAvatarInfo = additionalAvatarInfo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAvatarSmall() {
        return avatarSmall;
    }

    public void setAvatarSmall(String avatarSmall) {
        this.avatarSmall = avatarSmall;
    }

    public String getAvatarMedium() {
        return avatarMedium;
    }

    public void setAvatarMedium(String avatarMedium) {
        this.avatarMedium = avatarMedium;
    }

    public RealmList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(RealmList<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Pivot getPivot() {
        return pivot;
    }

    public void setPivot(Pivot pivot) {
        this.pivot = pivot;
    }

    public RealmList<PerformerLink> getPerformerLink() {
        return performerLink;
    }

    public void setPerformerLink(RealmList<PerformerLink> performerLink) {
        this.performerLink = performerLink;
    }

    public String getAdditionalAvatarSmall() {
        return additionalAvatarSmall;
    }

    public void setAdditionalAvatarSmall(String additionalAvatarSmall) {
        this.additionalAvatarSmall = additionalAvatarSmall;
    }

    public String getAdditionalAvatarMedium() {
        return additionalAvatarMedium;
    }

    public void setAdditionalAvatarMedium(String additionalAvatarMedium) {
        this.additionalAvatarMedium = additionalAvatarMedium;
    }

    public RealmList<Review> getPerformerReviews() {
        return performerReviews;
    }

    public void setPerformerReviews(RealmList<Review> performerReviews) {
        this.performerReviews = performerReviews;
    }
}
