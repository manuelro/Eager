package co.eagerapp.manuelro.eager.Course;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import co.eagerapp.manuelro.eager.Common.Singletons.DataHolder;
import co.eagerapp.manuelro.eager.Event.Plain.EventModel;
import co.eagerapp.manuelro.eager.R;
import co.eagerapp.manuelro.eager.Structures.Cola.Cola;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

public class CourseViewActivity extends AppCompatActivity {
    private DataHolder app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        NestedScrollView mainView = (NestedScrollView) findViewById(R.id.courseDetailsView);

        app = (DataHolder) getApplicationContext();
        if(app.getCourse() != null){
            TextView courseName = (TextView) findViewById(R.id.courseName);
            TextView courseSuite = (TextView) findViewById(R.id.courseSuite);

            courseName.setText(app.getCourse().getName());
            courseSuite.setText(String.valueOf(app.getCourse().getSuite()));

            displayEvents();
            displayPastEvents();
        }
    }

    private void displayEvents(){
        final CourseViewActivity self = this;
        final Lista events = app.getCourse().getEvents();
        Nodo aux = events.getCabeza();
        final LinearLayout mainLayout = (LinearLayout) findViewById(R.id.eventsListView);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mainLayout.removeAllViews();

        if(aux != null)
            do {
                final EventModel event = (EventModel) aux.getData();
                final View custom = inflater.inflate(R.layout.event_view_list_item, null);
                final TextView eventTitle = (TextView) custom.findViewById(R.id.eventListItemTitle);
                TextView eventType = (TextView) custom.findViewById(R.id.eventListItemType);
                Button deteleEventButton = (Button) custom.findViewById(R.id.deteleEventButton);

                eventTitle.setText(event.getName());
                eventType.setText(event.getType().getName());

                deteleEventButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Nodo aux = events.getCabeza();
                        int counter = 1;
                        if (aux != null)
                            do {
                                if (((EventModel)aux.getData()) == event) {
                                    eventTitle.setText("Deleted");
                                    mainLayout.removeView(custom);
                                    co.eagerapp.manuelro.eager.Structures.Cola.Nodo nodo = new co.eagerapp.manuelro.eager.Structures.Cola.Nodo(event);
                                    app.getCourse().getPastEvents().enCola(nodo);
                                    displayPastEvents();
                                    events.EliminaN(counter);
                                    break;
                                } else {
                                    counter++;
                                    aux = aux.getNext();
                                }
                            } while (aux.getNext() != events.getCabeza());
                    }
                });


                mainLayout.addView(custom);

                aux = aux.getNext();
            } while(aux.getNext() != events.getCabeza());

    }

    public void displayPastEvents(){
        final CourseViewActivity self = this;
        final Cola cola = app.getCourse().getPastEvents();
        co.eagerapp.manuelro.eager.Structures.Cola.Nodo aux = cola.atiende();
        Cola backup = new Cola();
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final LinearLayout mainLayout = (LinearLayout) findViewById(R.id.pastEventsListView);

        mainLayout.removeAllViews();

        while(aux != null){
            EventModel event = (EventModel) aux.getData();
            final View custom = inflater.inflate(R.layout.past_event_view_list_item, null);
            final TextView eventTitle = (TextView) custom.findViewById(R.id.eventListItemTitle);
            TextView eventType = (TextView) custom.findViewById(R.id.eventListItemType);
            Button deteleEventButton = (Button) custom.findViewById(R.id.deteleEventButton);

            eventTitle.setText(event.getName());
            eventType.setText(event.getType().getName());

            backup.enCola(aux);
            mainLayout.addView(custom);

            aux = cola.atiende();
        }

        app.getCourse().setPastEvents(backup);
    }

    public void addViewToPastEvents(EventModel event){

    }
}
