package com.coolweather.android.gson;

/**
 * Created by fuyifeng on 2017/6/6.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
