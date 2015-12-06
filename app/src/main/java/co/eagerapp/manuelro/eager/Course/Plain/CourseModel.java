package co.eagerapp.manuelro.eager.Course.Plain;

import co.eagerapp.manuelro.eager.Common.Interfaces.MockData;
import co.eagerapp.manuelro.eager.Event.Plain.EventModel;
import co.eagerapp.manuelro.eager.EventType.Plain.EventTypeModel;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

/**
 * Created by Manuel on 19/11/2015.
 */
public class CourseModel implements MockData {
    private String name;
    private int suite;
    // private Schedule schedule;
    // private Professor professor;
    // private List groups;
    private Lista events;

    public CourseModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSuite() {
        return suite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }

    public void setEvents(Lista events) {
        this.events = events;
    }

    public Lista getEvents() {
        return events;
    }

    @Override
    public void populate(int n) {
        Lista eventsList = new Lista();
        EventTypeModel eventType = new EventTypeModel("Meeting");

        for(int i = 0; i <= n; i++){
            EventModel event = new EventModel(i, eventType);
            Nodo nodo = new Nodo(event);
            eventsList.inserta(nodo);
        }

        // Se asignan los datos
        events = eventsList;
        suite = (int) Math.round(Math.random()*300);
    }
}
