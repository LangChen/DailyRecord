package com.chlang.service;

import com.chlang.common.constant.UserAccountStatus;
import com.chlang.common.param.CreateUserParam;
import com.chlang.common.resp.common.PlatformHttpResult;
import com.chlang.common.utils.PwdEnCodeUtil;
import com.chlang.entity.UserAuth;
import com.chlang.entity.UserInfo;
import com.chlang.mapper.UserAuthMapper;
import com.chlang.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户相关业务处理类
 *
 * @author chenlang
 * @date 2020/7/8 5:36 下午
 **/
@Service
public class UserService {

    @Autowired
    private UserAuthMapper userAuthMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 创建用户
     * @param createUserParam
     * @return
     */
    public PlatformHttpResult createUser(CreateUserParam createUserParam) throws Exception {
        //创建用户登录信息
        UserAuth userAuth = new UserAuth();
        userAuth.setUserAccount(createUserParam.getUserAccount());
        String pwd = PwdEnCodeUtil.encodePwd(createUserParam.getPassword(),createUserParam.getUserAccount());
        userAuth.setPassword(pwd);
        userAuth.setPhone(createUserParam.getPhone());
        userAuth.setAccountStatus(UserAccountStatus.NOT_AUDIT.getCode());
        userAuthMapper.insertSelective(userAuth);
        //创建用户基本信息
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userAuth.getId());
        userInfo.setUserAccount(userAuth.getUserAccount());
        userInfo.setPhone(userAuth.getPhone());
        userInfo.setAccountStatus(userAuth.getAccountStatus());
        userInfo.setUserName(userAuth.getUserAccount());
        userInfo.setCreateTime(new Date());
        userInfo.setUpdateTime(new Date());
        userInfoMapper.insertSelective(userInfo);

        return PlatformHttpResult.successWithMsg("创建成功");
    }

}
