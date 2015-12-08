package co.eagerapp.manuelro.eager.Course.Plain;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import co.eagerapp.manuelro.eager.Common.Contracts.SchemaContract;
import co.eagerapp.manuelro.eager.Common.Helpers.SchemaBuilderHelper;
import co.eagerapp.manuelro.eager.Common.Interfaces.MockData;
import co.eagerapp.manuelro.eager.Event.Plain.EventModel;
import co.eagerapp.manuelro.eager.EventType.Plain.EventTypeModel;
import co.eagerapp.manuelro.eager.Structures.Cola.Cola;
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
    private Cola pastEvents;

    public CourseModel(String name) {
        this.name = name;
        this.pastEvents = new Cola();
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

    public void setPastEvents(Cola pastEvents) {
        this.pastEvents = pastEvents;
    }

    public Cola getPastEvents() {
        return pastEvents;
    }

    @Override
    public void populate(int eventsN) {
        Lista eventsList = new Lista();
        EventTypeModel eventType = new EventTypeModel("Meeting");

        for(int i = 0; i < eventsN; i++){
            EventModel event = new EventModel("Event title for event number " + i, i, eventType);
            Nodo nodo = new Nodo(event);
            eventsList.inserta(nodo);
        }

        // Se asignan los datos
        events = eventsList;
        suite = (int) Math.round(Math.random()*300);
    }

    @Override
    public void populate() {

    }


    public void populateDatabase(Context context, int n){
        SchemaBuilderHelper dbHelper = new SchemaBuilderHelper(context);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        ContentValues values = new ContentValues();

        for (int i = 0; i < n; i++){
            values.put(SchemaContract.Course.COLUMN_NAME_NAME, "Course number " + i);
            values.put(SchemaContract.Course.COLUMN_NAME_SUITE, (int) Math.round(Math.random()*300));
        }

        long rowId;
        rowId = db.insert(
                SchemaContract.Course.TABLE_NAME,
                "NULLABLE",
                values
        );

    }
}
