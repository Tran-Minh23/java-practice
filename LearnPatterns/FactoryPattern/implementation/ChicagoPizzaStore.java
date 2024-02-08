package LearnPatterns.FactoryPattern.implementation;

import LearnPatterns.FactoryPattern.interfaces.Pizza;
import LearnPatterns.FactoryPattern.interfaces.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
    
}
