package LearnPatterns.IteratorPattern.implementation;

import java.util.ArrayList;
import LearnPatterns.IteratorPattern.interfaces.Menu;

public class Waitress {
    ArrayList<Menu> menus;
 
    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }
 
    public void printMenu() {
        java.util.Iterator menuIterator = this.menus.iterator();

        while(menuIterator.hasNext()) {
            Menu menu = (Menu)menuIterator.next();
            this.printMenu(menu.createIterator());
        }
    }
 
    private void printMenu(java.util.Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();

            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
