import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Dish> availableDishs = new ArrayList();

    void addDish(Dish dish){
        this.availableDishs.add(dish);
        System.out.println("Dish added to menu: " + dish.getFoodName());
    }

    void placeOrder (Customer customer, Dish dish){
        availableDishs.remove(dish);
        customer.orderList.add(dish);
        System.out.println(customer.getName() + " ordered: " + dish.getFoodName());
    }

    void cancelOrder(Customer customer, Dish dish){
        availableDishs.add(dish);
        customer.orderList.remove(dish);
        System.out.println(customer.getName() + " canceled order : " + dish.getFoodName());
    }

    void displayMenu(){
        System.out.println("Menu in Restaurant : ");
        for (Dish dish : availableDishs){
            dish.printDish();
        }
    }
}
