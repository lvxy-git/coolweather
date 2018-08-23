package com.example.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/8/23.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }

}