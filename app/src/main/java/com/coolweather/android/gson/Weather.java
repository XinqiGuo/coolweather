package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//引用Basic，AQI，Now，Suggestion，Forecast
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    //因为Forecast中包含的是一个数组，因此这里使用List集合来引用Forecast类
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
