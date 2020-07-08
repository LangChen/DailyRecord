package com.chlang.controller;

import com.chlang.common.annotation.ControllerWebLog;
import com.chlang.common.exception.PlatfromException;
import com.chlang.common.param.CreateUserParam;
import com.chlang.common.resp.common.ErrorCode;
import com.chlang.common.resp.common.PlatformHttpResult;
import com.chlang.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户API
 *
 * @author chenlang
 * @date 2020/7/8 5:08 下午
 **/
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ControllerWebLog(apiName = "/user")
    @PostMapping("")
    public PlatformHttpResult createUser(@RequestBody CreateUserParam createUserParam) throws Exception {
        if(Strings.isBlank(createUserParam.getUserAccount())){
            throw new PlatfromException(ErrorCode.PARAM_ERROR,"用户账号不能为空");
        }
        String accountReg = "[A-Za-z]{2,20}$";
        if(!createUserParam.getUserAccount().matches(accountReg)){
            throw new PlatfromException(ErrorCode.PARAM_ERROR,"账号需要为2-20位的纯字母");
        }
        if(Strings.isBlank(createUserParam.getPassword())){
            throw new PlatfromException(ErrorCode.PARAM_ERROR,"密码不能为空");
        }
        String pwdReg = "[0-9A-Za-z]{8,16}$";
        if(!createUserParam.getPassword().matches(pwdReg)){
            throw new PlatfromException(ErrorCode.PARAM_ERROR,"密码需要为8-16位的字母或数字组合");
        }
        if(Strings.isBlank(createUserParam.getPhone())){
            throw new PlatfromException(ErrorCode.PARAM_ERROR,"手机号不能为空");
        }
        String phoneReg = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        if(!createUserParam.getPhone().matches(phoneReg)){
            throw new PlatfromException(ErrorCode.PARAM_ERROR,"错误的手机号");
        }

        return userService.createUser(createUserParam);
    }

}
