package co.eagerapp.manuelro.eager;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcelable;
import android.renderscript.Sampler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.Serializable;

import co.eagerapp.manuelro.eager.Common.Contracts.SchemaContract;
import co.eagerapp.manuelro.eager.Common.Helpers.SchemaBuilderHelper;
import co.eagerapp.manuelro.eager.Common.Listeners.CustomOnClickListener;
import co.eagerapp.manuelro.eager.Common.Singletons.DataHolder;
import co.eagerapp.manuelro.eager.Course.CourseActivity;
import co.eagerapp.manuelro.eager.Course.Plain.CourseModel;
import co.eagerapp.manuelro.eager.Cycle.CycleActivity;
import co.eagerapp.manuelro.eager.Event.EventActivity;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DataHolder app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //CourseModel course = new CourseModel("");
        //course.populateDatabase(this, 5);

//        SchemaBuilderHelper helper = new SchemaBuilderHelper(this);
//        SQLiteDatabase db = helper.getReadableDatabase();
//
//        String[] projection = {
//                SchemaContract.Course._ID,
//                SchemaContract.Course.COLUMN_NAME_NAME,
//                SchemaContract.Course.COLUMN_NAME_SUITE
//        };
//
//        String[] selection = {};
//
//        Cursor c = db.query(
//                SchemaContract.Course.TABLE_NAME,
//                projection,
//                "", null, null, null, null, null
//        );
//
//        c.moveToFirst();
//        String itemId = c.getString(
//                c.getColumnIndexOrThrow(SchemaContract.Course._ID)
//        );
//
//        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
//        TextView text = new TextView(this);
//
//        text.setText(itemId);
//        mainLayout.addView(text);

        app = (DataHolder) getApplicationContext();
        app.populate();
        displayCourses();
    }

    @Override
    public void onResume(){
        super.onResume();

        displayCourses();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cycles) {
            startActivity(new Intent(this, CycleActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void displayCourses(){
        final MainActivity self = this;
        final Lista courses = app.getCourses();
        Nodo aux = courses.getCabeza();
        final LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int counter = 1;

        mainLayout.removeAllViews();

        if(aux != null)
            do {
                final CourseModel course = (CourseModel) aux.getData();
                final View custom = inflater.inflate(R.layout.course_view_list_item, null);
                TextView courseTitle = (TextView) custom.findViewById(R.id.courseTitle);
                TextView suiteId = (TextView) custom.findViewById(R.id.suiteId);
                Button courseViewButton = (Button) custom.findViewById(R.id.courseViewButton);
                Button courseEditButton = (Button) custom.findViewById(R.id.courseEditButton);
                Button courseDeleteButton = (Button) custom.findViewById(R.id.courseDeleteButton);

                courseTitle.setText(course.getName());
                suiteId.setText(Integer.toString(course.getSuite()));

                courseViewButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(self, co.eagerapp.manuelro.eager.Course.CourseViewActivity.class);
                        app.setCourse(course);
                        startActivity(intent);
                    }
                });

                courseDeleteButton.setOnClickListener(new CustomOnClickListener(counter) {
                    @Override
                    public void onClick(View v) {
                        app.getCourses().EliminaN(this.getNodeIndex());
                        displayCourses();
                    }
                });

                courseEditButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(self, co.eagerapp.manuelro.eager.Course.CourseEditActivity.class);
                        app.setCourse(course);
                        startActivity(intent);
                    }
                });

                mainLayout.addView(custom);

                counter++;
                aux = aux.getNext();
            } while(aux.getNext() != courses.getCabeza());

    }

}
