package co.eagerapp.manuelro.eager.Event;

import java.util.Date;

import co.eagerapp.manuelro.eager.Alarm.Plain.AlarmModel;
import co.eagerapp.manuelro.eager.Event.Plain.EventModel;
import co.eagerapp.manuelro.eager.EventType.Plain.EventTypeModel;
import co.eagerapp.manuelro.eager.Structures.Cola.ColaMethods;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

/**
 * Created by Jose Pablo on 23/11/2015.
 */
public class EventMethods {
    private Lista eventsList;
    private ColaMethods colaExpired;

    public EventMethods(){
        colaExpired = new ColaMethods();
        eventsList = new Lista();
    }

    public void CrearActividad( String name, String description, EventTypeModel type, Date startdate, Date finaldate, AlarmModel alarma){
        EventModel event = new EventModel(eventsList.CuentaNodos()+1, name, description,type, startdate, finaldate, alarma);
        eventsList.inserta(new Nodo(event));
    }



    public void EliminarActividad(int id){
        colaExpired.agregar(eventsList.get(id));
        eventsList.EliminaN(id);
    }

    public void EditarActividad(EventModel event, String name, String description, EventTypeModel type, String typename, String typedescription, Date startdate, Date finaldate, AlarmModel alarma){
        event.setName(name);
        event.setDescription(description);
        event.setType(new EventTypeModel(typename,typedescription));
        event.setStartdate(startdate);
        event.setFinaldate(finaldate);
        event.setAlarm(alarma);
    }

    @Override
    public String toString() {
        return "MetodosActividad{" +
                "lista=" + eventsList +
                '}';
    }
}
