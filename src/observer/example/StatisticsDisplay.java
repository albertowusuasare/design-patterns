package observer.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StatisticsDisplay implements WeatherDisplay {
    private List<WeatherData> historicalWeatherData;

    StatisticsDisplay(){
        this.historicalWeatherData = new ArrayList<>();
    }

    @Override
    public void display() {
        float averageTemperature = getAverage(WeatherData::getTemperature);
        float averagePressure = getAverage(WeatherData::getPressure);
        float averageHumidity = getAverage(WeatherData::getHumidity);
        System.out.println("Showing statistics display: ");
        System.out.println("Average Temperature: " + averageTemperature);
        System.out.println("Average Humidity: " + averageHumidity);
        System.out.println("Average Pressure: " + averagePressure);
    }

    private Float getAverage(Function<? super WeatherData, Float> weatherFunction){
        List<Float> historicalValues = getHistoricalValues(weatherFunction);
        return calculateAverage(historicalValues);
    }
    private List<Float> getHistoricalValues(Function<? super WeatherData, Float> function){
        return historicalWeatherData.stream().map(function).collect(Collectors.toList());
    }

    @Override
    public void notifyChange(WeatherData data) {
        setStatistics(data);
    }

    private void setStatistics(WeatherData data){
        historicalWeatherData.add(data);
        System.out.println("Setting statistics");
    }

    private static Float calculateAverage(List<Float> data){
       float sum = 0;
       Optional<Float> optionalSum = data.stream().reduce(Float::sum);
       if(optionalSum.isPresent()){
           sum= optionalSum.get();
       }
       return sum / data.size();
    }

}
