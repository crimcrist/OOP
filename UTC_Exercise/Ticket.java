public class Ticket {
    private Integer id;
    private Double price;
    private Boolean paymentStatus;
    private Customer customer;

    public Ticket(int id, double price, Customer customer) {
        this.id = id;
        this.price = price;
        this.customer = customer;
        this.paymentStatus = true; // Assume payment is made
    }

    public void displayTicketInfo() {
        System.out.println("        * Ticket ID: " + id + ", Price: $" + price + ", Customer: " + customer.getName() + ", Payment Status: Paid");
    }

    public void displayCustomerTicketInfo() {
        System.out.println("    * Ticket ID: " + id + ", Movie: " + "N/A" + ", Price: $" + price + ", Status: Paid");
    }
}