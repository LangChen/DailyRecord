package com.chlang.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

/**
 * TODO
 *
 * @author chenlang
 * @date 2020/7/8 4:10 下午
 **/
@Repository
public class UserAuthRepository{

    @Autowired
    private UserAuthMapper userAuthMapper;

    /**
     * 根据用户账号获取认证信息
     * @return
     */
    public UserAuth getByUserAccount(String userAccount){
        Example example = new Example(UserAuth.class);
        example.createCriteria().andEqualTo("userAccount",userAccount);
        return userAuthMapper.selectOneByExample(userAccount);
    }

}
