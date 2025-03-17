package UTC_Exercise;

import java.util.*;

public class Cinema {
	private String name;
	private String location;
	private List<Employee>employees;
	private List<Hall>halls;
	
	public Cinema(String name, String location) {
		this.name = name;
		this.location = location;
		this.employees = new ArrayList<>();
		this.halls = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public List<Hall> getHalls() {
		return halls;
	}
	
	public void addHall(Hall hall) {
		halls.add(hall);
	}
	
	public void addEmployee (Employee employee) {
		employees.add(employee);
	}
	
	public void displayCinemaInfo() {
		System.out.println("Cinema : " + name);
		System.out.println("Location : " + location);
		System.out.println("Employees:");
		for (Employee employe : employees) {
			System.out.println ("    - Name : "  + employe.getName() + ", Role: " + employe.getRole());
		}
		System.out.println("Halls:"); 
		for (Hall hall : halls) {
			System.out.println ("Hall: "  + hall.getHallNumber()+ "(Capacity: " + hall.getCapacity() + ")");
			System.out.println("Showtimes: "); 
			for (Showtime showtime : hall.getShowtimes()) {
				System.out.println ("- Movie: " + showtime.getMovie().getTitle());
				System.out.println ("  Time: " + showtime.getTime() + ",Date: " + showtime.getDate());
				System.out.println ("Tickets:");
				for (Ticket ticket : showtime.getTickets()){
					if (showtime.getTickets().isEmpty()) {
						System.out.println("No tickets booked yet");
					} else {
						System.out.println(" *Ticket ID: " + ticket.getId() + ", Price: " + ticket.getPrice() + ", Customer: " + ticket.getCustomer().getName());
					}
				}
			}
		}
		
		System.out.println("Customers:")
		for (Hall hall : halls) {
			for (Showtime showtime : hall.getShowtimes()) {
				for (Ticket ticket : showtime.getTickets()) {
					System.out.println("- Nama : " + ticket.getCustomer().getName() + ", Age: " + ticket.getCustomer().getAge());
					System.out.println ("* Ticket ID : " + showtime.getTickets().getId(), + ", Movie : " + ticket.get)
				}
			}
		}
	}
}
