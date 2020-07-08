package com.chlang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`chat_info`")
public class ChatInfo implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 消息板名称
     */
    @Column(name = "`chat_name`")
    private String chatName;

    /**
     * 创建者ID
     */
    @Column(name = "`creator_id`")
    private Integer creatorId;

    /**
     * 描述
     */
    @Column(name = "`descript`")
    private String descript;

    /**
     * 消息板类型
     */
    @Column(name = "`chat_type`")
    private Byte chatType;

    /**
     * 消息板状态
     */
    @Column(name = "`chat_status`")
    private Byte chatStatus;

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
     * 获取消息板名称
     *
     * @return chat_name - 消息板名称
     */
    public String getChatName() {
        return chatName;
    }

    /**
     * 设置消息板名称
     *
     * @param chatName 消息板名称
     */
    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    /**
     * 获取创建者ID
     *
     * @return creator_id - 创建者ID
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建者ID
     *
     * @param creatorId 创建者ID
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取描述
     *
     * @return descript - 描述
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置描述
     *
     * @param descript 描述
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取消息板类型
     *
     * @return chat_type - 消息板类型
     */
    public Byte getChatType() {
        return chatType;
    }

    /**
     * 设置消息板类型
     *
     * @param chatType 消息板类型
     */
    public void setChatType(Byte chatType) {
        this.chatType = chatType;
    }

    /**
     * 获取消息板状态
     *
     * @return chat_status - 消息板状态
     */
    public Byte getChatStatus() {
        return chatStatus;
    }

    /**
     * 设置消息板状态
     *
     * @param chatStatus 消息板状态
     */
    public void setChatStatus(Byte chatStatus) {
        this.chatStatus = chatStatus;
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
        ChatInfo other = (ChatInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChatName() == null ? other.getChatName() == null : this.getChatName().equals(other.getChatName()))
            && (this.getCreatorId() == null ? other.getCreatorId() == null : this.getCreatorId().equals(other.getCreatorId()))
            && (this.getDescript() == null ? other.getDescript() == null : this.getDescript().equals(other.getDescript()))
            && (this.getChatType() == null ? other.getChatType() == null : this.getChatType().equals(other.getChatType()))
            && (this.getChatStatus() == null ? other.getChatStatus() == null : this.getChatStatus().equals(other.getChatStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChatName() == null) ? 0 : getChatName().hashCode());
        result = prime * result + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        result = prime * result + ((getDescript() == null) ? 0 : getDescript().hashCode());
        result = prime * result + ((getChatType() == null) ? 0 : getChatType().hashCode());
        result = prime * result + ((getChatStatus() == null) ? 0 : getChatStatus().hashCode());
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
        sb.append(", chatName=").append(chatName);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", descript=").append(descript);
        sb.append(", chatType=").append(chatType);
        sb.append(", chatStatus=").append(chatStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}