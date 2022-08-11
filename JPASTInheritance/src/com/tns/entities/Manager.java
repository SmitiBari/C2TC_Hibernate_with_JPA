package com.tns.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="MGR")

public class Manager extends Employee {

	public static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

}

