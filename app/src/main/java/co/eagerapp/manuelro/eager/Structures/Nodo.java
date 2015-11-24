package co.eagerapp.manuelro.eager.Structures;

import android.app.Activity;

import co.eagerapp.manuelro.eager.Activity.Activities;

/**
 * Created by Jose Pablo on 23/11/2015.
 */
public class Nodo {

    private Activities activity;
    private Nodo next;
    private Nodo back;

    public Nodo(Activities activity) {
        this.activity = activity;
    }

    public Activities getActivities() {
        return activity;
    }

    public void setActivities(Activity actividad) {
        this.activity = activity;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Nodo{" + "actividad=" + activity + '}'+"\n";
    }

}
