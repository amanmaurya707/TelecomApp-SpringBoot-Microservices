package com.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plan.entity.Plan;

@Repository//DAO Layer
public interface PlanRepository extends JpaRepository<Plan,String> {
	//by default jpa provides query for basic operation like crud,pagination,sorting.
	//if  you write own then follow query approach or annotation based
	//by default jpa provides select operation for findById() and findAll()
	 

}
