package co.eagerapp.manuelro.eager.Activity;

import java.util.Date;

import co.eagerapp.manuelro.eager.Alarm.Plain.AlarmModel;

/**
 * Created by Jose Pablo on 23/11/2015.
 */
public class Activities {

    int id;
    String name;
    String description;
    ActivityType type;
    Date startdate;
    Date finaldate;
    AlarmModel alarm;

    public Activities(int id, String name, String description, ActivityType type, Date startdate, Date finaldate, AlarmModel alarm) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.startdate = startdate;
        this.finaldate = finaldate;
        this.alarm = alarm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getFinaldate() {
        return finaldate;
    }

    public void setFinaldate(Date finaldate) {
        this.finaldate = finaldate;
    }

    public AlarmModel getAlarm() {
        return alarm;
    }

    public void setAlarm(AlarmModel alarm) {
        this.alarm = alarm;
    }
}
