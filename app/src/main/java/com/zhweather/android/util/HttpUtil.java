package com.zhweather.android.util;

import com.zhweather.android.R;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhuxj on 9/11/2017.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
