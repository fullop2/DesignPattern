package Observer;

public class StatisticsDisplay implements DisplayElement, Observer {
	
	private int countOfTemperature;
	private float sumOfTemperature;
	private float minTemperature;
	private float maxTemperature;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		minTemperature = Float.MAX_VALUE;
		maxTemperature = Float.MIN_VALUE;
		
		weatherData.registerObserver(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		countOfTemperature++;
		sumOfTemperature += temp;
		minTemperature = Math.min(minTemperature, temp);
		maxTemperature = Math.max(maxTemperature, temp);
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("AVG/MAX/MIN temperature = "
		+String.format("%.1f %.1f %.1f", 
				sumOfTemperature/countOfTemperature, 
				maxTemperature, 
				minTemperature));
	}

}
