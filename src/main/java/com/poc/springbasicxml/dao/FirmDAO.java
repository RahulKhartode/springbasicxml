package com.poc.springbasicxml.dao;

import java.util.ArrayList;
import java.util.List;

import com.poc.springbasicxml.datasource.DummyDataSource;
import com.poc.springbasicxml.dto.FirmDTO;

public class FirmDAO {
	
	public FirmDAO(DummyDataSource dataSource) {
		System.out.println("FirmDAO created");
		System.out.println("DataSource - "+dataSource.getUrl());
	}

	public List<FirmDTO> findAll() {
		List<FirmDTO> firmDTOs = new ArrayList<FirmDTO>();
		
		FirmDTO firmDTO1 = new FirmDTO();
		firmDTO1.setFirmMPID("ETMM");
		firmDTOs.add(firmDTO1);
		
		FirmDTO firmDTO2 = new FirmDTO();
		firmDTO2.setFirmMPID("PCPT");
		firmDTOs.add(firmDTO2);
		
		return firmDTOs;
	}
	
	public void init() {
		System.out.println("In FirmDAO init");
	}
	
	public void destroy() {
		System.out.println("In FirmDAO destroy");
	}
}
