package co.eagerapp.manuelro.eager.Structures.Lista;

import co.eagerapp.manuelro.eager.Course.CourseActivity;
import co.eagerapp.manuelro.eager.Cycle.CycleActivity;
import co.eagerapp.manuelro.eager.Group.GroupActivity;
import co.eagerapp.manuelro.eager.ScheduleDay.ScheduleDayActivity;
import co.eagerapp.manuelro.eager.Structures.Node.Node;

public class Lista {

    private Node head;

    public Lista() {
    }

    public void insertEmail(String email) {

        if (head == null) head = new Node(email);
        else if (head.getNext() == null) {
            head.setNext(new Node(email));
        }

    }

    public void insertPhoneNumber(int phoneNumber) {

        if (head == null) head = new Node(phoneNumber);
    }

    public void insertGroup(GroupActivity group) {

    }

    public void insertCycle(CycleActivity cycle) {

    }

    public void insertCourse(CourseActivity course) {

    }

    public void insertScheduleDay(ScheduleDayActivity scheduleDay) {

    }

    public void deleteEmail(String email) {

    }

    public void deletePhoneNumber(int phoneNumber) {

    }

    public void deleteGroup(GroupActivity group) {

    }

    public void deleteCycle(CycleActivity cycle) {

    }

    public void deleteCourse(CourseActivity course) {

    }

    public void deleteScheduleDay(ScheduleDayActivity scheduleDay) {

    }
}

