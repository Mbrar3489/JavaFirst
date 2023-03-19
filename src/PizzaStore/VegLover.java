package PizzaStore;

public class VegLover implements PizzaStore{

    @Override
    public int getPrice() {
        return 18;
    }

    @Override
    public int getCalories() {
        return 300;
    }

    @Override
    public String getProductDescription() {
        return "Regular Dough + Base Sauce + Cheese + Veggies";
    }

    @Override
    public String itemName() {
        return "Veggie Pizza";
    }
}
