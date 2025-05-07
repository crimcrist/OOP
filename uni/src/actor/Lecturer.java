package actor;

import academic.IAttendee;
import academic.Course;

import java.util.HashMap;
import java.util.Map;

public class Lecturer implements IAttendee {
    private String lecturerCode;
    private String name;
    private String dob;
    private Map<Integer, Course> courses = new HashMap<>();

    public Lecturer(String code, String name, String dob) {
        this.lecturerCode = code;
        this.name = name;
        this.dob = dob;
    }

    public void assignCourse(int semester, Course course) {
        courses.put(semester, course);
    }

    @Override
    public void takeAttendance() {
        System.out.println(name + " is taking attendance.");
    }

    public void showCourse(int semester) {
        Course course = courses.get(semester);
        if (course != null) {
            System.out.println(name + " is teaching " + course.getCourseName() + " in semester " + semester);
        } else {
            System.out.println(name + " has no course in semester " + semester);
        }
    }
}
