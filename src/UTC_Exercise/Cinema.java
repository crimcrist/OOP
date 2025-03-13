package UTC_Exercise;

import java.util.*;

public class Cinema {
	private String name;
	private String location;
	private List<Hall>halls;
	private List<Employee> employees;
	
	public Cinema(String name, String location) {
		this.name = name;
		this.location = location;
		this.halls = new ArrayList<>();
		this.employees = new ArrayList<>();
	}
	
	public void addHall (Hall hall) {
		halls.add(hall);
	}
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public void displayCinemaInfo() {
		System.out.println ("Cinema : " + name);
		System.out.println ("Location : " + location);
		
		for (Employee e : employees) {
			System.out.println("- Name : " + e.getName() + ", Role : " + e.getRole());
		}
		
		for (Hall h : halls) {
			h.displayHallInfo();
		}
		
		System.out.println("\nCustomers: ");
		displayCustomer();
	}
	
	public void displayCustomer() {
		boolean hasCustomers = false;
		for (Hall hall : halls) {
			for (Showtime showtime : hall.getShowtimes()) {
				for (Ticket ticket : showtime.getTickets()) {
					hasCustomers = true;
					ticket.getCustomer().displayCustomerInfo();
					ticket.displayCustomerTicketInfo();
				}
			}
		}
		if (!hasCustomers) {
			System.out.println("No Customers yet.");
		}
	}
	
}
