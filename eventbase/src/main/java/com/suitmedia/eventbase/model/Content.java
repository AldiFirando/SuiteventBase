package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by CR055 on 18-Jul-16.
 */
public class Content extends RealmObject {

    @PrimaryKey
    private String id;

    @SerializedName("category_id")
    private String categoryId;
    private String title;
    private String slug;
    private String highlight;
    private String content;
    private String image;
    @SerializedName("image_type")
    private String imageType;
    private ImageInfo imageInfo;
    @SerializedName("published_at")
    private Date publishedAt;
    @SerializedName("is_featured")
    private String isFeatured;
    @SerializedName("created_at")
    private Date createdAt;
    @SerializedName("updated_at")
    private Date updatedAt;
    @SerializedName("image_small_cover")
    private String imageSmallCover;
    @SerializedName("image_medium_cover")
    private String imageMediumCover;
    @SerializedName("image_large_cover")
    private String imageLargeCover;
    private Category category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(String isFeatured) {
        this.isFeatured = isFeatured;
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

    public String getImageSmallCover() {
        return imageSmallCover;
    }

    public void setImageSmallCover(String imageSmallCover) {
        this.imageSmallCover = imageSmallCover;
    }

    public String getImageMediumCover() {
        return imageMediumCover;
    }

    public void setImageMediumCover(String imageMediumCover) {
        this.imageMediumCover = imageMediumCover;
    }

    public String getImageLargeCover() {
        return imageLargeCover;
    }

    public void setImageLargeCover(String imageLargeCover) {
        this.imageLargeCover = imageLargeCover;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
