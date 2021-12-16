package com.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.dto.PlanDTO;

@Component
@FeignClient("PLANMS")
public interface PlanFeign {
	@GetMapping("/Plan/{planId}")  //@RequestMapping
	public PlanDTO getPlanData(@PathVariable String planId);

}
