package com.example.weather741.Data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class WeatherForecastResult {

	@SerializedName("city")
	private City city;

	@SerializedName("cnt")
	private int cnt;

	@SerializedName("cod")
	private String cod;

	@SerializedName("message")
	private int message;

	@SerializedName("list")
	private List<ListItem> list ;

	public City getCity(){
		return city;
	}

	public int getCnt(){
		return cnt;
	}

	public String getCod(){
		return cod;
	}

	public int getMessage(){
		return message;
	}

	public List<ListItem> getList(){
		return list;
	}


	public  class ListItem{

		@SerializedName("dt")
		public int dt;

		@SerializedName("pop")
		private int pop;

		@SerializedName("visibility")
		private int visibility;

		@SerializedName("dt_txt")
		public String dtTxt;

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

	public static class City{

		@SerializedName("country")
		private String country;

		@SerializedName("coord")
		private Coord coord;

		@SerializedName("sunrise")
		private int sunrise;

		@SerializedName("timezone")
		private int timezone;

		@SerializedName("sunset")
		private int sunset;

		@SerializedName("name")
		public String name;

		@SerializedName("id")
		private int id;

		@SerializedName("population")
		private int population;

		public String getCountry(){
			return country;
		}

		public Coord getCoord(){
			return coord;
		}

		public int getSunrise(){
			return sunrise;
		}

		public int getTimezone(){
			return timezone;
		}

		public int getSunset(){
			return sunset;
		}

		public String getName(){
			return name;
		}

		public int getId(){
			return id;
		}

		public int getPopulation(){
			return population;
		}
	}
}