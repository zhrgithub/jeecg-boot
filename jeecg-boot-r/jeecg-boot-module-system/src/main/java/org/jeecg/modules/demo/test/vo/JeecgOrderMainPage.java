package org.jeecg.modules.demo.test.vo;

import java.util.List;

import org.jeecg.modules.demo.test.entity.JeecgOrderCustomer;
import org.jeecg.modules.demo.test.entity.JeecgOrderTicket;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;

import lombok.Data;

@Data
public class JeecgOrderMainPage {
	
	/**主键*/
	private java.lang.String id;
	/**订单号*/
	@Excel(name="订单号",width=15)
	private java.lang.String orderCode;
	/**订单类型*/
	private java.lang.String ctype;
	/**订单日期*/
	@Excel(name="订单日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date orderDate;
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(java.lang.String orderCode) {
		this.orderCode = orderCode;
	}
	public java.lang.String getCtype() {
		return ctype;
	}
	public void setCtype(java.lang.String ctype) {
		this.ctype = ctype;
	}
	public java.util.Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(java.util.Date orderDate) {
		this.orderDate = orderDate;
	}
	public java.lang.Double getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(java.lang.Double orderMoney) {
		this.orderMoney = orderMoney;
	}
	public java.lang.String getContent() {
		return content;
	}
	public void setContent(java.lang.String content) {
		this.content = content;
	}
	public java.lang.String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(java.lang.String createBy) {
		this.createBy = createBy;
	}
	public java.util.Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	public java.lang.String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(java.lang.String updateBy) {
		this.updateBy = updateBy;
	}
	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	public List<JeecgOrderCustomer> getJeecgOrderCustomerList() {
		return jeecgOrderCustomerList;
	}
	public void setJeecgOrderCustomerList(List<JeecgOrderCustomer> jeecgOrderCustomerList) {
		this.jeecgOrderCustomerList = jeecgOrderCustomerList;
	}
	public List<JeecgOrderTicket> getJeecgOrderTicketList() {
		return jeecgOrderTicketList;
	}
	public void setJeecgOrderTicketList(List<JeecgOrderTicket> jeecgOrderTicketList) {
		this.jeecgOrderTicketList = jeecgOrderTicketList;
	}
	/**订单金额*/
	@Excel(name="订单金额",width=15)
	private java.lang.Double orderMoney;
	/**订单备注*/
	private java.lang.String content;
	/**创建人*/
	private java.lang.String createBy;
	/**创建时间*/
	private java.util.Date createTime;
	/**修改人*/
	private java.lang.String updateBy;
	/**修改时间*/
	private java.util.Date updateTime;
	
	@ExcelCollection(name="客户")
	private List<JeecgOrderCustomer> jeecgOrderCustomerList;
	@ExcelCollection(name="机票")
	private List<JeecgOrderTicket> jeecgOrderTicketList;
	
}
