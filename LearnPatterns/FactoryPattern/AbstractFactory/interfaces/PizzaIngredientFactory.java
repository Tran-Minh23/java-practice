package LearnPatterns.FactoryPattern.AbstractFactory.interfaces;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
}
