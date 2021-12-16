package com.calldetails.service;

import java.util.List;

import com.calldetails.dto.CallDetailsDTO;

public interface ICallDetailsService {
	public List<CallDetailsDTO> readCallDetails(Long phoneNumber);

}
