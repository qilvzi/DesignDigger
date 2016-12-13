package org.dcxz.designdigger;

import android.app.Application;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.dcxz.designdigger.util.Util_DribbbleAPI;

import java.util.HashMap;
import java.util.Map;

/**
 * Application对象,用于初始化{@link #queue}
 * <br/>
 * Created by DC on 2016/12/13.<br/>
 */

public class App extends Application {
    /**
     * Volley的请求队列静态实例
     */
    private static RequestQueue queue;
    /**
     * 访问DribbbleAPI必要的头信息
     */
    private static HashMap<String, String> header;

    @Override
    public void onCreate() {
        super.onCreate();
        queue = Volley.newRequestQueue(this);
        header = new HashMap<>();
        header.put(Util_DribbbleAPI.AUTHORIZATION_KEY, Util_DribbbleAPI.AUTHORIZATION_VALUE);
    }

    /**
     * 通过DribbbleAPI进行请求
     *
     * @param url           目标地址
     * @param listener      响应成功监听器
     * @param errorListener 响应失败监听器
     */
    public static void request(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        queue.add(new StringRequest(url, listener, errorListener) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return header;
            }
        });
    }
}
