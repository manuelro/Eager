package co.eagerapp.manuelro.eager.Alarm;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import co.eagerapp.manuelro.eager.R;

public class AlarmReceiver extends BroadcastReceiver {
    public AlarmReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //ACA VA LA FUNCIONALIDAD CUANDO UNA ALARMA SE ACTIVA
        //EL INTENT CONTIENE EL TITULO DE LA ALARMA
        Uri ringtone = Uri.parse(intent.getExtras().getString("ringtone"));
        Toast.makeText(context, "Mensaje: "+intent.getExtras().getString("title"), Toast.LENGTH_LONG).show();
        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.icon) //cambiar icono al deseado
                .setContentTitle("Alerta activa")
                .setContentText(intent.getExtras().getString("title"))
                .setSound(ringtone);

        NotificationManager nManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nManager.notify(3, nBuilder.build());
    }
}
