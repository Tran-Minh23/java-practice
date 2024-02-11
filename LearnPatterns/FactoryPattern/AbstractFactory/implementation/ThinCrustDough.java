package LearnPatterns.FactoryPattern.AbstractFactory.implementation;

import LearnPatterns.FactoryPattern.AbstractFactory.interfaces.Dough;

public class ThinCrustDough extends Dough {
    
    public ThinCrustDough() {
        this.name = "Thin Crust Dough";
    }
}
