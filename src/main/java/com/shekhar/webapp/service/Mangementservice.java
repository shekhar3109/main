package com.shekhar.webapp.service;

import java.util.List;

import com.shekhar.webapp.model.ManagementModel;

public interface Mangementservice {

	List<ManagementModel> getAll();
	ManagementModel getById(int id);
	public ManagementModel addNewEmp(ManagementModel model);
	public ManagementModel updateByid(ManagementModel model);
}
