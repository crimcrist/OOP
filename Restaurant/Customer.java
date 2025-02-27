import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    List<Dish> orderList = new ArrayList();

    public Customer (String nama){
        this.name = nama;
    }

    public String getName(){
        return name;
    }

    void displayOrders(){
        System.out.println(name + "s orders");
        for (Dish dish : orderList){
            dish.printDish();
        }
    }


}
