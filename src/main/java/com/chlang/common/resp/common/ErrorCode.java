package com.chlang.common.resp.common;

/**
 * 错误码
 */
public class ErrorCode {

    /**
     * 未知异常
     */
    public final static Integer UN_KNOW_ERROR = 500000;
    /**
     * 无效令牌
     */
    public final static Integer TOKEN_FAILED_ERROR = 500001;
    /**
     * 登录超时
     */
    public final static Integer TOKEN_EXPIRED_ERROR = 500002;
    /**
     * 登录异常
     */
    public final static Integer LOGIN_ERROR = 500003;
    /**
     * 参数错误
     */
    public final static Integer PARAM_ERROR = 500004;

}
