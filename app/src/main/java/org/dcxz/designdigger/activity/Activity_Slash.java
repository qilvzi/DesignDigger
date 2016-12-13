package org.dcxz.designdigger.activity;

import android.os.Message;
import android.util.Log;
import android.widget.ImageView;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.dcxz.designdigger.App;
import org.dcxz.designdigger.R;
import org.dcxz.designdigger.framework.Framework_Activity;
import org.dcxz.designdigger.util.Util_DribbbleAPI;

/**
 * <br/>
 * Created by OvO on 2016/12/13.<br/>
 * ChangeLog :
 * <pre>
 * </pre>
 */

public class Activity_Slash extends Framework_Activity {
    /**
     * 日志Tag
     */
    private static final String TAG = "Activity_Slash";

    private ImageView display;

    @Override
    protected int setContentViewImp() {
        return R.layout.activity_slash;
    }

    @Override
    protected void initView() {
        display = (ImageView) findViewById(R.id.slash_display);
    }

    @Override
    protected void initData() {
        App.request(
                Util_DribbbleAPI.END_POINT_SHOTS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.i(TAG, "onResponse: " + response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });

    }

    @Override
    protected void initAdapter() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void handleMessageImp(Message msg) {

    }
}
