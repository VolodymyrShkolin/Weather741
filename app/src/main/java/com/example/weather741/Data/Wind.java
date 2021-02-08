package com.example.weather741.Data;

import com.google.gson.annotations.SerializedName;

public class Wind{

	@SerializedName("deg")
	private int deg;

	@SerializedName("speed")
	private int speed;

	public int getDeg(){
		return deg;
	}

	public int getSpeed(){
		return speed;
	}
}