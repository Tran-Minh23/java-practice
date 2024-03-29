package LearnPatterns.TemplatePattern.interfaces;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if (this.customerWantsCondiments()) {
            this.addCondiments();
        }
    }

    protected abstract void brew();
    
    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Boiling water");
    }
    
    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }
}
