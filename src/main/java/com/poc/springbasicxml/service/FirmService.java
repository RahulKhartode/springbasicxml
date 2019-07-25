package com.poc.springbasicxml.service;

import java.util.List;

import com.poc.springbasicxml.dao.FirmDAO;
import com.poc.springbasicxml.dto.FirmDTO;

public class FirmService {

	private FirmDAO firmDAO;
	
	public FirmService() {
		System.out.println("FirmService created");
	}
	
	public void setFirmDAO(FirmDAO firmDAO) {
		this.firmDAO = firmDAO;
	}
	
	public FirmDAO getFirmDAO() {
		return firmDAO;
	}
	
	public List<FirmDTO> findAll() {
		return this.firmDAO.findAll();
	}
	
	public void init() {
		System.out.println("In FirmService init");
	}
	
	public void destroy() {
		System.out.println("In FirmService destroy");
	}
}
