package LearnPatterns.FactoryPattern.interfaces;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    // protected Veggies veggies[];
    // protected Cheese cheese;
    // protected Pepperoni pepperoni;
    // protected Clams clam;
    protected ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing this.dough...");
        System.out.println("Adding this.sauce...");
        System.out.println("Adding toppings: ");

        for (int i = 0; i < this.toppings.size(); i++) {
            System.out.println(" " + this.toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
 
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
