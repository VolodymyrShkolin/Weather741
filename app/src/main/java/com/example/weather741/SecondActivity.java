package com.example.weather741;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView temp, hum, press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        temp = findViewById(R.id.temp);
        hum = findViewById(R.id.humidity);
        press = findViewById(R.id.press);

        Intent intent = getIntent();

        String fTemp = intent.getStringExtra("temp");
        String fHum = intent.getStringExtra("humidity");
        String fPress = intent.getStringExtra("press");

        temp.setText(String.format("Temperature: %s", fTemp));
        hum.setText(String.format("Humidity: %s", fHum));
        press.setText(String.format("Pressure: %s", fPress));
    }
}