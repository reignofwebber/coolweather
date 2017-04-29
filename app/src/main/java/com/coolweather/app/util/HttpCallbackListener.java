package com.coolweather.app.util;

/**
 * Created by zf on 4/29/2017.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
