package co.eagerapp.manuelro.eager.Course.Plain;

/**
 * Created by Manuel on 19/11/2015.
 */
public class CourseModel {
    private String name;
    private int suite;
    // private Schedule schedule;
    // private Professor professor;
    // private List groups;
    // private List activities;

    public CourseModel(String nombre) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSuite() {
        return suite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }
}
