package observer.example;

import observer.Observer;


public interface WeatherDisplay extends Observer<WeatherData> {
    void display();
}
