package com.chlang.common.utils;

import java.security.MessageDigest;

/**
 * 用户密码加解密
 *
 * @author chenlang
 * @date 2020/7/8 4:44 下午
 **/
public class PwdEnCodeUtil {

    /**
     * 加密密码
     * @param password
     * @param userAccount
     * @return
     * @throws Exception
     */
    public static String encodePwd(String password,String userAccount) throws Exception {
        String str = password + userAccount;
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 更新
        md.update(str.getBytes());
        // 获取
        byte[] bt = md.digest();
        // 转换
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < bt.length; i++) {
            buffer.append(Character.forDigit((bt[i] & 240) >> 4, 16));
            buffer.append(Character.forDigit(bt[i] & 15, 16));
        }
        return buffer.toString();
    }
}
