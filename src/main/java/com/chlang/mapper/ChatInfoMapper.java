package com.chlang.mapper;

import com.chlang.entity.ChatInfo;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ChatInfoMapper extends Mapper<ChatInfo>, IdsMapper<ChatInfo>, MySqlMapper<ChatInfo> {
}