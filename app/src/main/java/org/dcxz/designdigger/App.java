package org.dcxz.designdigger;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Application对象,用于初始化{@link #queue}
 * <br/>
 * Created by DC on 2016/12/13.<br/>
 */

public class App extends Application {
    /**
     * Volley的请求队列静态实例
     */
    public static RequestQueue queue;

    @Override
    public void onCreate() {
        super.onCreate();
        queue = Volley.newRequestQueue(this);
    }
}
