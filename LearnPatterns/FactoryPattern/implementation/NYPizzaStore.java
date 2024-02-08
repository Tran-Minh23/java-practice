package LearnPatterns.FactoryPattern.implementation;

import LearnPatterns.FactoryPattern.interfaces.Pizza;
import LearnPatterns.FactoryPattern.interfaces.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
    }
 }
