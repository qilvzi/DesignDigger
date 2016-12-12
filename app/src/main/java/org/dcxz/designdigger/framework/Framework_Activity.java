package org.dcxz.designdigger.framework;


import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public abstract class Framework_Activity extends AppCompatActivity {
    /**
     * Framework_Activity持有的Framework_Handler对象,为子类提供消息机制接口
     */
    private Framework_Handler handler;
    /**
     * Framework_Activity持有的Toast对象,为子类提供消息弹出接口
     */
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        handler = new Framework_Handler(this);
        toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);

        setContentView(setContentViewImp());

        initView();
        initData();
        initAdapter();
        initListener();
    }

    /**
     * {@link #setContentView(int)}接口
     *
     * @return 用于充填布局的资源id
     */
    protected abstract int setContentViewImp();

    /**
     * 捕捉布局中已有的控件
     */
    protected abstract void initView();

    /**
     * 收集数据
     */
    protected abstract void initData();

    /**
     * 初始化适配器
     */
    protected abstract void initAdapter();

    /**
     * 为控件添加时间监听
     */
    protected abstract void initListener();

    /**
     * 消息机制接口,处理由{@link #handler}发送的消息
     *
     * @param msg 待处理的消息
     */
    public abstract void handleMessageImp(Message msg);

    /**
     * Toast接口
     *
     * @param msg 待弹出的消息
     */
    protected void toast(String msg) {
        toast.setText(msg);
        toast.show();
    }
}
