package com.example.weather741.Data;

import com.google.gson.annotations.SerializedName;

public class Main{

	@SerializedName("temp")
	private double temp;

	@SerializedName("temp_min")
	private int tempMin;

	@SerializedName("humidity")
	private int humidity;

	@SerializedName("pressure")
	private int pressure;

	@SerializedName("feels_like")
	private double feelsLike;

	@SerializedName("temp_max")
	private int tempMax;

	public double getTemp(){
		return temp;
	}

	public int getTempMin(){
		return tempMin;
	}

	public int getHumidity(){
		return humidity;
	}

	public int getPressure(){
		return pressure;
	}

	public double getFeelsLike(){
		return feelsLike;
	}

	public int getTempMax(){
		return tempMax;
	}
}