package co.eagerapp.manuelro.eager.Event.Plain;

import java.util.Date;

import co.eagerapp.manuelro.eager.Alarm.Plain.AlarmModel;
import co.eagerapp.manuelro.eager.Common.Interfaces.MockData;
import co.eagerapp.manuelro.eager.EventType.Plain.EventTypeModel;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

/**
 * Created by Jose on 24/11/2015.
 */
public class EventModel implements MockData{
    int id;
    String name;
    String description;
    EventTypeModel type;
    Date startdate;
    Date finaldate;
    AlarmModel alarm;


    public EventModel(int id, EventTypeModel type) {
        this.id = id;
        this.type = type;
    }

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

    @Override
    public String toString() {
        return "EventModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", startdate=" + startdate +
                ", finaldate=" + finaldate +
                ", alarm=" + alarm +
                '}';
    }


    @Override
    public void populate(int n) {
        Lista eventsList = new Lista();

        for(int i = 0; i <= n; i++){
            EventTypeModel eventType = new EventTypeModel("Meeting");
            EventModel event = new EventModel(i, eventType);
            Nodo nodo = new Nodo(event);
            eventsList.inserta(nodo);
        }


    }
}
