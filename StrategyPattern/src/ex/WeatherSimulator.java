package ex;

public class WeatherSimulator {

	public static void main(String[] args) {
		Station s = new Broadcast();
		s.broadcast();
		s.checkWeather();
		s.setWeather(new Windy());
		s.checkWeather();
	}

}
