package LearnPatterns.FactoryPattern.AbstractFactory.implementation;

import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.Pizza;
import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.PizzaIngredientFactory;


public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    protected void prepare() {
        System.out.println("Preparing " + this.name);
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
}
