package com.delivery.weather;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://samples.openweathermap.org").addConverterFactory(GsonConverterFactory.create()).build();
        myInterface myInterface=retrofit.create(MainActivity.myInterface.class);
        Call<WeatherDetails> data=myInterface.getDetail();
        data.enqueue(new Callback<WeatherDetails>() {
            @Override
            public void onResponse(Call<WeatherDetails> call, Response<WeatherDetails> response) {
                WeatherAdapter adapter=new WeatherAdapter(MainActivity.this,response.body());
            }

            @Override
            public void onFailure(Call<WeatherDetails> call, Throwable t) {

            }
        });
    }
    interface myInterface{
        @GET("/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22")
        Call<WeatherDetails>getDetail();
    }
}
