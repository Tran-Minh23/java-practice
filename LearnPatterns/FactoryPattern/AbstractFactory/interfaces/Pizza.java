package LearnPatterns.FactoryPattern.AbstractFactory.interfaces;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    protected abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
 
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}