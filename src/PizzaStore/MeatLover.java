package PizzaStore;

public class MeatLover implements PizzaStore{

    @Override
    public int getPrice(){
        return 20;
    }

    @Override
    public int getCalories() {
        return 400;
    }

    @Override
    public String getProductDescription() {
        return "Regular Dough + Base Sauce + Cheese + Meat";
    }

    @Override
    public String itemName() {
        return "MeatLover Pizza";
    }
}
