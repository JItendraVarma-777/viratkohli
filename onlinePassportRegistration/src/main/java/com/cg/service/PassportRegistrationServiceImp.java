package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.PassportRegistrationModel;

import com.cg.repository.PassportRegistartionDOA;
@Service
public class PassportRegistrationServiceImp implements PassportRegistrationService{
     
	@Autowired
	PassportRegistartionDOA repository;
	
	@Override
	public PassportRegistrationModel addPassportRegistration(PassportRegistrationModel entity) {
		return repository.save(entity);
	}
	
	@Override
	public Optional<PassportRegistrationModel> getRegisterById(Long id){
		return repository.findById(id);
	}
	
	@Override
	public void deleteEmployee(PassportRegistrationModel entity) {
		repository.delete(entity);
	}
	
	@Override
	 public PassportRegistrationModel update(PassportRegistrationModel entity) {
		return repository.save(entity);
	 }
	
	@Override
	public List<PassportRegistrationModel> getAllEmployees(){
		return repository.findAll();
	}
}
