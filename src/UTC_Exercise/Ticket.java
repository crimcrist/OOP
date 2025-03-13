package UTC_Exercise;

public class Ticket {
	private int id;
	private double price;
	private boolean paymentStatus;
	private Customer customer;
	
	public Ticket(int id, double price, Customer customer) {
		this.id = id;
		this.price = price;
		this.customer = customer;
		this.paymentStatus = true;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void displayTicketInfo() {
		System.out.println ("    * Ticket ID : " + id + ", Price: " + price + ", Customer: " + customer.getName());
	}
	
	
    public void displayCustomerTicketInfo() {
        System.out.println("    * Ticket ID: " + id + ", Movie: " + "N/A" + ", Price: $" + price + ", Status: Paid");
    }
}
