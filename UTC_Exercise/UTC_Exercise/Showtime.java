package UTC_Exercise;

import java.util.*;

public class Showtime {
	private String time;
	private String date;
	private Movie movie;
	private List<Ticket>tickets;
	
	public Showtime(String time, String date, Movie movie) {
		this.time = time;
		this.date = date;
		this.movie = movie;
		this.tickets = new ArrayList<>();
	}
	public String getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}
	public Movie getMovie() {
		return movie;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
}
