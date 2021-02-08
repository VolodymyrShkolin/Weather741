package com.example.weather741;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.weather741.API.Api;
import com.example.weather741.API.Init;
import com.example.weather741.API.Result;
import com.example.weather741.Data.WeatherData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText etText;
    TextView tempResult;
    String city;
    Result result;
    Button btnSearch;
    double temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = new Result();

        etText = findViewById(R.id.etText);
        tempResult = findViewById(R.id.tepmResult);

        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                city = etText.getText().toString();

                Api api = new Init().buildRetrofitConfig();
                Call<WeatherData> call = api.getWeatherDateByCity(city, Api.key, Api.units);

                call.enqueue(new Callback<WeatherData>() {
                    @Override
                    public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                        temp = response.body().getMain().getTemp();

                        tempResult.setText(temp + " ");

                    }

                    @Override
                    public void onFailure(Call<WeatherData> call, Throwable t) {

                    }
                });

            }
        });

    }
}