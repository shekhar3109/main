package com.shekhar.webapp.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonPropertyOrder({"employeeName","employeeId"})
@EntityScan
public class ManagementModel{
	
	private int mangerId;
	private String managerName;
	private int employeeId;
	private String employeeName;
	private String projectName;
	private String projectDesc;
	public ManagementModel(int mangerId, String managerName, int employeeId, String employeeName, String projectName,
			String projectDesc) {
		super();
		this.mangerId = mangerId;
		this.managerName = managerName;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
	}
	public ManagementModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ManagementModel [mangerId=" + mangerId + ", managerName=" + managerName + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", projectName=" + projectName + ", projectDesc=" + projectDesc
				+ "]";
	}
	public int getMangerId() {
		return mangerId;
	}
	public void setMangerId(int mangerId) {
		this.mangerId = mangerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	
	
	
	
	
}