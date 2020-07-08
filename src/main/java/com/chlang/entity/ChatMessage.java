package com.chlang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`chat_message`")
public class ChatMessage implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 消息板ID
     */
    @Column(name = "`chat_id`")
    private Integer chatId;

    /**
     * 发送者ID
     */
    @Column(name = "`sender_id`")
    private Integer senderId;

    /**
     * 重发验证ID
     */
    @Column(name = "`uuid`")
    private String uuid;

    /**
     * 消息类型
     */
    @Column(name = "`message_type`")
    private Byte messageType;

    /**
     * 消息状态
     */
    @Column(name = "`message_status`")
    private Byte messageStatus;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 是否删除
     */
    @Column(name = "`is_deleted`")
    private Byte isDeleted;

    /**
     * 消息内容
     */
    @Column(name = "`content`")
    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取消息板ID
     *
     * @return chat_id - 消息板ID
     */
    public Integer getChatId() {
        return chatId;
    }

    /**
     * 设置消息板ID
     *
     * @param chatId 消息板ID
     */
    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    /**
     * 获取发送者ID
     *
     * @return sender_id - 发送者ID
     */
    public Integer getSenderId() {
        return senderId;
    }

    /**
     * 设置发送者ID
     *
     * @param senderId 发送者ID
     */
    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    /**
     * 获取重发验证ID
     *
     * @return uuid - 重发验证ID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置重发验证ID
     *
     * @param uuid 重发验证ID
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取消息类型
     *
     * @return message_type - 消息类型
     */
    public Byte getMessageType() {
        return messageType;
    }

    /**
     * 设置消息类型
     *
     * @param messageType 消息类型
     */
    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取消息状态
     *
     * @return message_status - 消息状态
     */
    public Byte getMessageStatus() {
        return messageStatus;
    }

    /**
     * 设置消息状态
     *
     * @param messageStatus 消息状态
     */
    public void setMessageStatus(Byte messageStatus) {
        this.messageStatus = messageStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除
     *
     * @return is_deleted - 是否删除
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取消息内容
     *
     * @return content - 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置消息内容
     *
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ChatMessage other = (ChatMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChatId() == null ? other.getChatId() == null : this.getChatId().equals(other.getChatId()))
            && (this.getSenderId() == null ? other.getSenderId() == null : this.getSenderId().equals(other.getSenderId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getMessageType() == null ? other.getMessageType() == null : this.getMessageType().equals(other.getMessageType()))
            && (this.getMessageStatus() == null ? other.getMessageStatus() == null : this.getMessageStatus().equals(other.getMessageStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChatId() == null) ? 0 : getChatId().hashCode());
        result = prime * result + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        result = prime * result + ((getMessageStatus() == null) ? 0 : getMessageStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chatId=").append(chatId);
        sb.append(", senderId=").append(senderId);
        sb.append(", uuid=").append(uuid);
        sb.append(", messageType=").append(messageType);
        sb.append(", messageStatus=").append(messageStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}