package com.chlang.mapper;

import com.chlang.entity.ChatMessage;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ChatMessageMapper extends Mapper<ChatMessage>, IdsMapper<ChatMessage>, MySqlMapper<ChatMessage> {
}