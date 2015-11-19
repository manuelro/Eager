package co.eagerapp.manuelro.eager.Alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.util.Date;

import co.eagerapp.manuelro.eager.Alarm.Plain.AlarmModel;

public class AlarmMethods {
    private Context context;
    private static AlarmManager alarmManager;

    public AlarmMethods(Context context){
        this.context = context;
        alarmManager = (AlarmManager) context.getSystemService(context.ALARM_SERVICE);
    }

    //CREAR ALARMAS
    //ESTA FUNCION ACTUALIZA LA ALARMA SI EL ID ES EL MISMO
    //El ID ES EL QUE DIFERENCIA TODAS LAS ALARMAS PROGRAMADAS POR LO QUE ES IMPORTANTE
    public AlarmModel setAlarm(Date validThrough,  String title, int id, Uri ringtone){
        AlarmModel alarmModel;
        long date = validThrough.getTime();
        Intent alertaIntent = new Intent(context, AlarmReceiver.class);
        alertaIntent.putExtra("title", title);
        alertaIntent.putExtra("ringtone", ringtone.toString());

        PendingIntent pendingI = PendingIntent.getBroadcast(context,id, alertaIntent, PendingIntent.FLAG_CANCEL_CURRENT);
        Date todayDate = new Date(System.currentTimeMillis());

        alarmManager.set(AlarmManager.RTC_WAKEUP, date, pendingI);
        alarmModel = new AlarmModel(title, todayDate, validThrough, pendingI);
        return alarmModel;
    }

    public void deleteAlarm(AlarmModel model){
        alarmManager.cancel(model.getPendingIntent());
    }
}
