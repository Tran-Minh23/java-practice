package LearnPatterns.FactoryPattern.interfaces;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake(); 
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
