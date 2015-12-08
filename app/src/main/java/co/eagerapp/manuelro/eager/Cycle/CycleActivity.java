package co.eagerapp.manuelro.eager.Cycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

import co.eagerapp.manuelro.eager.Common.Listeners.CustomOnClickListener;
import co.eagerapp.manuelro.eager.Common.Singletons.DataHolder;
import co.eagerapp.manuelro.eager.Course.Plain.CourseModel;
import co.eagerapp.manuelro.eager.Cycle.Plain.CycleModel;
import co.eagerapp.manuelro.eager.R;
import co.eagerapp.manuelro.eager.Structures.Arbol.Arbol;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

public class CycleActivity extends AppCompatActivity {

    DataHolder app;
    CycleActivity self;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);
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
        self = this;

        setTitle("Cycles");
        displayCycles();
        setEventListeners();
    }

    @Override
    public void onResume(){
        super.onResume();

        displayCycles();
    }

    private void setEventListeners(){
        Button cycleAddButton = (Button) findViewById(R.id.cycleAddButton);

        cycleAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self, co.eagerapp.manuelro.eager.Cycle.CycleAddActivity.class);
                startActivity(intent);
            }
        });
    }

    private void displayCycles(){
        final Arbol cycles = app.getCycles();
        final LinearLayout mainLayout = (LinearLayout) findViewById(R.id.cyclesLinearLayout);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mainLayout.removeAllViews();

        if (cycles.getRaiz() != null) {
            displayCyclesInOrdenR(cycles.getRaiz(), inflater, mainLayout);
        } else {
            System.out.println("El arbol esta vacio");
        }
    }

    public void displayCyclesInOrdenR(co.eagerapp.manuelro.eager.Structures.Arbol.Nodo n, LayoutInflater inflater, LinearLayout mainLayout) {
        if (n != null) {
            displayCyclesInOrdenR(n.getHijoIzq(), inflater, mainLayout);
            final View custom = inflater.inflate(R.layout.cycle_view_list_item, null);
            TextView cycleName = (TextView) custom.findViewById(R.id.cycleNameText);

            cycleName.setText("Cycle of " + Integer.toString(n.getId()) + " months");

            System.out.print("" + n.getId());
            mainLayout.addView(custom);
            displayCyclesInOrdenR(n.getHijoDer(), inflater, mainLayout);
        }
    }

}
