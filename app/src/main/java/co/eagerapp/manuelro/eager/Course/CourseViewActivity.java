package co.eagerapp.manuelro.eager.Course;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import co.eagerapp.manuelro.eager.Common.Singletons.DataHolder;
import co.eagerapp.manuelro.eager.Event.Plain.EventModel;
import co.eagerapp.manuelro.eager.R;
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
//            TextView courseName = (TextView) findViewById(R.id.courseNameView01);
//            TextView courseSuite = (TextView) findViewById(R.id.courseSuiteView01);
//
//            courseName.setText(app.getCourse().getName());
//            courseSuite.setText(app.getCourse().getSuite());

            displayEvents();
        }
    }

    private void displayEvents(){
        final CourseViewActivity self = this;
        Lista events = app.getCourse().getEvents();
        Nodo aux = events.getCabeza();
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.eventsListView);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(aux != null)
            do {
                final EventModel event = (EventModel) aux.getData();
                View custom = inflater.inflate(R.layout.event_view_list_item, null);
                TextView eventTitle = (TextView) custom.findViewById(R.id.eventListItemTitle);
                TextView eventType = (TextView) custom.findViewById(R.id.eventListItemType);

                eventTitle.setText(event.getName());
                eventType.setText(event.getType().getName());

//                btnView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(self, co.eagerapp.manuelro.eager.Course.CourseViewActivity.class);
//                        //intent.putExtra("course", (Parcelable) course);
//                        app.setCourse(course);
//                        startActivity(intent);
//                    }
//                });


                mainLayout.addView(custom);

                aux = aux.getNext();
            } while(aux.getNext() != events.getCabeza());

    }
}
