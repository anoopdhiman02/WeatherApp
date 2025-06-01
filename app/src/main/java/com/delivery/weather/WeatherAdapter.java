package com.delivery.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

class WeatherAdapter extends BaseAdapter {
    Context context;
    WeatherDetails weather;


    public WeatherAdapter(MainActivity mainActivity, WeatherDetails body) {
        this.context=mainActivity;
        this.weather=body;

    }

    @Override
    public int getCount() {
        return weather.getList().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.weatherreport,parent,false);
        return view;
    }
}
