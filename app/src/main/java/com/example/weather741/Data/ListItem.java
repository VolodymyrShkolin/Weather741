package com.example.weather741.Data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ListItem{

	@SerializedName("dt")
	private int dt;

	@SerializedName("pop")
	private int pop;

	@SerializedName("visibility")
	private int visibility;

	@SerializedName("dt_txt")
	private String dtTxt;

	@SerializedName("snow")
	private Snow snow;

	@SerializedName("weather")
	private List<WeatherItem> weather;

	@SerializedName("main")
	private Main main;

	@SerializedName("clouds")
	private Clouds clouds;

	@SerializedName("sys")
	private Sys sys;

	@SerializedName("wind")
	private Wind wind;

	public int getDt(){
		return dt;
	}

	public int getPop(){
		return pop;
	}

	public int getVisibility(){
		return visibility;
	}

	public String getDtTxt(){
		return dtTxt;
	}

	public Snow getSnow(){
		return snow;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public Main getMain(){
		return main;
	}

	public Clouds getClouds(){
		return clouds;
	}

	public Sys getSys(){
		return sys;
	}

	public Wind getWind(){
		return wind;
	}
}