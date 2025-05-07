package academic;

import actor.Lecturer;
import actor.Student;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String classCode;
    private int semester;
    private String year;
    private Course course;
    private List<Student> students = new ArrayList<>();
    private Lecturer lecturer;
    private List<String> attendanceList = new ArrayList<>();

    public Class(String code, int semester, String year) {
        this.classCode = code;
        this.semester = semester;
        this.year = year;
    }

    public void addStudent(Student s) {
        students.add(s);
        if (course != null) {
            s.addCredit(semester, course.getCredit());
        }
    }

    public void addLecturer(Lecturer l) {
        this.lecturer = l;
        if (course != null) {
            l.assignCourse(semester, course);
        }
    }

    public void attend(IAttendant a) {
        a.attend();
        if (a instanceof Student) {
            attendanceList.add(((Student) a).getName());
        }
    }

    public void takeAttendance(IAttendee a) {
        a.takeAttendance();
    }

    public void showTodayAttendance() {
        System.out.println("Today's Attendance:");
        for (String name : attendanceList) {
            System.out.println("- " + name);
        }
    }

    public void setCourse(Course c) {
        this.course = c;
    }
}
