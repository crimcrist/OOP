package actor;

import academic.IAttendant;

import java.util.HashMap;
import java.util.Map;

public class Student implements IAttendant {
    private String nim;
    private String name;
    private String dob;
    private Map<Integer, Integer> credits = new HashMap<>();

    public Student(String nim, String name, String dob) {
        this.nim = nim;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public void attend() {
        System.out.println(name + " has attended the class.");
    }

    public void addCredit(int semester, int credit) {
        credits.put(semester, credits.getOrDefault(semester, 0) + credit);
    }

    public void showCredits(int semester) {
        System.out.println(name + " has " + credits.getOrDefault(semester, 0) + " credits in semester " + semester);
    }

    public String getName() {
        return name;
    }
}
