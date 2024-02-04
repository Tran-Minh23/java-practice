package LearnPatterns.ObserverPattern;

import LearnPatterns.ObserverPattern.JavaAPI.CurrentConditionsDisplay;
import LearnPatterns.ObserverPattern.JavaAPI.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.addPropertyChangeListener(currentDisplay);
        
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
