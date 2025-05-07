package academic;

public class Course {
    private String courseCode;
    private String courseName;
    private int credit;

    public Course(String code, String name, int credit) {
        this.courseCode = code;
        this.courseName = name;
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public String getCourseName() {
        return courseName;
    }
}
