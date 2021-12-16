package com.plan.service;

import java.util.List;
import com.plan.dto.PlanDTO;

public interface IPlanService {
public List<PlanDTO> getAllPlans();
public PlanDTO getSpecificPlan(String planId);
}
