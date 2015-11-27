package co.eagerapp.manuelro.eager.Alarm;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.Date;

import co.eagerapp.manuelro.eager.Alarm.Plain.AlarmModel;
import co.eagerapp.manuelro.eager.R;

public class AlarmActivity extends AppCompatActivity {

    AlarmMethods metodos;
    AlarmModel alarm;
    public static final int ringtoneCode=9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        metodos = new AlarmMethods(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    /****************
     *FUNCIONES QUE DEBEN ESTAR PRESENTES EN ACTIVITY
     ****************/
    @Override //ESCOGER TONO DE NOTIFICACION
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK){
            switch (requestCode){
                case ringtoneCode:
                    Uri uri = data.getParcelableExtra(RingtoneManager.EXTRA_RINGTONE_PICKED_URI);
                    alarm = metodos.setAlarm(new Date(System.currentTimeMillis()+5*1000), "Prueba",1, uri);
                    break;
            }
        }
    }

    private void cancelAlarm(){
        metodos.deleteAlarm(alarm);
    }

    private void createAlarm(){
        Intent intent = new Intent(RingtoneManager.ACTION_RINGTONE_PICKER);
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_TYPE, RingtoneManager.TYPE_NOTIFICATION);
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_TITLE, "Select Tone");
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_EXISTING_URI, RingtoneManager.getActualDefaultRingtoneUri(this, RingtoneManager.TYPE_NOTIFICATION));
        startActivityForResult(intent, ringtoneCode);
    }



}
