package org.dcxz.designdigger.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreference管理工具
 * <br/>
 * Created by OvO on 2016/12/13.<br/>
 * ChangeLog :
 * <pre>
 * </pre>
 */

public class Util_SP_Manager {
    /**
     * 单例模式
     */
    private static Util_SP_Manager instance;

    private static SharedPreferences preferences;
    /**
     * 是否第一次启动应用
     */
    public static final String IS_NOT_FIRST_LAUNCH = "IS_NOT_FIRST_LAUNCH";

    private Util_SP_Manager() {
    }

    public static Util_SP_Manager getInstance(Context context) {
        if (instance == null) {
            synchronized (Util_SP_Manager.class) {
                if (instance == null) {
                    instance = new Util_SP_Manager();
                    preferences = context.getSharedPreferences("DesignDiggerConfig", Context.MODE_PRIVATE);
                }
            }
        }
        return instance;
    }

    /**
     * 获取布尔值
     *
     * @param key 关键字
     * @return 关键字在配置文件中对应的布尔值;若获取失败则返回FALSE;
     */
    public boolean getBoolean(String key) {
        return preferences.getBoolean(key, false);
    }

    /**
     * 插入布尔值
     *
     * @param key  关键字
     * @param flag 将要插入的值
     * @return 是否插入成功
     */
    public boolean putBoolean(String key, boolean flag) {
        return preferences.edit().putBoolean(key, flag).commit();
    }

}
