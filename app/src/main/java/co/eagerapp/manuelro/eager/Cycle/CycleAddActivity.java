package co.eagerapp.manuelro.eager.Cycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import co.eagerapp.manuelro.eager.Common.Singletons.DataHolder;
import co.eagerapp.manuelro.eager.R;
import co.eagerapp.manuelro.eager.Structures.Arbol.Nodo;

public class CycleAddActivity extends AppCompatActivity {
    DataHolder app;
    CycleAddActivity self;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_add);
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
        setTitle("Add cycle");

        self = this;

        setEventListeners();
    }

    private void setEventListeners(){
        Button cycleCreateButton = (Button) findViewById(R.id.cycleCreateButton);
        Button cycleAddCancelButton = (Button) findViewById(R.id.cycleAddCancelButton);
        final TextView cycleSize = (TextView) findViewById(R.id.cycleAddSizeText);

        cycleCreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.getCycles().insert(Integer.parseInt(cycleSize.getText().toString()));
                finish();
            }
        });

        cycleAddCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
