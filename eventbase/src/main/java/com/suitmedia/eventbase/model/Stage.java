package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by CR055 on 18-Jul-16.
 */
public class Stage extends RealmObject{

    @PrimaryKey
    private String id;

    private String name;
    private String description;
    @SerializedName("available_seat")
    private String availableSeat;
    private String image;
    @SerializedName("image_type")
    private String imageType;
    @SerializedName("image_info")
    private ImageInfo imageInfo;
    private String order;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("image_small_square")
    private String imageSmallSquare;
    @SerializedName("image_medium_square")
    private String imageMediumSquare;
    @SerializedName("stage_informations")
    private RealmList<StageInformation> stageInformations;
    private RealmList<Schedule> schedules;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(String availableSeat) {
        this.availableSeat = availableSeat;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ImageInfo getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ImageInfo imageInfo) {
        this.imageInfo = imageInfo;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
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

    public String getImageSmallSquare() {
        return imageSmallSquare;
    }

    public void setImageSmallSquare(String imageSmallSquare) {
        this.imageSmallSquare = imageSmallSquare;
    }

    public String getImageMediumSquare() {
        return imageMediumSquare;
    }

    public void setImageMediumSquare(String imageMediumSquare) {
        this.imageMediumSquare = imageMediumSquare;
    }

    public RealmList<StageInformation> getStageInformations() {
        return stageInformations;
    }

    public void setStageInformations(RealmList<StageInformation> stageInformations) {
        this.stageInformations = stageInformations;
    }

    public RealmList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(RealmList<Schedule> schedules) {
        this.schedules = schedules;
    }
}
