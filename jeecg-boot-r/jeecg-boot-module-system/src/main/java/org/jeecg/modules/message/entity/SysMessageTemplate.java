package org.jeecg.modules.message.entity;

import org.jeecg.common.system.base.entity.JeecgEntity;
import org.jeecgframework.poi.excel.annotation.Excel;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 消息模板
 * @Author: jeecg-boot
 * @Date:  2019-04-09
 * @Version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_sms_template")
public class SysMessageTemplate extends JeecgEntity{
	/**模板CODE*/
	@Excel(name = "模板CODE", width = 15)
	private java.lang.String templateCode;
	/**模板标题*/
	@Excel(name = "模板标题", width = 30)
	private java.lang.String templateName;
	/**模板内容*/
	@Excel(name = "模板内容", width = 50)
	private java.lang.String templateContent;
	/**模板测试json*/
	@Excel(name = "模板测试json", width = 15)
	private java.lang.String templateTestJson;
	/**模板类型*/
	@Excel(name = "模板类型", width = 15)
	private java.lang.String templateType;
	public java.lang.String getTemplateCode() {
		return templateCode;
	}
	public void setTemplateCode(java.lang.String templateCode) {
		this.templateCode = templateCode;
	}
	public java.lang.String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(java.lang.String templateName) {
		this.templateName = templateName;
	}
	public java.lang.String getTemplateContent() {
		return templateContent;
	}
	public void setTemplateContent(java.lang.String templateContent) {
		this.templateContent = templateContent;
	}
	public java.lang.String getTemplateTestJson() {
		return templateTestJson;
	}
	public void setTemplateTestJson(java.lang.String templateTestJson) {
		this.templateTestJson = templateTestJson;
	}
	public java.lang.String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(java.lang.String templateType) {
		this.templateType = templateType;
	}
	
	
	
}
