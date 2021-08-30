package observe_pattern.vd1;

public class test {
    public static void main(String[] args) {
        Whetherdata weatherData = new Whetherdata();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
