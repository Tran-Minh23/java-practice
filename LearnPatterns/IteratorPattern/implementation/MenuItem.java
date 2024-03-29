package LearnPatterns.IteratorPattern.implementation;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;
 
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
  
    public String getName() {
        return this.name;
    }
  
    public String getDescription() {
        return this.description;
    }
  
    public double getPrice() {
        return this.price;
    }
  
    public boolean isVegetarian() {
        return this.vegetarian;
    }
}
