import java.util.*;

public class Customer {
    private String name;
    private int age;
    private List<Ticket> tickets;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.tickets = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void displayCustomerInfo() {
        System.out.println("- Name: " + name + ", Age: " + age);
        System.out.println("  Tickets:");
        for (Ticket ticket : tickets) {
            ticket.displayCustomerTicketInfo();
        }
    }
}
