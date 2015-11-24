package co.eagerapp.manuelro.eager.Structures.Node;

import co.eagerapp.manuelro.eager.Course.CourseActivity;
import co.eagerapp.manuelro.eager.Cycle.CycleActivity;
import co.eagerapp.manuelro.eager.Group.GroupActivity;
import co.eagerapp.manuelro.eager.ScheduleDay.ScheduleDayActivity;

public class Node {

    private String email;
    private int phoneNumber;
    private CourseActivity course;
    private CycleActivity cycle;
    private GroupActivity group;
    private ScheduleDayActivity scheduleDay;
    private Node next;

    public Node(String email) {
        this.setEmail(email);
    }

    public Node(int phoneNumber) {
        this.setPhoneNumber(phoneNumber);
    }

    public Node(CycleActivity cycle) {
        this.setCycle(cycle);
    }

    public Node(CourseActivity course) {
        this.setCourse(course);
    }

    public Node(GroupActivity group) {
        this.setGroup(group);
    }

    public Node(ScheduleDayActivity scheduleDay) {
        this.setScheduleDay(scheduleDay);
    }

    public CourseActivity getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCourse(CourseActivity course) {
        this.course = course;
    }

    public CycleActivity getCycle() {
        return cycle;
    }

    public void setCycle(CycleActivity cycle) {
        this.cycle = cycle;
    }

    public GroupActivity getGroup() {
        return group;
    }

    public void setGroup(GroupActivity group) {
        this.group = group;
    }

    public ScheduleDayActivity getScheduleDay() {
        return scheduleDay;
    }

    public void setScheduleDay(ScheduleDayActivity scheduleDay) {
        this.scheduleDay = scheduleDay;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}

