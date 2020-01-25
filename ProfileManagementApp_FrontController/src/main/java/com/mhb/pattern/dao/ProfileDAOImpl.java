package com.mhb.pattern.dao;

import com.mhb.pattern.bo.ProfileBO;

public class ProfileDAOImpl implements ProfileDAO {
public ProfileDAOImpl() {
	// TODO Auto-generated constructor stub
	System.out.println("--------------ProfileDAOImpl--------------");
}
	@Override
	public ProfileBO findProfile(int pid) throws Exception {
		ProfileBO bo=null;
		bo=new ProfileBO();
		bo.setProfileId(1001);
		bo.setProfileName("satish");
		bo.setEmail("satish28@gmail.com");
		bo.setAge(30);
		
		// TODO Auto-generated method stub
		return bo;
	}

}
