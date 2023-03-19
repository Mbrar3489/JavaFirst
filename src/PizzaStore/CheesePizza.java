package PizzaStore;

public class CheesePizza implements PizzaStore{


    @Override
    public int getPrice() {
        return 16;
    }

    @Override
    public int getCalories() {
        return 200;
    }

    @Override
    public String getProductDescription() {
        return "Regular Dough + Base Sauce + Cheese";
    }

    @Override
    public String itemName() {

        return "Cheese Pizza";


    }
}
