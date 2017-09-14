package com.zhweather.android.gson;

/**
 * AQI
 * Created by zhujj on 2017/9/13.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
