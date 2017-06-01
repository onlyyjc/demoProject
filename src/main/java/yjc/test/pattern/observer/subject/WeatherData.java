package yjc.test.pattern.observer.subject;

import java.util.Observable;


/**
 * 气象数据,继承了Observable类。
* 
* @Description
* 	气象站收集数据，包括气温和湿度情况。当这些天气数据发生变化的时候，将数据发送出去，给她的观察者
* 
* @Date 2015-7-31 下午3:50:18 
* @Author yangjiachang
 */
public class WeatherData extends Observable{
	
	private float temperature;
	private float humidity;
	
	public void measurements(float temperature,float humidity){
		System.out.println(temperature+"   "+humidity);
		this.temperature = temperature;
		this.humidity = humidity;
		setChanged();
		notifyObservers();
//		notifyObservers(this);
	}
	
	
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
}
