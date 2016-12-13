package org.dcxz.designdigger.activity;

import android.os.Message;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import org.dcxz.designdigger.R;
import org.dcxz.designdigger.framework.Framework_Activity;

/**
 * 首次启动应用时进入的介绍页面
 * <br/>
 * Created by OvO on 2016/12/13.<br/>
 * ChangeLog :
 * <pre>
 * </pre>
 */

public class Activity_FirstLaunch extends Framework_Activity {
    /**
     * ViewPager容器
     */
    private ViewPager viewPager;
    /**
     * ViewPager中的内容
     */
    private ImageView content[];
    /**
     * 底部的指示器
     */
    private ImageView indicators[];


    @Override
    protected int setContentViewImp() {
        return R.layout.activity_first_launch;
    }

    @Override
    protected void initView() {
        indicators = new ImageView[3];
        indicators[0] = (ImageView) findViewById(R.id.firstLaunch_indicator1);
        indicators[0].setSelected(true);
        indicators[1] = (ImageView) findViewById(R.id.firstLaunch_indicator2);
        indicators[2] = (ImageView) findViewById(R.id.firstLaunch_indicator3);
        viewPager = (ViewPager) findViewById(R.id.firstLaunch_viewPager);
    }

    @Override
    protected void initData() {
        // TODO: 2016/12/13 需要准备素材图像
        content = new ImageView[3];
        for (int i = 0; i < 3; i++) {
            content[i] = new ImageView(this);
            content[i].setImageResource(R.mipmap.ic_launcher);
            content[i].setScaleType(ImageView.ScaleType.FIT_XY);
        }
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
