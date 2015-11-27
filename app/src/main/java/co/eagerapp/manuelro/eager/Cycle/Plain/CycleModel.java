package co.eagerapp.manuelro.eager.Cycle.Plain;

import co.eagerapp.manuelro.eager.Course.Plain.CourseModel;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;
import co.eagerapp.manuelro.eager.Structures.Lista.Nodo;

/**
 * Created by Felix on 19/11/2015.
 */
public class CycleModel {
    private int id;
    private int lenght;
    private Lista courses;

    public CycleModel(int lenght, int id) {
        this.lenght = lenght;
        this.id=id;
        courses = new Lista();
    }

    public void addCourse(CourseModel course){
        courses.inserta(new Nodo(course));
    }

    public Lista getCourses(){
        return courses;
    }
}
