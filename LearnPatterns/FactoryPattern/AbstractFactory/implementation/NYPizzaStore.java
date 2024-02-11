package LearnPatterns.FactoryPattern.AbstractFactory.implementation;

import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.Pizza;
import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.PizzaIngredientFactory;
import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory pizzaIngredientFactory;

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            this.pizza = new CheesePizza(this.pizzaIngredientFactory);
            this.pizza.setName("New York Style Cheese Pizza");

            return this.pizza;
        } else return null;
    }
 }
