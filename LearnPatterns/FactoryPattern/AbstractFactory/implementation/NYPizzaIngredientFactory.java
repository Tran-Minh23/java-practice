package LearnPatterns.FactoryPattern.AbstractFactory.implementation;

import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.Dough;
import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.PizzaIngredientFactory;
import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
