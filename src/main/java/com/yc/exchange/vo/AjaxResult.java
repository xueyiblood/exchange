package com.yc.exchange.vo;



import com.yc.exchange.constant.HttpStatus;
import com.yc.exchange.utils.StringHelper;

import java.util.HashMap;

/**
 * @Description:
 * @Author: mary
 * @Date: 2020/7/31 0031 17:27
 */
public class AjaxResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    public static final String CODE_TAG = "code";

    /**
     * 返回内容
     */
    public static final String MSG_TAG = "msg";

    /**
     * 数据对象
     */
    public static final String DATA_TAG = "data";

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult() {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     */
    public AjaxResult(int code, String msg) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param data 数据对象
     */
    public AjaxResult(int code, String msg, Object data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (StringHelper.isNotNull(data)) {
            super.put(DATA_TAG, data);
        }
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static com.yc.exchange.vo.AjaxResult success() {
        return com.yc.exchange.vo.AjaxResult.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static com.yc.exchange.vo.AjaxResult success(Object data) {
        return com.yc.exchange.vo.AjaxResult.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static com.yc.exchange.vo.AjaxResult success(String msg) {
        return com.yc.exchange.vo.AjaxResult.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static com.yc.exchange.vo.AjaxResult success(String msg, Object data) {
        return new com.yc.exchange.vo.AjaxResult(HttpStatus.SUCCESS, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static com.yc.exchange.vo.AjaxResult error() {
        return com.yc.exchange.vo.AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static com.yc.exchange.vo.AjaxResult error(String msg) {
        return com.yc.exchange.vo.AjaxResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static com.yc.exchange.vo.AjaxResult error(String msg, Object data) {
        return new com.yc.exchange.vo.AjaxResult(HttpStatus.ERROR, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 警告消息
     */
    public static com.yc.exchange.vo.AjaxResult error(int code, String msg) {
        return new com.yc.exchange.vo.AjaxResult(code, msg, null);
    }
}
