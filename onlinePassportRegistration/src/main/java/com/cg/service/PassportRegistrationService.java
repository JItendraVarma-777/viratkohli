package com.cg.service;

import java.util.List;
import java.util.Optional;

import com.cg.entity.PassportRegistrationModel;

public interface PassportRegistrationService {

	public PassportRegistrationModel addPassportRegistration(PassportRegistrationModel entity) ;

    public PassportRegistrationModel update(PassportRegistrationModel entity);

	public Optional<PassportRegistrationModel> getRegisterById(Long id);

	public void deleteEmployee(PassportRegistrationModel entity);

	public List<PassportRegistrationModel> getAllEmployees();

	
} 
