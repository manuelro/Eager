package co.eagerapp.manuelro.eager.Course;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import co.eagerapp.manuelro.eager.Common.Singletons.DataHolder;
import co.eagerapp.manuelro.eager.R;

public class CourseEditActivity extends AppCompatActivity {
    private DataHolder app;
    final CourseEditActivity self = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_edit);
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

        app = (DataHolder) getApplicationContext();
        bootstrapActivity();
    }

    public void bootstrapActivity(){
        TextView courseName = (TextView) findViewById(R.id.courseEditNameText);
        TextView courseSuite = (TextView) findViewById(R.id.courseEditSuiteText);

        if(app.getCourse() != null){
            courseName.setText(app.getCourse().getName());
            courseSuite.setText(String.valueOf(app.getCourse().getSuite()));
        }

        setListeners(courseName, courseSuite);
    }

    public void setListeners(final TextView courseName, final TextView courseSuite){
        Button courseUpdateButton = (Button) findViewById(R.id.courseUpdteButton);
        Button courseCancelButton = (Button) findViewById(R.id.courseCancelUpdateButton);

        courseUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.getCourse().setName(courseName.getText().toString());
                app.getCourse().setSuite(Integer.parseInt(courseSuite.getText().toString()));

                finish();
            }
        });

        courseCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }



}
