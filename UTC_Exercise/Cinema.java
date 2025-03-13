import java.util.*;

public class Cinema {
    private String name;
    private String location;
    private List<Hall> halls;
    private List<Employee> employees;

    public Cinema(String name, String location) {
        this.name = name;
        this.location = location;
        this.halls = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayCinemaInfo() {
        System.out.println("Cinema: " + name);
        System.out.println("Location: " + location);
        System.out.println("\nEmployees:");
        for (Employee emp : employees) {
            System.out.println("- Name: " + emp.getName() + ", Role: " + emp.getRole());
        }

        System.out.println("\nHalls:");
        for (Hall hall : halls) {
            hall.displayHallInfo();
        }
    }
}