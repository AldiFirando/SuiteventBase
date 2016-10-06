package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by CR055 on 18-Jul-16.
 */
public class Partner extends RealmObject {

    @PrimaryKey
    private String id;

    private String name;
    private String description;
    @SerializedName("partner_category_id")
    private String partnerCategoryId;
    private String logo;
    private String logoType;
    private String logoInfo;
    @SerializedName("logo_orientation")
    private String logoOrientation;
    private String url;
    @SerializedName("logo_small_icon")
    private String logoSmallIcon;
    @SerializedName("logo_medium")
    private String logoMedium;
    private String order;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("partner_category")
    private PartnerCategory partnerCategory;

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

    public String getPartnerCategoryId() {
        return partnerCategoryId;
    }

    public void setPartnerCategoryId(String partnerCategoryId) {
        this.partnerCategoryId = partnerCategoryId;
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

    public PartnerCategory getPartnerCategory() {
        return partnerCategory;
    }

    public void setPartnerCategory(PartnerCategory partnerCategory) {
        this.partnerCategory = partnerCategory;
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

    public String getLogoSmallIcon() {
        return logoSmallIcon;
    }

    public void setLogoSmallIcon(String logoSmallIcon) {
        this.logoSmallIcon = logoSmallIcon;
    }

    public String getLogoMedium() {
        return logoMedium;
    }

    public void setLogoMedium(String logoMedium) {
        this.logoMedium = logoMedium;
    }
}
