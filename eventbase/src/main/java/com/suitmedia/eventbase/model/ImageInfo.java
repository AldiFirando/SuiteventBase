package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by CR055 on 19-Jul-16.
 */
public class ImageInfo extends RealmObject{

    @SerializedName("url_path")
    private String urlPath;
    @SerializedName("mime_type")
    private String mimeType;
    private int size;

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
