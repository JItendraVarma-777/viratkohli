package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.PassportRegistrationModel;


@Repository
public interface PassportRegistartionDOA extends JpaRepository<PassportRegistrationModel,Long>  {

}
