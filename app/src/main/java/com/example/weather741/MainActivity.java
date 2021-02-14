package com.example.weather741;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.weather741.api.Api;
import com.example.weather741.api.Request;

import com.example.weather741.data.WeatherForecastResult;
import com.example.weather741.recyclerview.RecyclerViewAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    RecyclerView date_dimeRV;
    GridLayoutManager gridLayoutManager;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date_dimeRV = findViewById(R.id.recyclerView);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        date_dimeRV.setLayoutManager(gridLayoutManager);

        startRequest();
    }

    private void startRequest() {

        Api api = new Request().buildRetrofitConfig();
        Call<WeatherForecastResult> call = api.getWeatherForecastResult(Api.city, Api.key, Api.cnt);

        call.enqueue(new Callback<WeatherForecastResult>() {
            @Override
            public void onResponse(Call<WeatherForecastResult> call, Response<WeatherForecastResult> response) {
                adapter = new RecyclerViewAdapter(response.body().getList());
                date_dimeRV.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<WeatherForecastResult> call, Throwable t) {
            }
        });

    }
}