package com.example.weather741.Data;

import com.google.gson.annotations.SerializedName;

public class Snow{

	@SerializedName("3h")
	private double jsonMember3h;

	public double getJsonMember3h(){
		return jsonMember3h;
	}
}