package com.plan.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plan.dto.PlanDTO;
import com.plan.entity.Plan;
import com.plan.repository.PlanRepository;
import com.plan.service.IPlanService;
@Service
public class PlanServiceImpl implements IPlanService {
	@Autowired
	PlanRepository repo;

	@Override
	public List<PlanDTO> getAllPlans() {
		List<Plan> planList=repo.findAll();
		List<PlanDTO> planDTOList=new ArrayList<>();
		for(Plan plan:planList)
		{
			PlanDTO planDTO=new PlanDTO();
			BeanUtils.copyProperties(plan, planDTO);
			planDTOList.add(planDTO);//adding plan dto obj into plan dto list obj
			
		}
		return planDTOList;
	}
	@Override
	public PlanDTO getSpecificPlan(String planId) {
		
		Optional<Plan> opt=repo.findById(planId);
		//System.out.println("####");	
		PlanDTO planDTO=new PlanDTO();
		if(opt.isPresent())
		{
			Plan plan=opt.get();
			
			BeanUtils.copyProperties(plan, planDTO);
			//return planDTO;
		}
		else
		{
			System.out.println("not found");
			//return planDTO;
		}
		//System.out.println("value:#####"+plan);
	  return planDTO;
		
	}

}
