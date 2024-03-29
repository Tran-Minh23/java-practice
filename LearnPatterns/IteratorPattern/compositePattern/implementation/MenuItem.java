package LearnPatterns.IteratorPattern.compositePattern.implementation;

import java.util.Iterator;

import LearnPatterns.IteratorPattern.compositePattern.interfaces.MenuComponent;

public class MenuItem extends MenuComponent {
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
  
    public void print() {
        System.out.print("  " + this.getName());

        if (this.isVegetarian()) {
            System.out.print("(v)");
        }

        System.out.println(", " + this.getPrice());
        System.out.println("     -- " + this.getDescription());
    }
     
    public Iterator createIterator() {
        return new NullIterator();
    }

 }
