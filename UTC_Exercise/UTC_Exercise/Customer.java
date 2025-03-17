package UTC_Exercise;

import java.util.*;

public class Customer {
	private String name;
	private int age;
	private List<Ticket>tickets;
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.tickets = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
}
