package UTC_Exercise;

import java.util.*;

public class Hall {
	private Integer hallNumber;
	private Integer capacity;
	private List<Showtime>showtimes;
	
	public Hall(Integer hallNumber, Integer capacity) {
		this.hallNumber = hallNumber;
		this.capacity = capacity;
		this.showtimes = new ArrayList<>();
	}
	
	public void addShowtime (Showtime showtime) {
		showtimes.add(showtime);
	}
	
	public List <Showtime> getShowtimes() {
		return showtimes;
	}
	
	public void displayHallInfo(){
		System.out.println("Hall" + hallNumber + "(Capacity: " + capacity + ")");
		System.out.println("    Showtime:");
		for (Showtime s : showtimes) {
			s.displayShowtimeInfo();
		}
	}
}
