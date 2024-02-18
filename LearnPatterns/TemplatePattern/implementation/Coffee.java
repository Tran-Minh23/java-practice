package LearnPatterns.TemplatePattern.implementation;

import LearnPatterns.TemplatePattern.interfaces.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
