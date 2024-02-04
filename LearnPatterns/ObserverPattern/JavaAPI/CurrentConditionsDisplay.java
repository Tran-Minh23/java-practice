package LearnPatterns.ObserverPattern.JavaAPI;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplay implements PropertyChangeListener {
    private float temperature;
    private float humidity;
    
    public CurrentConditionsDisplay() {
    }
    
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }
    
    public void display() {
        System.out.println("Current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt);
        // System.out.println("Current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity");
    }
}
