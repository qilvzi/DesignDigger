package org.dcxz.designdigger.util;

/**
 * DribbbleAPI工具
 * <br/>
 * Created by DC on 2016/12/13.<br/>
 */

public class Util_DribbbleAPI {
    /**
     * API接入点
     */
    public static final String END_POINT = "https://api.dribbble.com/v1";

    /**
     * APP注册时获取的静态链接口令
     */
    public static final String ACCESS_TOKEN = "e57b6ea8ad4ca7051144a6f6d584673f8d8c8c7f98db0c4f70d24b3c4fe5e988";

    /**
     * 请求头需要包含的KEY
     */
    public static final String AUTHORIZATION_KEY = "Authorization";

    /**
     * 请求头需要包含的VALUE
     */
    public static final String AUTHORIZATION_VALUE = "Bearer " + ACCESS_TOKEN;
}
