package com.suitmedia.eventbase.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Aldio Firando on 7/21/2016.
 */
public class ScheduleTime extends RealmObject{

    @PrimaryKey
    private String timeSlotId;
    private RealmList<Schedule> schedules;
    private RealmList<Performer> performers;

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public RealmList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(RealmList<Schedule> schedules) {
        this.schedules = schedules;
    }

    public RealmList<Performer> getPerformers() {
        return performers;
    }

    public void setPerformers(RealmList<Performer> performers) {
        this.performers = performers;
    }
}
