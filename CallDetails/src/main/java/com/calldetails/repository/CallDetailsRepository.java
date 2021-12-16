package com.calldetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calldetails.entity.CallDetails;

@Repository
public interface CallDetailsRepository extends JpaRepository<CallDetails, Long>{
	//by default jpa provides to basic select operation findById() and findAll().
	//save() ,saveAndFlush(),deleteById() and deleteAll() by default enable
	//if you write own query then use query methods/approach to or some annotation 
public  List<CallDetails>  findByCalledBy(Long phoneNumber); ///findBy phone no: i.e callBy

}
