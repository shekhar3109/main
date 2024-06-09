package com.shekhar.webapp.controller;

import java.nio.file.attribute.AclEntry;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shekhar.webapp.model.ManagementModel;
import com.shekhar.webapp.service.Mangementservice;

import jakarta.websocket.server.PathParam;



@RestController
@RequestMapping("/home")
public class Mangementcontroller {
	@Autowired
	private Mangementservice obj;

	@GetMapping
	public String getHome() {
		return "Home Page reached";
	}
	
	@GetMapping("/all")
	public List<ManagementModel> getAll(){
		return this.obj.getAll() ;
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<ManagementModel>  getById(@PathVariable int id) {
		ManagementModel model = this.obj.getById(id);
	
		if (model == null) {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(model, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<ManagementModel> addNewEmp(@RequestBody ManagementModel model){
		model = this.obj.addNewEmp(model);
		if (model == null) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(model,HttpStatus.OK);
	
		
	}

	@PutMapping("/update")
	public ResponseEntity<ManagementModel> updateData(@RequestBody ManagementModel model){
		
		model = this.obj.updateByid(model);
		if (model == null) {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(model,HttpStatus.ACCEPTED);
	}
}