package co.eagerapp.manuelro.eager.Activity;

import android.app.Activity;

import java.util.Date;

import co.eagerapp.manuelro.eager.Alarm.Plain.AlarmModel;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;

/**
 * Created by Jose Pablo on 23/11/2015.
 */
public class ActivityMethods {
    Lista lista = new Lista();



    public void CrearActividad( String name, String description, ActivityType type, String typename, String typedescription, Date startdate, Date finaldate, AlarmModel alarma){
        Activities activity = new Activities(lista.CuentaNodos()+1, name, description, new ActivityType(typename, typedescription), startdate, finaldate, alarma);
        lista.inserta(activity);
    }

    public void EliminarActividad(int id){
        lista.EliminaN(id);
    }

    public void EditarActividad(Activities a, String name, String description, ActivityType type, String typename, String typedescription, Date startdate, Date finaldate, AlarmModel alarma){
        a.setName(name);
        a.setDescription(description);
        a.setType(new ActivityType(typename,typedescription));
        a.setStartdate(startdate);
        a.setFinaldate(finaldate);
        a.setAlarm(alarma);
    }

    @Override
    public String toString() {
        return "MetodosActividad{" +
                "lista=" + lista +
                '}';
    }
}
