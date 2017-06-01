package yjc.test.pattern.observer.observer;


import yjc.test.pattern.observer.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;


public class ObserverA implements Observer{
	
	private float temperature;
	private float humidity;

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData date = (WeatherData)o;
			this.temperature = date.getTemperature();
			this.humidity = date.getHumidity();
			display();
		}
	}
	
	public void display(){
		System.out.println("来自于ObserverA的数据");
		System.out.println("temperature="+this.temperature+";humidity="+this.humidity);
	}

}
