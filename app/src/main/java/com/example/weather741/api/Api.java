package com.example.weather741.api;

import com.example.weather741.data.WeatherForecastResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://api.openweathermap.org/";
    String key = "5b61c4bb2a401b44df086a4203887071";
    String city = "Kharkiv";
    String cnt = "26";

    @GET("data/2.5/forecast")
    Call <WeatherForecastResult> getWeatherForecastResult(@Query("q") String city,
                                                          @Query("appid") String appId,
                                                          @Query("cnt") String cnt );

}
