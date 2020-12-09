package com.cg.controller;

import java.util.Optional;
import java.util.List;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.PassportRegistrationModel;
import com.cg.exception.RegistrationNotFoundException;
import com.cg.service.PassportRegistrationServiceImp;



@RestController
public class PassportRegistartionController  {
     
	@Autowired
	public PassportRegistrationServiceImp service;
	
	@PostMapping("/register/newreg")
	public PassportRegistrationModel createRegister(@RequestBody PassportRegistrationModel data) {
		 return service.addPassportRegistration(data);
	}
	
	   @GetMapping("/register/{id}")
	   public ResponseEntity<PassportRegistrationModel> getRegisterById(@PathVariable(value="id") Long dataid) throws RegistrationNotFoundException {
	   PassportRegistrationModel reg= service.getRegisterById(dataid).orElseThrow(() -> new RegistrationNotFoundException("Registration Not Found for this id:"));
	   return  ResponseEntity.ok().body(reg); 
	  }
	 
     
     @DeleteMapping("/register/delete/{id}")
     public String deleteRegister(@PathVariable(value="id") Long regid) throws RegistrationNotFoundException {
	   PassportRegistrationModel deleted= service.getRegisterById(regid).orElseThrow(()-> new RegistrationNotFoundException("Registration Not Found for this id:"));
	   service.deleteEmployee(deleted);
	   return "File Deleted";
    }
     
   @PutMapping("/register/update/{id}")
   public ResponseEntity<PassportRegistrationModel> updateRegister(@PathVariable(value="id") Long upid,@RequestBody PassportRegistrationModel entity) throws RegistrationNotFoundException{
    PassportRegistrationModel store= service.getRegisterById(upid).orElseThrow(()-> new RegistrationNotFoundException("Not Found"));
	store.setEmail(entity.getEmail());
	store.setFirstName(entity.getFirstName());
	store.setGender(entity.getGender());
	store.setQualification1(entity.getQualification1());
	store.setQualification2(entity.getQualification2());
	PassportRegistrationModel updated = service.addPassportRegistration(entity);
	return  ResponseEntity .ok().body(updated);
    }
   
   @GetMapping("/register/all")
   public List<PassportRegistrationModel> allRegisters(){
	   return service.getAllEmployees();
    }
   
}