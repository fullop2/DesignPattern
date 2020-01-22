package ObserverJavaUtil;

public class Application {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 24);
		weatherData.setMeasurements(24, 1, 55);
		weatherData.deleteObserver(currentDisplay);
		weatherData.setMeasurements(33, 100, 77);
		weatherData.addObserver(currentDisplay);
		weatherData.setMeasurements(80, 65, 24);
		weatherData.setMeasurements(24, 1, 55);
	}
}
