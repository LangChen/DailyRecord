package com.chlang.common.constant;

/**
 * 用户账号状态
 *
 * @author chenlang
 * @date 2020/7/8 4:24 下午
 **/
public enum UserAccountStatus {


    NORMAL((byte)0,"正常"),
    DELETE((byte)1,"注销"),
    STOP((byte)2,"停用"),
    NOT_AUDIT((byte)3,"未审核");

    private Byte code;
    private String name;

    UserAccountStatus(Byte code,String name){
        this.code = code;
        this.name = name;
    }

    public Byte getCode() {
        return code;
    }

    public void setCode(Byte code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
