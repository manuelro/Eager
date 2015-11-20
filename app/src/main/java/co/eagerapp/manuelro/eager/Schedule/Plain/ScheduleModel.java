package co.eagerapp.manuelro.eager.Schedule.Plain;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;

/**
 * Created by Manuel on 19/11/2015.
 */
public class ScheduleModel {
    private Lista days;

    public ScheduleModel(Lista days) {
        this.days = days;
    }

    public Lista getDays() {
        return days;
    }

    public void setDays(Lista days) {
        this.days = days;
    }
}
