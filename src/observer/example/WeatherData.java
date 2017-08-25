package observer.example;


/**
 * Encapsulate the state of the weather at any point in time
 */
public class WeatherData  {

    private final float temperature;
    private final float humidity;
    private final float pressure;

    WeatherData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


}
