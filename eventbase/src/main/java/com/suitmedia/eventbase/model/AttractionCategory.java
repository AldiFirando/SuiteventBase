package com.suitmedia.eventbase.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by CR055 on 18-Jul-16.
 */
public class AttractionCategory extends RealmObject{

    @PrimaryKey
    private String id;

    private String name;
    private String description;
    private String order;
    private String createdAt;
    private String updatedAt;
    private RealmList<Attraction> attractions;

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

    public RealmList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(RealmList<Attraction> attractions) {
        this.attractions = attractions;
    }
}
