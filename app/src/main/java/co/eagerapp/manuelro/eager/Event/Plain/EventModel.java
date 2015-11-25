package co.eagerapp.manuelro.eager.Event.Plain;

import java.util.Date;

import co.eagerapp.manuelro.eager.Alarm.Plain.AlarmModel;
import co.eagerapp.manuelro.eager.EventType.Plain.EventTypeModel;

/**
 * Created by Jose on 24/11/2015.
 */
public class EventModel {
    int id;
    String name;
    String description;
    EventTypeModel type;
    Date startdate;
    Date finaldate;
    AlarmModel alarm;

    public EventModel(int id, String name, String description, EventTypeModel type, Date startdate, Date finaldate, AlarmModel alarm) {
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

    public EventTypeModel getType() {
        return type;
    }

    public void setType(EventTypeModel type) {
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
