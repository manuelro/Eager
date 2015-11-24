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

        int value;
        if (head == null) head = new Node(email);
        else if (head.getNext() == null) {
            Node aux = head;
            value = aux.getEmail().compareTo(email);
            if (value > 0) {
                Node temp = new Node(email);
                temp.setNext(aux);
                head = temp;
            } else aux.setNext(new Node(email));
        } else {
            Node aux = head;

            if (aux.getEmail().compareTo(email) > 0) {
                Node temp = new Node(email);
                temp.setNext(aux);
                aux = temp;
            }
            boolean created = false;
            while (aux.getNext() != null) {

                value = aux.getNext().getEmail().compareTo(email);
                if (value > 0) {
                    Node temp = new Node(email);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                    created = true;
                } else {
                    aux = aux.getNext();
                }
            }
            if (!created) {
                aux.setNext(new Node(email));
            }
        }
    }

    public void insertPhoneNumber(int phoneNumber) {

        if (head == null) head = new Node(phoneNumber);
        else if (head.getNext() == null) {
            Node aux = head;
            if (aux.getPhoneNumber() > phoneNumber) {
                Node temp = new Node(phoneNumber);
                temp.setNext(aux);
                head = temp;
            } else aux.setNext(new Node(phoneNumber));
        } else {
            Node aux = head;

            if (aux.getPhoneNumber() > phoneNumber) {
                Node temp = new Node(phoneNumber);
                temp.setNext(aux);
                aux = temp;
            }
            boolean created = false;
            while (aux.getNext() != null) {

                if (aux.getNext().getPhoneNumber() > phoneNumber) {
                    Node temp = new Node(phoneNumber);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                    created = true;
                } else {
                    aux = aux.getNext();
                }
            }
            if (!created) {
                aux.setNext(new Node(phoneNumber));
            }
        }
    }

    public void insertGroup(GroupActivity group) {
        int value;
        if (head == null) head = new Node(group);
        else if (head.getNext() == null) {
            Node aux = head;
            value = aux.getGroup().getName().compareTo(group.getName());
            if (value > 0) {
                Node temp = new Node(group);
                temp.setNext(aux);
                head = temp;
            } else aux.setNext(new Node(group));
        } else {
            Node aux = head;

            if (aux.getGroup().getName().compareTo(group.getName()) > 0) {
                Node temp = new Node(group);
                temp.setNext(aux);
                aux = temp;
            }
            boolean created = false;
            while (aux.getNext() != null) {

                value = aux.getNext().getGroup().getName().compareTo(group.getName());
                if (value > 0) {
                    Node temp = new Node(group);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                    created = true;
                } else {
                    aux = aux.getNext();
                }
            }
            if (!created) {
                aux.setNext(new Node(group));
            }
        }
    }

    public void insertCycle(CycleActivity cycle) {
        int value;
        if (head == null) head = new Node(cycle);
        else if (head.getNext() == null) {
            Node aux = head;
            value = aux.getCycle().getCycleId().compareTo(cycle.getCycleId());
            if (value > 0) {
                Node temp = new Node(cycle);
                temp.setNext(aux);
                head = temp;
            } else aux.setNext(new Node(cycle));
        } else {
            Node aux = head;

            if (aux.getCycle().getCycleId().compareTo(cycle.getCycleId()) > 0) {
                Node temp = new Node(cycle);
                temp.setNext(aux);
                aux = temp;
            }
            boolean created = false;
            while (aux.getNext() != null) {

                value = aux.getNext().getCycle().getCycleId().compareTo(cycle.getCycleId());
                if (value > 0) {
                    Node temp = new Node(cycle);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                    created = true;
                } else {
                    aux = aux.getNext();
                }
            }
            if (!created) {
                aux.setNext(new Node(cycle));
            }
        }
    }

    public void insertCourse(CourseActivity course) {
        int value;
        if (head == null) head = new Node(course);
        else if (head.getNext() == null) {
            Node aux = head;
            value = aux.getCourse().getName().compareTo(course.getName());
            if (value > 0) {
                Node temp = new Node(course);
                temp.setNext(aux);
                head = temp;
            } else aux.setNext(new Node(course));
        } else {
            Node aux = head;

            if (aux.getCourse().getName().compareTo(course.getName()) > 0) {
                Node temp = new Node(course);
                temp.setNext(aux);
                aux = temp;
            }
            boolean created = false;
            while (aux.getNext() != null) {

                value = aux.getNext().getCourse().getName().compareTo(course.getName());
                if (value > 0) {
                    Node temp = new Node(course);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                    created = true;
                } else {
                    aux = aux.getNext();
                }
            }
            if (!created) {
                aux.setNext(new Node(course));
            }
        }
    }

    public void insertScheduleDay(ScheduleDayActivity scheduleDay) {
        int value;
        if (head == null) head = new Node(scheduleDay);
        else if (head.getNext() == null) {
            Node aux = head;
            value = aux.getScheduleDay().getDate().compareTo(scheduleDay.getDate());
            if (value > 0) {
                Node temp = new Node(scheduleDay);
                temp.setNext(aux);
                head = temp;
            } else aux.setNext(new Node(scheduleDay));
        } else {
            Node aux = head;

            if (aux.getScheduleDay().getDate().compareTo(scheduleDay.getDate()) > 0) {
                Node temp = new Node(scheduleDay);
                temp.setNext(aux);
                aux = temp;
            }
            boolean created = false;
            while (aux.getNext() != null) {

                value = aux.getNext().getScheduleDay().getDate().compareTo(scheduleDay.getDate());
                if (value > 0) {
                    Node temp = new Node(scheduleDay);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                    created = true;
                } else {
                    aux = aux.getNext();
                }
            }
            if (!created) {
                aux.setNext(new Node(scheduleDay));
            }
        }
    }

    public void deleteEmail(String email) {
        Node aux = head;

        if (head.getEmail().compareTo(email) == 0) {
            head = aux.getNext();
        } else {
            while (aux.getNext() != null) {
                if (aux.getNext().getEmail().compareTo(email) == 0) {
                    Node temp = new Node(email);
                    aux.setNext(temp.getNext());
                    break;
                }
                aux = aux.getNext();
            }

        }

    }

    public void deletePhoneNumber(int phoneNumber) {

        Node aux = head;

        if (head.getPhoneNumber() ==  phoneNumber) {
            head = aux.getNext();
        } else {
            while (aux.getNext() != null) {
                if (aux.getNext().getPhoneNumber() == phoneNumber) {
                    Node temp = new Node(phoneNumber);
                    aux.setNext(temp.getNext());
                    break;
                }
                aux = aux.getNext();
            }

        }
    }

    public void deleteGroup(GroupActivity group) {

        Node aux = head;

        if (head.getGroup().getName().compareTo(group.getName()) == 0) {
            head = aux.getNext();
        } else {
            while (aux.getNext() != null) {
                if (aux.getNext().getGroup().getName().compareTo(group.getName()) == 0) {
                    Node temp = new Node(group);
                    aux.setNext(temp.getNext());
                    break;
                }
                aux = aux.getNext();
            }

        }
    }

    public void deleteCycle(CycleActivity cycle) {

        Node aux = head;

        if (head.getCycle().getCycleId().compareTo(cycle.getCycleId()) == 0) {
            head = aux.getNext();
        } else {
            while (aux.getNext() != null) {
                if (aux.getNext().getCycle().getCycleId().compareTo(cycle.getCycleId()) == 0) {
                    Node temp = new Node(cycle);
                    aux.setNext(temp.getNext());
                    break;
                }
                aux = aux.getNext();
            }

        }
    }

    public void deleteCourse(CourseActivity course) {

        Node aux = head;

        if (head.getCourse().getName().compareTo(course.getName()) == 0) {
            head = aux.getNext();
        } else {
            while (aux.getNext() != null) {
                if (aux.getNext().getCourse().getName().compareTo(course.getName()) == 0) {
                    Node temp = new Node(course);
                    aux.setNext(temp.getNext());
                    break;
                }
                aux = aux.getNext();
            }

        }
    }

    public void deleteScheduleDay(ScheduleDayActivity scheduleDay) {

        Node aux = head;

        if (head.getScheduleDay().getDate().compareTo(scheduleDay.getDate()) == 0) {
            head = aux.getNext();
        } else {
            while (aux.getNext() != null) {
                if (aux.getNext().getScheduleDay().getDate().compareTo(scheduleDay.getDate()) == 0) {
                    Node temp = new Node(scheduleDay);
                    aux.setNext(temp.getNext());
                    break;
                }
                aux = aux.getNext();
            }

        }
    }
}

