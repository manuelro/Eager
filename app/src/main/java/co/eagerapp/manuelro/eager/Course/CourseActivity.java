package co.eagerapp.manuelro.eager.Course;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import co.eagerapp.manuelro.eager.R;
import co.eagerapp.manuelro.eager.Schedule.ScheduleActivity;
import co.eagerapp.manuelro.eager.ScheduleDay.ScheduleDayActivity;

public class CourseActivity extends AppCompatActivity {

    private String name;
    private String suite;
    private ScheduleActivity schedule;
    //private Professor professor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
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
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public ScheduleActivity getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleActivity schedule) {
        this.schedule = schedule;
    }

    /*public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }*/
}
