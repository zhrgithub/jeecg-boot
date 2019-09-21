package org.jeecg.modules.message.entity;

import org.jeecg.common.aspect.annotation.Dict;
import org.jeecg.common.system.base.entity.JeecgEntity;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 消息
 * @Author: jeecg-boot
 * @Date:  2019-04-09
 * @Version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_sms")
public class SysMessage extends JeecgEntity {
	/**推送内容*/
	@Excel(name = "推送内容", width = 15)
	private java.lang.String esContent;
	/**推送所需参数Json格式*/
	@Excel(name = "推送所需参数Json格式", width = 15)
	private java.lang.String esParam;
	/**接收人*/
	@Excel(name = "接收人", width = 15)
	private java.lang.String esReceiver;
	/**推送失败原因*/
	@Excel(name = "推送失败原因", width = 15)
	private java.lang.String esResult;
	/**发送次数*/
	@Excel(name = "发送次数", width = 15)
	private java.lang.Integer esSendNum;
	/**推送状态 0未推送 1推送成功 2推送失败*/
	@Excel(name = "推送状态 0未推送 1推送成功 2推送失败", width = 15)
	@Dict(dicCode = "msgSendStatus")
	private java.lang.String esSendStatus;
	/**推送时间*/
	@Excel(name = "推送时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.util.Date esSendTime;
	/**消息标题*/
	@Excel(name = "消息标题", width = 15)
	private java.lang.String esTitle;
	/**推送方式：1短信 2邮件 3微信*/
	@Excel(name = "推送方式：1短信 2邮件 3微信", width = 15)
	@Dict(dicCode = "msgType")
	private java.lang.String esType;
	/**备注*/
	@Excel(name = "备注", width = 15)
	private java.lang.String remark;
	public java.lang.String getEsContent() {
		return esContent;
	}
	public void setEsContent(java.lang.String esContent) {
		this.esContent = esContent;
	}
	public java.lang.String getEsParam() {
		return esParam;
	}
	public void setEsParam(java.lang.String esParam) {
		this.esParam = esParam;
	}
	public java.lang.String getEsReceiver() {
		return esReceiver;
	}
	public void setEsReceiver(java.lang.String esReceiver) {
		this.esReceiver = esReceiver;
	}
	public java.lang.String getEsResult() {
		return esResult;
	}
	public void setEsResult(java.lang.String esResult) {
		this.esResult = esResult;
	}
	public java.lang.Integer getEsSendNum() {
		return esSendNum;
	}
	public void setEsSendNum(java.lang.Integer esSendNum) {
		this.esSendNum = esSendNum;
	}
	public java.lang.String getEsSendStatus() {
		return esSendStatus;
	}
	public void setEsSendStatus(java.lang.String esSendStatus) {
		this.esSendStatus = esSendStatus;
	}
	public java.util.Date getEsSendTime() {
		return esSendTime;
	}
	public void setEsSendTime(java.util.Date esSendTime) {
		this.esSendTime = esSendTime;
	}
	public java.lang.String getEsTitle() {
		return esTitle;
	}
	public void setEsTitle(java.lang.String esTitle) {
		this.esTitle = esTitle;
	}
	public java.lang.String getEsType() {
		return esType;
	}
	public void setEsType(java.lang.String esType) {
		this.esType = esType;
	}
	public java.lang.String getRemark() {
		return remark;
	}
	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}
	
	
	
}
