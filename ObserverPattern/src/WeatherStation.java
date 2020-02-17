public class WeatherStation {

    public static void main_old(String[] args) {
	    WeatherData weatherData = new WeatherData();

	    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

	    weatherData.setMeasurements(80, 65, 30.4f);
	    weatherData.setMeasurements(82, 70, 29.2f);
	    weatherData.setMeasurements(78, 90, 29.2f);
    }

	public static void main(String[] args) {
		WeatherData1 weatherData = new WeatherData1();

		CurrentConditionsDisplay1 currentDisplay = new CurrentConditionsDisplay1(weatherData);
		//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay1 forecastDisplay = new ForecastDisplay1(weatherData);
		//HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
