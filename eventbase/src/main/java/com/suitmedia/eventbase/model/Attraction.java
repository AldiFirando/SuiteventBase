package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by CR055 on 18-Jul-16.
 */
public class Attraction extends RealmObject {

    @PrimaryKey
    private String id;

    @SerializedName("attraction_category_id")
    private String attractionCategoryId;
    private String name;
    private String description;
    private String image;
    @SerializedName("image_type")
    private String imageType;
    private ImageInfo imageInfo;
    private String order;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("image_small_square")
    private String imageSmallSquare;
    @SerializedName("attraction_category")
    private AttractionCategory attractionCategory;
    @SerializedName("attraction_reviews")
    private RealmList<Review> attractionReviews;
    private RealmList<Attachment> attachments;
    @SerializedName("attraction_informations")
    private RealmList<AttractionInformation> attractionInformations;
    @SerializedName("number_of_user_rate")
    private String numberOfUserRate;
    @SerializedName("total_rate")
    private String totalRate;
    private double latitude;
    private double longitude;
    @SerializedName("pin_point_code")
    private String pinPointCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttractionCategoryId() {
        return attractionCategoryId;
    }

    public void setAttractionCategoryId(String attractionCategoryId) {
        this.attractionCategoryId = attractionCategoryId;
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

    public AttractionCategory getAttractionCategory() {
        return attractionCategory;
    }

    public void setAttractionCategory(AttractionCategory attractionCategory) {
        this.attractionCategory = attractionCategory;
    }

    public List<Review> getAttractionReviews() {
        return attractionReviews;
    }

    public void setAttractionReviews(RealmList<Review> attractionReviews) {
        this.attractionReviews = attractionReviews;
    }

    public RealmList<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(RealmList<Attachment> attachments) {
        this.attachments = attachments;
    }

    public RealmList<AttractionInformation> getAttractionInformations() {
        return attractionInformations;
    }

    public void setAttractionInformations(RealmList<AttractionInformation> attractionInformations) {
        this.attractionInformations = attractionInformations;
    }

    public String getNumberOfUserRate() {
        return numberOfUserRate;
    }

    public void setNumberOfUserRate(String numberOfUserRate) {
        this.numberOfUserRate = numberOfUserRate;
    }

    public String getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(String totalRate) {
        this.totalRate = totalRate;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPinPointCode() {
        return pinPointCode;
    }

    public void setPinPointCode(String pinPointCode) {
        this.pinPointCode = pinPointCode;
    }
}
