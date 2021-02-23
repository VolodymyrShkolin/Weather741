package com.example.weather741;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.weather741.api.Api;
import com.example.weather741.api.Request;

import com.example.weather741.data.WeatherForecastResult;
import com.example.weather741.recyclerview.RecyclerViewAdapter;

import org.jetbrains.annotations.NotNull;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    RecyclerView date_dimeRV;
    GridLayoutManager gridLayoutManager;
    RecyclerViewAdapter adapter;
    EditText etCity;
    Button btnSearch;

    String SAVED_RECYCLER_VIEW_STATUS_ID = "status_rv";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        date_dimeRV = findViewById(R.id.recyclerView);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        date_dimeRV.setLayoutManager(gridLayoutManager);

        etCity = findViewById(R.id.etCity);

        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String city = etCity.getText().toString();
                startRequest(city);
            }
        });
    }

    private void startRequest(String city) {
        Api api = new Request().buildRetrofitConfig();
        Call<WeatherForecastResult> call = api.getWeatherForecastResult
                (city, Api.key, Api.cnt, Api.units);

        call.enqueue(new Callback<WeatherForecastResult>() {
            @Override
            public void onResponse(@NotNull Call<WeatherForecastResult> call,
                                   @NotNull Response<WeatherForecastResult> response) {
                if(response.isSuccessful()) {
                    adapter = new RecyclerViewAdapter(response.body().getList());
                    date_dimeRV.setAdapter(adapter);
                }else {
                    Toast.makeText(getApplicationContext(), "Sorry, we did't find this city(",
                            Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Call<WeatherForecastResult> call, Throwable t) {
            }
        });

    }


}