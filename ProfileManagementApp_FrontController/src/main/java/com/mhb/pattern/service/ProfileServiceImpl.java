package com.mhb.pattern.service;

import com.mhb.pattern.bo.ProfileBO;
import com.mhb.pattern.dao.ProfileDAO;
import com.mhb.pattern.dao.ProfileDAOImpl;
import com.mhb.pattern.dto.ProfileDTO;

public class ProfileServiceImpl implements ProfileService {

	@Override
	public ProfileDTO viewProfile(int pid) throws Exception {
		// TODO Auto-generated method stub
		ProfileDAO dao=null;
		ProfileBO bo=null;
		ProfileDTO dto=null;
		//use DAO
		dao=new ProfileDAOImpl();
		bo=dao.findProfile(pid);
		// convert Bo to Dto
		dto=new ProfileDTO();
		dto.setProfileid(bo.getProfileId());dto.setProfileName(bo.getProfileName());
		dto.setEmail(bo.getEmail());dto.setAge(bo.getAge());
		
		return dto;
	}

}
