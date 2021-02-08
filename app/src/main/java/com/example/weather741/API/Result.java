package com.example.weather741.API;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weather741.Data.WeatherData;
import com.example.weather741.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Result extends AppCompatActivity {


//    String units = "metric";
//    TextView tempResult;
//    double temp;
//
//
//    public void go(String city){
//
//        tempResult = findViewById(R.id.tepmResult);
//
//
//        Api api = new Init().buildRetrofitConfig();
//        Call<WeatherData> call = api.getWeatherDateByCity(city, Api.key, units);
//
//        call.enqueue(new Callback<WeatherData>() {
//            @Override
//            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
//
//               temp = response.body().getMain().getTemp();
//               tempResult.setText((int) temp);
//            }
//
//            @Override
//            public void onFailure(Call<WeatherData> call, Throwable t) {
//
//            }
//        });
//
//    }

}
