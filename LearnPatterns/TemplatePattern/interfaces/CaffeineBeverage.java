package LearnPatterns.TemplatePattern.interfaces;

public abstract class CaffeineBeverage {
 
    final void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addCondiments();
    }

    protected abstract void brew();
    
    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Boiling water");
    }
    
    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }
   }
