package com.suitmedia.eventbase.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Aldio Firando on 19/08/2016.
 */
public class SideMenu extends RealmObject {

    @PrimaryKey
    private String id;
    private String parent_id;
    private String is_link;
    private String type;
    private String url;
    private int order;
    private int display_type;
    private String icon;
    private String icon_type;
    private String icon_info;
    private String created_at;
    private String updated_at;
    private String real_url;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getIs_link() {
        return is_link;
    }

    public void setIs_link(String is_link) {
        this.is_link = is_link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getDisplay_type() {
        return display_type;
    }

    public void setDisplay_type(int display_type) {
        this.display_type = display_type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon_type() {
        return icon_type;
    }

    public void setIcon_type(String icon_type) {
        this.icon_type = icon_type;
    }

    public String getIcon_info() {
        return icon_info;
    }

    public void setIcon_info(String icon_info) {
        this.icon_info = icon_info;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getReal_url() {
        return real_url;
    }

    public void setReal_url(String real_url) {
        this.real_url = real_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
