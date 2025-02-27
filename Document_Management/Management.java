package Document_Management;


public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        DocumentManager manager = new DocumentManager();

        while (true) {
            System.out.println ("\nHov Document Manager");
            System.out.println ("========================================================================");
            System.out.println ("1. Register New Document");
            System.out.println ("Available Storage: " + manager.getAvailableStorage() + " MB / 1024 MB");
            System.out.println ("2. View All Document");
            System.out.println ("3. Approve Document");
            System.out.println ("4. Exit");
            System.out.print ("Choose Menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            



        }
    }

}
