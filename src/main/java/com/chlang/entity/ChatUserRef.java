package com.chlang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`chat_user_ref`")
public class ChatUserRef implements Serializable {
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
     * 用户ID
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 用户在消息板的类型
     */
    @Column(name = "`chat_user_type`")
    private Byte chatUserType;

    /**
     * 用户在消息板的昵称
     */
    @Column(name = "`chat_user_name`")
    private String chatUserName;

    /**
     * 状态
     */
    @Column(name = "`status`")
    private Byte status;

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
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户在消息板的类型
     *
     * @return chat_user_type - 用户在消息板的类型
     */
    public Byte getChatUserType() {
        return chatUserType;
    }

    /**
     * 设置用户在消息板的类型
     *
     * @param chatUserType 用户在消息板的类型
     */
    public void setChatUserType(Byte chatUserType) {
        this.chatUserType = chatUserType;
    }

    /**
     * 获取用户在消息板的昵称
     *
     * @return chat_user_name - 用户在消息板的昵称
     */
    public String getChatUserName() {
        return chatUserName;
    }

    /**
     * 设置用户在消息板的昵称
     *
     * @param chatUserName 用户在消息板的昵称
     */
    public void setChatUserName(String chatUserName) {
        this.chatUserName = chatUserName;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
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
        ChatUserRef other = (ChatUserRef) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChatId() == null ? other.getChatId() == null : this.getChatId().equals(other.getChatId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getChatUserType() == null ? other.getChatUserType() == null : this.getChatUserType().equals(other.getChatUserType()))
            && (this.getChatUserName() == null ? other.getChatUserName() == null : this.getChatUserName().equals(other.getChatUserName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChatId() == null) ? 0 : getChatId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getChatUserType() == null) ? 0 : getChatUserType().hashCode());
        result = prime * result + ((getChatUserName() == null) ? 0 : getChatUserName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", chatUserType=").append(chatUserType);
        sb.append(", chatUserName=").append(chatUserName);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}