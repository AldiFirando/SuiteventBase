package com.suitmedia.eventbase.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by CR055 on 19-Jul-16.
 */
public class Pivot extends RealmObject{

    @SerializedName("performer_id")
    private String performerId;
    @SerializedName("schedule_id")
    private String scheduleId;

    public String getPerformerId() {
        return performerId;
    }

    public void setPerformerId(String performerId) {
        this.performerId = performerId;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }
}
