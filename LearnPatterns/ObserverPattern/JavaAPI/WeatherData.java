package LearnPatterns.ObserverPattern.JavaAPI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    private PropertyChangeSupport support;

    public WeatherData() {
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        this.support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        this.support.removePropertyChangeListener(pcl);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.support.firePropertyChange("temperature", this.temperature, temperature);
        this.support.firePropertyChange("humidity", this.humidity, humidity);
        this.support.firePropertyChange("humidity", this.pressure, pressure);

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    
}

