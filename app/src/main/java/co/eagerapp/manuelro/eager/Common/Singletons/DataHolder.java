package co.eagerapp.manuelro.eager.Common.Singletons;

import android.app.Application;

import co.eagerapp.manuelro.eager.Course.Plain.CourseModel;
import co.eagerapp.manuelro.eager.Structures.Lista.Lista;

/**
 * Created by Manuel on 06/12/2015.
 */
public class DataHolder extends Application {
    private CourseModel course;
    private Lista courses;

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
}
