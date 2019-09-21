package org.jeecg.modules.system.model;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @Description: 用户通告阅读标记表
 * @Author: jeecg-boot
 * @Date:  2019-02-21
 * @Version: V1.0
 */
@Data
@TableName("sys_announcement_send")
public class AnnouncementSendModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
	/**id*/
	@TableId(type = IdType.UUID)
	private java.lang.String id;
	/**通告id*/
	private java.lang.String anntId;
	/**用户id*/
	private java.lang.String userId;
	/**标题*/
	private java.lang.String titile;
	/**内容*/
	private java.lang.String msgContent;
	/**发布人*/
	private java.lang.String sender;
	/**优先级（L低，M中，H高）*/
	private java.lang.String priority;
	/**阅读状态*/
	private java.lang.String readFlag;
	/**发布时间*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.util.Date sendTime;
	/**页数*/
	private java.lang.Integer pageNo;
	/**大小*/
	private java.lang.Integer pageSize;
    /**
     * 消息类型1:通知公告2:系统消息
     */
    private java.lang.String msgCategory;
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getAnntId() {
		return anntId;
	}
	public void setAnntId(java.lang.String anntId) {
		this.anntId = anntId;
	}
	public java.lang.String getUserId() {
		return userId;
	}
	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}
	public java.lang.String getTitile() {
		return titile;
	}
	public void setTitile(java.lang.String titile) {
		this.titile = titile;
	}
	public java.lang.String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(java.lang.String msgContent) {
		this.msgContent = msgContent;
	}
	public java.lang.String getSender() {
		return sender;
	}
	public void setSender(java.lang.String sender) {
		this.sender = sender;
	}
	public java.lang.String getPriority() {
		return priority;
	}
	public void setPriority(java.lang.String priority) {
		this.priority = priority;
	}
	public java.lang.String getReadFlag() {
		return readFlag;
	}
	public void setReadFlag(java.lang.String readFlag) {
		this.readFlag = readFlag;
	}
	public java.util.Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(java.util.Date sendTime) {
		this.sendTime = sendTime;
	}
	public java.lang.Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(java.lang.Integer pageNo) {
		this.pageNo = pageNo;
	}
	public java.lang.Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(java.lang.Integer pageSize) {
		this.pageSize = pageSize;
	}
	public java.lang.String getMsgCategory() {
		return msgCategory;
	}
	public void setMsgCategory(java.lang.String msgCategory) {
		this.msgCategory = msgCategory;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
}
