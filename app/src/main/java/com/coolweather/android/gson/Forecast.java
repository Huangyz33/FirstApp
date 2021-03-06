package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 77196 on 2017/8/7.
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {

        @SerializedName("tx_d")
        public String info;
    }
}
