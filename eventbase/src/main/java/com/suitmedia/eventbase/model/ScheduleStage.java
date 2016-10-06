package com.suitmedia.eventbase.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Aldio Firando on 7/21/2016.
 */
public class ScheduleStage extends RealmObject{

    @PrimaryKey
    private String stageId;
    private RealmList<Schedule> schedules;

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public RealmList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(RealmList<Schedule> schedules) {
        this.schedules = schedules;
    }
}
