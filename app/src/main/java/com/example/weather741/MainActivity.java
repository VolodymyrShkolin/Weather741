package com.example.weather741;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.weather741.API.Api;
import com.example.weather741.API.Request;

import com.example.weather741.Data.ListItem;
import com.example.weather741.Data.WeatherForecastResult;
import com.example.weather741.RecyclerView.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    RecyclerView date_dimeRV;
    GridLayoutManager gridLayoutManager;
    RecyclerViewAdapter adapter;

 //   List<WeatherData> weatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date_dimeRV = findViewById(R.id.recyclerView);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        date_dimeRV.setLayoutManager(gridLayoutManager);

      //  weatherData = new ArrayList<>();
        Api api = new Request().buildRetrofitConfig();
        Call<WeatherForecastResult>call = api.getWeatherForecastResult(Api.city, Api.key, Api.cnt);

        call.enqueue(new Callback<WeatherForecastResult>() {
            @Override
            public void onResponse(Call <WeatherForecastResult> call, Response <WeatherForecastResult> response) {
                WeatherForecastResult data = response.body();
             //   adapter.updateList(data);




            }

            @Override
            public void onFailure(Call <WeatherForecastResult> call, Throwable t) {

            }
        });

        adapter = new RecyclerViewAdapter( new ArrayList<>());
        date_dimeRV.setAdapter(adapter);

    }





    private void go(){

    }
}