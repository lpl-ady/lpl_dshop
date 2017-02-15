package com.dshop.bean;

import java.util.List;
//http://www.blogjava.net/bolo/archive/2015/04/10/424271.html
public class SystemRight {
	
	private int rightId;
	private int rightParentId;
	private String rightName;
	private String rightIcon;
	private String rightUrl;
	private int rightOrder;
	private int rightDepth;
	
	private List<SystemRight> list;
	
	public int getRightDepth() {
		return rightDepth;
	}
	public void setRightDepth(int rightDepth) {
		this.rightDepth = rightDepth;
	}
	public int getRightId() {
		return rightId;
	}
	public void setRightId(int rightId) {
		this.rightId = rightId;
	}
	public int getRightParentId() {
		return rightParentId;
	}
	public void setRightParentId(int rightParentId) {
		this.rightParentId = rightParentId;
	}
	public String getRightName() {
		return rightName;
	}
	public void setRightName(String rightName) {
		this.rightName = rightName;
	}
	public String getRightIcon() {
		return rightIcon;
	}
	public void setRightIcon(String rightIcon) {
		this.rightIcon = rightIcon;
	}
	public String getRightUrl() {
		return rightUrl;
	}
	public void setRightUrl(String rightUrl) {
		this.rightUrl = rightUrl;
	}
	public int getRightOrder() {
		return rightOrder;
	}
	public void setRightOrder(int rightOrder) {
		this.rightOrder = rightOrder;
	}
	public List<SystemRight> getList() {
		return list;
	}
	public void setList(List<SystemRight> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return "SystemRight [rightId=" + rightId + ", rightParentId="
				+ rightParentId + ", rightName=" + rightName + ", rightIcon="
				+ rightIcon + ", rightUrl=" + rightUrl + ", rightOrder="
				+ rightOrder + ", list=" + list + "]";
	}
	
}
