package org.jeecg.modules.system.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单权限规则表
 * </p>
 *
 * @Author huangzhilin
 * @since 2019-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysPermissionDataRule implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * id
	 */
	@TableId(type = IdType.UUID)
	private String id;
	
	/**
	 * 对应的菜单id
	 */
	private String permissionId;
	
	/**
	 * 规则名称
	 */
	private String ruleName;
	
	/**
	 * 字段
	 */
	private String ruleColumn;
	
	/**
	 * 条件
	 */
	private String ruleConditions;
	
	/**
	 * 规则值
	 */
	private String ruleValue;
	
	/**
	 * 状态值 1有效 0无效
	 */
	private String status;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 创建人
	 */
	private String createBy;
	
	/**
	 * 修改时间
	 */
	private Date updateTime;
	
	/**
	 * 修改人
	 */
	private String updateBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleColumn() {
		return ruleColumn;
	}

	public void setRuleColumn(String ruleColumn) {
		this.ruleColumn = ruleColumn;
	}

	public String getRuleConditions() {
		return ruleConditions;
	}

	public void setRuleConditions(String ruleConditions) {
		this.ruleConditions = ruleConditions;
	}

	public String getRuleValue() {
		return ruleValue;
	}

	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
