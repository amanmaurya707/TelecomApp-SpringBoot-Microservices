package com.calldetails.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calldetails.dto.CallDetailsDTO;
import com.calldetails.entity.CallDetails;
import com.calldetails.repository.CallDetailsRepository;
import com.calldetails.service.ICallDetailsService;
@Service
public class CallDetailsServiceImpl implements ICallDetailsService {
//service is depend on repository //for returning dto object insted of returning entity object
	@Autowired
	CallDetailsRepository repo;
	@Override
	public List<CallDetailsDTO> readCallDetails(Long phoneNumber) {
		List<CallDetails> callDetailsList=repo.findByCalledBy(phoneNumber);
		List<CallDetailsDTO> callDetailsDTOList=new ArrayList<>();
		callDetailsList.forEach(callDetails->{
			CallDetailsDTO callDetailsDTO=new CallDetailsDTO();
			BeanUtils.copyProperties(callDetails,callDetailsDTO);//copy values
			callDetailsDTOList.add(callDetailsDTO);
			//copy entity obj to dto/model obj
		});
		return callDetailsDTOList;
	}

}
