package com.chlang.mapper;

import com.chlang.entity.ChatUserRef;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ChatUserRefMapper extends Mapper<ChatUserRef>, IdsMapper<ChatUserRef>, MySqlMapper<ChatUserRef> {
}