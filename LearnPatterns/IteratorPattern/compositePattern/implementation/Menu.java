package LearnPatterns.IteratorPattern.compositePattern.implementation;

import java.util.ArrayList;
import java.util.Iterator;

import LearnPatterns.IteratorPattern.compositePattern.interfaces.MenuComponent;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList();
    String name;
    String description;
    Iterator iterator = null;
  
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
 
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }
 
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }
 
    public MenuComponent getChild(int i) {
        return (MenuComponent)this.menuComponents.get(i);
    }
 
    public String getName() {
        return this.name;
    }
 
    public String getDescription() {
        return this.description;
    }
 
    public void print() {
        System.out.print("\n" + this.getName());
        System.out.println(", " + this.getDescription());
        System.out.println("---------------------");

        Iterator iterator = this.menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    public Iterator createIterator() {
        if (this.iterator == null) {
            this.iterator = new CompositeIterator(this.menuComponents.iterator());
        }
        
        return this.iterator;
    }
 }
