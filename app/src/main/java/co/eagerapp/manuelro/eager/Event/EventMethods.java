package co.eagerapp.manuelro.eager.Event;

import java.util.Date;

import co.eagerapp.manuelro.eager.Alarm.Plain.AlarmModel;
import co.eagerapp.manuelro.eager.Event.Plain.EventModel;
import co.eagerapp.manuelro.eager.EventType.Plain.EventTypeModel;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

/**
 * Created by Jose Pablo on 23/11/2015.
 */
public class EventMethods {
    Lista lista = new Lista();



    public void CrearActividad( String name, String description, EventTypeModel type, String typename, String typedescription, Date startdate, Date finaldate, AlarmModel alarma){
        EventModel event = new EventModel(lista.CuentaNodos()+1, name, description, new EventTypeModel(typename, typedescription), startdate, finaldate, alarma);
        lista.inserta(new Nodo(event));
    }

    public void EliminarActividad(int id){
        lista.EliminaN(id);
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
                "lista=" + lista +
                '}';
    }
}
