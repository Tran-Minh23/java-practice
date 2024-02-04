package LearnPatterns.ObserverPattern.implementation;

import LearnPatterns.ObserverPattern.interfaces.DisplayElement;
import LearnPatterns.ObserverPattern.interfaces.Observer;
import LearnPatterns.ObserverPattern.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }
    
    public void display() {
        System.out.println("Current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity");
    }
   }
