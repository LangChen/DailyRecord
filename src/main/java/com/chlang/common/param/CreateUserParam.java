package com.chlang.common.param;

/**
 * 创建用户的参数
 *
 * @author chenlang
 * @date 2020/7/8 5:24 下午
 **/
public class CreateUserParam {

    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 电话号码
     */
    private String phone;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
