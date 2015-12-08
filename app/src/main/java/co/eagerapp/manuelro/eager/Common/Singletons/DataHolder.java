package co.eagerapp.manuelro.eager.Common.Singletons;

import android.app.Application;

import co.eagerapp.manuelro.eager.Common.Interfaces.MockData;
import co.eagerapp.manuelro.eager.Course.Plain.CourseModel;
import co.eagerapp.manuelro.eager.Cycle.Plain.CycleModel;
import co.eagerapp.manuelro.eager.Structures.Arbol.Arbol;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

/**
 * Created by Manuel on 06/12/2015.
 */
public class DataHolder extends Application implements MockData {
    private int coursesQuantity;
    private int eventsQuantity;
    private int cyclesQuantity;

    private Lista courses;
    private CourseModel course;

    private Arbol cycles;
    private co.eagerapp.manuelro.eager.Structures.Arbol.Nodo cycle;

    public DataHolder() {
        this.coursesQuantity = 10;
        this.cyclesQuantity = 3;
        this.eventsQuantity = 5;
    }

    public void setCourse(CourseModel course) {
        this.course = course;
    }

    public void setCourses(Lista courses) {
        this.courses = courses;
    }

    public CourseModel getCourse() {
        return course;
    }

    public Lista getCourses() {
        return courses;
    }

    public void setCoursesQuantity(int coursesQuantity) {
        this.coursesQuantity = coursesQuantity;
    }

    public void setCyclesQuantity(int cyclesQuantity) {
        this.cyclesQuantity = cyclesQuantity;
    }

    public void setEventsQuantity(int eventsQuantity) {
        this.eventsQuantity = eventsQuantity;
    }

    public void setCycles(Arbol cycles) {
        this.cycles = cycles;
    }

    public void setCycle(co.eagerapp.manuelro.eager.Structures.Arbol.Nodo cycle) {
        this.cycle = cycle;
    }

    public int getCoursesQuantity() {
        return coursesQuantity;
    }

    public int getCyclesQuantity() {
        return cyclesQuantity;
    }

    public int getEventsQuantity() {
        return eventsQuantity;
    }

    public Arbol getCycles() {
        return cycles;
    }

    public co.eagerapp.manuelro.eager.Structures.Arbol.Nodo getCycle() {
        return cycle;
    }

    @Override
    public void populate(int n) {

    }

    @Override
    public void populate() {
        populateCourses();
        populateCycles();
    }

    private void populateCourses(){
        Lista lista = new Lista();

        for (int i = 0; i < coursesQuantity; i++) {
            CourseModel course = new CourseModel("Curso " + i);
            course.populate(eventsQuantity);
            Nodo nodo = new Nodo(course);
            lista.inserta(nodo);
        }

        this.courses = lista;
    }

    private void populateCycles(){
        Arbol arbol = new Arbol();

        arbol.insert(2);
        arbol.insert(4);
        arbol.insert(6);
        arbol.insert(12);

        this.cycles = arbol;
    }
}
