package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by CR055 on 18-Jul-16.
 */
public class Schedule extends RealmObject{

    @PrimaryKey
    private String id;

    private String title;
    private String subtitle;
    private String synopsis;
    @SerializedName("time_slot_id")
    private String timeSlotId;
    @SerializedName("stage_id")
    private String stageId;
    @SerializedName("schedule_category_id")
    private String scheduleCategoryId;
    private String quota;
    @SerializedName("num_of_registrant")
    private String numOfRegistrant;
    @SerializedName("is_active")
    private String isActive;
    private String image;
    @SerializedName("created_at")
    private Date createdAt;
    @SerializedName("updated_at")
    private Date updatedAt;
    @SerializedName("image_small")
    private String imageSmall;
    @SerializedName("image_medium")
    private String imageMedium;
    private Category category;
    @SerializedName("time_slot")
    private Timeslot timeslot;
    private Stage stage;
    private RealmList<Performer> performers;

    private boolean isFavorite;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public String getScheduleCategoryId() {
        return scheduleCategoryId;
    }

    public void setScheduleCategoryId(String scheduleCategoryId) {
        this.scheduleCategoryId = scheduleCategoryId;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getNumOfRegistrant() {
        return numOfRegistrant;
    }

    public void setNumOfRegistrant(String numOfRegistrant) {
        this.numOfRegistrant = numOfRegistrant;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public RealmList<Performer> getPerformers() {
        return performers;
    }

    public void setPerformers(RealmList<Performer> performers) {
        this.performers = performers;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    public String getImageMedium() {
        return imageMedium;
    }

    public void setImageMedium(String imageMedium) {
        this.imageMedium = imageMedium;
    }
}
