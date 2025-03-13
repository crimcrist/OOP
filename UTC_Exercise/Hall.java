import java.util.*;

public class Hall {
    private int hallNumber;
    private int capacity;
    private List<Showtime> showtimes;

    public Hall(int hallNumber, int capacity) {
        this.hallNumber = hallNumber;
        this.capacity = capacity;
        this.showtimes = new ArrayList<>();
    }

    public void addShowtime(Showtime showtime) {
        showtimes.add(showtime);
    }

    public void displayHallInfo() {
        System.out.println("Hall " + hallNumber + " (Capacity: " + capacity + ")");
        System.out.println("  Showtimes:");
        for (Showtime showtime : showtimes) {
            showtime.displayShowtimeInfo();
        }
    }
}
