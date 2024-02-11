package LearnPatterns.FactoryPattern.implementation;

import LearnPatterns.FactoryPattern.interfaces.Pizza;
import LearnPatterns.FactoryPattern.interfaces.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    Pizza pizza = null;

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            this.pizza = new NYStyleCheesePizza();
            this.pizza.setName("New York Style Cheese Pizza");

            return this.pizza;
        } else return null;
    }
 }
