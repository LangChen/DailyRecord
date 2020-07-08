package com.chlang.service;

import com.chlang.common.constant.UserAccountStatus;
import com.chlang.common.exception.PlatfromException;
import com.chlang.common.helper.JwtHelper;
import com.chlang.common.resp.common.ErrorCode;
import com.chlang.common.resp.common.PlatformHttpResult;
import com.chlang.common.utils.PwdEnCodeUtil;
import com.chlang.repository.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author chenlang
 * @date 2020/6/4 3:18 下午
 **/
@Service
public class AuthService {

    @Autowired
    private JwtHelper jwtHelper;
    @Autowired
    private UserAuthMapper userAuthMapper;
    @Autowired
    private UserAuthRepository userAuthRepository;

    /**
     * 普通用户账号登录
     * @param userAccount
     * @param password
     * @return
     */
    public PlatformHttpResult commonUserLoginWithAccount(String userAccount,String password)throws Exception{
        UserAuth userAuth = userAuthRepository.getByUserAccount(userAccount);
        if(userAuth == null){
            throw new PlatfromException(ErrorCode.LOGIN_ERROR,"用户不存在");
        }
        if(userAuth.getAccountStatus() != UserAccountStatus.NORMAL.getCode()){
            throw new PlatfromException(ErrorCode.LOGIN_ERROR,"用户状态不正常");
        }
        //加密密码
        String encodePwd = PwdEnCodeUtil.encodePwd(password,userAccount);
        if(!userAuth.getPassword().equals(encodePwd)){
            throw new PlatfromException(ErrorCode.LOGIN_ERROR,"密码错误");
        }

        Map<String,Object> result = new HashMap<>();
        String token = jwtHelper.createToken(userAccount);
        result.put("token",token);

        return PlatformHttpResult.successWithObj(result);
    }

}
