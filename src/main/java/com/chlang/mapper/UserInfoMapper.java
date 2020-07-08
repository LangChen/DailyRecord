package com.chlang.mapper;

import com.chlang.entity.UserInfo;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UserInfoMapper extends Mapper<UserInfo>, IdsMapper<UserInfo>, MySqlMapper<UserInfo> {
}