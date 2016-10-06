package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Aldio Firando on 8/12/2016.
 */
public class Gallery extends RealmObject {

    @PrimaryKey
    private String id;
    private String title;
    private String description;
    private String url;
    private String content;
    @SerializedName("content_type")
    private int contentType;
    private String contentTnfo;
    @SerializedName("published_at")
    private String publishedAt;
    private String order;
    @SerializedName("created_at")
    private Date createdAt;
    @SerializedName("updated_at")
    private Date updatedAt;
    @SerializedName("content_small_icon_cms")
    private String contentSmallIconCms;
    @SerializedName("content_small_cover")
    private String contentSmallCover;
    @SerializedName("content_medium_cover")
    private String contentMediumCover;
    @SerializedName("content_large_cover")
    private String contentLargeCover;
    @SerializedName("custom_cover_image_small_icon_cms")
    private String customCoverImageSmallIconCms;
    @SerializedName("custom_cover_image_small_cover")
    private String customCoverImageSmallCover;
    @SerializedName("custom_cover_image_medium_cover")
    private String customCoverImageMediumCover;
    @SerializedName("custom_cover_image_large_cover")
    private String customCoverImageLargeCover;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public String getContentTnfo() {
        return contentTnfo;
    }

    public void setContentTnfo(String contentTnfo) {
        this.contentTnfo = contentTnfo;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
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

    public String getContentSmallIconCms() {
        return contentSmallIconCms;
    }

    public void setContentSmallIconCms(String contentSmallIconCms) {
        this.contentSmallIconCms = contentSmallIconCms;
    }

    public String getContentSmallCover() {
        return contentSmallCover;
    }

    public void setContentSmallCover(String contentSmallCover) {
        this.contentSmallCover = contentSmallCover;
    }

    public String getContentMediumCover() {
        return contentMediumCover;
    }

    public void setContentMediumCover(String contentMediumCover) {
        this.contentMediumCover = contentMediumCover;
    }

    public String getContentLargeCover() {
        return contentLargeCover;
    }

    public void setContentLargeCover(String contentLargeCover) {
        this.contentLargeCover = contentLargeCover;
    }

    public String getCustomCoverImageSmallIconCms() {
        return customCoverImageSmallIconCms;
    }

    public void setCustomCoverImageSmallIconCms(String customCoverImageSmallIconCms) {
        this.customCoverImageSmallIconCms = customCoverImageSmallIconCms;
    }

    public String getCustomCoverImageSmallCover() {
        return customCoverImageSmallCover;
    }

    public void setCustomCoverImageSmallCover(String customCoverImageSmallCover) {
        this.customCoverImageSmallCover = customCoverImageSmallCover;
    }

    public String getCustomCoverImageMediumCover() {
        return customCoverImageMediumCover;
    }

    public void setCustomCoverImageMediumCover(String customCoverImageMediumCover) {
        this.customCoverImageMediumCover = customCoverImageMediumCover;
    }

    public String getCustomCoverImageLargeCover() {
        return customCoverImageLargeCover;
    }

    public void setCustomCoverImageLargeCover(String customCoverImageLargeCover) {
        this.customCoverImageLargeCover = customCoverImageLargeCover;
    }
}
