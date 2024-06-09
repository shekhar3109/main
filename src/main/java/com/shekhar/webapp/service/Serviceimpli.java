package com.shekhar.webapp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.shekhar.webapp.model.ManagementModel;

@Service
public class Serviceimpli implements Mangementservice {
	

	
	List<ManagementModel> list;
	
	public Serviceimpli() {
		list= new ArrayList<>();
	 list.add(new ManagementModel(1,"Manju",52262390,"Shekhar","Hyperscience","The project is based on ML,AI,C# etc"));	
	 list.add(new ManagementModel(2,"Srini",52262395,"Aman","Hyperscience","The project is based on ML,AI,C# etc"));	
	 list.add(new ManagementModel(3,"Gopinath",52262392,"Pruthvi","Hyperscience","The project is based on ML,AI,C# etc"));	
	}
	
	//get all details
	@Override
	public List<ManagementModel> getAll() {
		return list ;
	}


	//get details by id
	@Override
	public ManagementModel getById(int id) {
			ManagementModel obj = null;
		for (ManagementModel managementModel : list) {
				if ((managementModel.getEmployeeId() == id) || (managementModel.getMangerId() == id) ) {
					
					obj = managementModel;
				
				}else {
					System.out.println("BOOK NOT FOUND");
				}
	}
		return obj;		
		
	}
	
	//update by id
	@Override
	public ManagementModel updateByid(ManagementModel model) {
		for (ManagementModel managementModel : list) {
			if (managementModel.getEmployeeId() == model.getEmployeeId()) {
				
				  managementModel.setEmployeeName(model.getEmployeeName());
				  managementModel.setProjectName(model.getProjectName());
				  managementModel.setProjectDesc(model.getProjectDesc());
				 
				break;
			}
		}
		return model;
		
	
	}
	
	//add new 
	public ManagementModel addNewEmp(ManagementModel model) {
		if (model != null) {
			list.add(model);	
		}else System.out.println("Insert Correct Data");
		
		return model;
	}
	

}
