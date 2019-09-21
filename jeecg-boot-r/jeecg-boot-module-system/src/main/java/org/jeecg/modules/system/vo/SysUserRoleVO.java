package org.jeecg.modules.system.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SysUserRoleVO implements Serializable{
	private static final long serialVersionUID = 1L;

	/**部门id*/
	private String roleId;
	/**对应的用户id集合*/
	private List<String> userIdList;
	public SysUserRoleVO(String roleId, List<String> userIdList) {
		super();
		this.roleId = roleId;
		this.userIdList = userIdList;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public List<String> getUserIdList() {
		return userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
