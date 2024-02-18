package LearnPatterns.TemplatePattern.implementation;

import LearnPatterns.TemplatePattern.interfaces.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
