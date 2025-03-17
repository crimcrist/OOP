package UTC_Exercise;

import java.util.*;

public class Hall {
	private int hallNumber;
	private int capacity;
	private List<Showtime>showtimes;
	public Hall(int hallNumber, int capacity) {
		this.hallNumber = hallNumber;
		this.capacity = capacity;
		this.showtimes = new ArrayList<>();
	}
	public int getHallNumber() {
		return hallNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public List<Showtime> getShowtimes() {
		return showtimes;
	}
	
	public void addShowtime(Showtime showtime) {
		showtimes.add(showtime);
	}
	
}
