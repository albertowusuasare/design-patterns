package observer.example;

public class WeatherStationSimulation {

    public static void main(String ... args){
        WeatherStation weatherStation = new WeatherStation();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.setCurrentConditions(82, 20,100);
        weatherStation.setCurrentConditions(82, 20,100);
        weatherStation.setCurrentConditions(84, 22,102);
        weatherStation.setCurrentConditions(84, 22,102);
        statisticsDisplay.display();

    }
}
