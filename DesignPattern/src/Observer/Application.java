package Observer;

/* Loose Coupling */

public class Application {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 24);
		weatherData.setMeasurements(24, 1, 55);
		weatherData.removeObserver(statisticsDisplay);
		weatherData.setMeasurements(33, 100, 77);
	}
}
