package com.suitmedia.eventbase.model;

import io.realm.RealmObject;

/**
 * Created by CR055 on 19-Jul-16.
 */
public class UriInfo extends RealmObject{

    private String urlPath;
    private String mimeType;
    private Integer size;

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
