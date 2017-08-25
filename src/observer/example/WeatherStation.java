package observer.example;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable<WeatherData> {
    private WeatherData weatherData;
    List<Observer<WeatherData>> observers;

    WeatherStation(List<Observer<WeatherData>> observers){
        this.weatherData = new WeatherData(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.observers = observers;
    }

    WeatherStation(){
        this(new ArrayList<>());
    }

    @Override
    public void registerObserver(Observer<WeatherData> observer) {
        this.observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer<WeatherData> observer) {

    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.notifyChange(this.weatherData));
    }

    public void setCurrentConditions(float temperature, float humidity, float pressure ){
        this.weatherData = new WeatherData(temperature, humidity, pressure);
        notifyObservers();
    }
}
