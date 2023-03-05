package com.example.weatherapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weatherapp2.databinding.ActivityCityFinderBinding;

public class Activity_city_finder extends AppCompatActivity {
    ActivityCityFinderBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b= ActivityCityFinderBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());


        b.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        b.searchCity.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String newCity= b.searchCity.getText().toString();
                Intent intent=new Intent(Activity_city_finder.this,MainActivity.class);
                intent.putExtra("City",newCity);
                startActivity(intent);



                return false;
            }
        });

    }
}