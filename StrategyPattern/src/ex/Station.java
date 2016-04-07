package ex;

public abstract class Station {
	WeatherState ws;
	abstract void broadcast();
	public void checkWeather() {
		ws.state();
	}
	public void setWeather(WeatherState ws) {
		this.ws = ws;
	}
}
