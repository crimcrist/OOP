public class Dish {
    private String foodName;
    private String id;
    private Chef chef;

    public Dish (String foodName, String id, Chef chef){
        this.foodName = foodName;
        this.id = id;
        this.chef = chef;
        System.out.println("Dish added to menu: "+ foodName);
    }

    public String getFoodName(){
        return foodName;
    }

    public String getId(){
        return id;
    }

    public Chef getChef(){
        return chef;
    }

    void printDish (){
        System.out.println("Dish : " + foodName);
        System.out.println("ID : " + id);
        System.out.println("Chef : " + chef.getNama());
        System.out.println("Biography : " + chef.getBiography());
    }
}
