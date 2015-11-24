package co.eagerapp.manuelro.eager.Structures.Node;

import co.eagerapp.manuelro.eager.Course.CourseActivity;
import co.eagerapp.manuelro.eager.Course.Plain.CourseModel;
import co.eagerapp.manuelro.eager.Cycle.CycleActivity;
import co.eagerapp.manuelro.eager.Cycle.Plain.CycleModel;
import co.eagerapp.manuelro.eager.Group.GroupActivity;
import co.eagerapp.manuelro.eager.Group.Plain.GroupModel;
import co.eagerapp.manuelro.eager.ScheduleDay.Plain.ScheduleDayModel;
import co.eagerapp.manuelro.eager.ScheduleDay.ScheduleDayActivity;

public class Node {

    private String email;
    private int phoneNumber;
    private CourseModel course;
    private CycleModel cycle;
    private GroupModel group;
    private ScheduleDayModel scheduleDay;
    private Node next;

    public Node(String email) {
        this.setEmail(email);
    }

    public Node(int phoneNumber) {
        this.setPhoneNumber(phoneNumber);
    }

    public Node(CycleModel cycle) {
        this.setCycle(cycle);
    }

    public Node(CourseModel course) {
        this.setCourse(course);
    }

    public Node(GroupModel group) {
        this.setGroup(group);
    }

    public Node(ScheduleDayModel scheduleDay) {
        this.setScheduleDay(scheduleDay);
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

    public CourseModel getCourse() {
        return course;
    }

    public void setCourse(CourseModel course) {
        this.course = course;
    }

    public CycleModel getCycle() {
        return cycle;
    }

    public void setCycle(CycleModel cycle) {
        this.cycle = cycle;
    }

    public GroupModel getGroup() {
        return group;
    }

    public void setGroup(GroupModel group) {
        this.group = group;
    }

    public ScheduleDayModel getScheduleDay() {
        return scheduleDay;
    }

    public void setScheduleDay(ScheduleDayModel scheduleDay) {
        this.scheduleDay = scheduleDay;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}

