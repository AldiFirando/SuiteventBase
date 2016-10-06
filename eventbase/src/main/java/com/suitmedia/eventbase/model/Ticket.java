package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Aldio Firando on 8/11/2016.
 */
public class Ticket extends RealmObject{

    @PrimaryKey
    private String id;

    private String name;
    private String description;
    private String price;
    @SerializedName("ticket_category_id")
    private String ticketCategoryId;
    private String logo;
    private String logoType;
    private String logoInfo;
    @SerializedName("logo_orientation")
    private String logoOrientation;
    private String url;
    private String order;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("logo_small_icon")
    private String logoSmallIcon;
    @SerializedName("logo_medium_square")
    private String logoMediumSquare;
    @SerializedName("logo_large_cover")
    private String logoLargeCover;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(String ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogoType() {
        return logoType;
    }

    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }

    public String getLogoInfo() {
        return logoInfo;
    }

    public void setLogoInfo(String logoInfo) {
        this.logoInfo = logoInfo;
    }

    public String getLogoOrientation() {
        return logoOrientation;
    }

    public void setLogoOrientation(String logoOrientation) {
        this.logoOrientation = logoOrientation;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getLogoSmallIcon() {
        return logoSmallIcon;
    }

    public void setLogoSmallIcon(String logoSmallIcon) {
        this.logoSmallIcon = logoSmallIcon;
    }

    public String getLogoMediumSquare() {
        return logoMediumSquare;
    }

    public void setLogoMediumSquare(String logoMediumSquare) {
        this.logoMediumSquare = logoMediumSquare;
    }

    public String getLogoLargeCover() {
        return logoLargeCover;
    }

    public void setLogoLargeCover(String logoLargeCover) {
        this.logoLargeCover = logoLargeCover;
    }
}
