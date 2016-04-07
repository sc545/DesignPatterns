package observable;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){ }
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers(); // 여기선 풀 모델을 사용하고 있으므로 데이터 객체를 보내지는 않음
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}
}
