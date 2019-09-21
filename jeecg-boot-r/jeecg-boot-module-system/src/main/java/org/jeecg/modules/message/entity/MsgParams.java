package org.jeecg.modules.message.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 发送消息实体
 */
@Data
public class MsgParams implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	/*消息类型*/
	private String msgType;
	/*消息接收方*/
	private String receiver;
	/*消息模板码*/
	private String templateCode;
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getTemplateCode() {
		return templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTestData() {
		return testData;
	}
	public void setTestData(String testData) {
		this.testData = testData;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*测试数据*/
	private String testData;
	
}
