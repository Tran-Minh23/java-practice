package LearnPatterns.IteratorPattern.implementation;

import LearnPatterns.IteratorPattern.interfaces.Iterator;
import LearnPatterns.IteratorPattern.interfaces.Menu;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
 
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
 
    public void printMenu() {
        Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator dinerIterator = this.dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        this.printMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        this.printMenu(dinerIterator);
    }
 
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();

            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
