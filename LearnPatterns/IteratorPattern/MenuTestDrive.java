package LearnPatterns.IteratorPattern;

import LearnPatterns.IteratorPattern.implementation.DinerMenu;
import LearnPatterns.IteratorPattern.implementation.PancakeHouseMenu;
import LearnPatterns.IteratorPattern.implementation.Waitress;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
 
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
 
        waitress.printMenu();
    }
 }
