package com.mhb.pattern.command;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.mhb.pattern.dto.ProfileDTO;
import com.mhb.pattern.model.ProfileModel;
import com.mhb.pattern.service.ProfileService;
import com.mhb.pattern.service.ProfileServiceImpl;
import com.mhb.pattern.vo.ProfileVO;

public class ProfileCommand implements Command {
public ProfileCommand() {
	System.out.println("-------------ProfileCommand-------------");
}
	@Override
	public String execute(ServletRequest req, ServletResponse res, Object model) {
		// TODO Auto-generated method stub
		ProfileModel pModel=null;
		ProfileService service=null;
		ProfileDTO dto=null;
		pModel=(ProfileModel) model;
		ProfileVO vo=null;
		//use service
		try{
			service=new ProfileServiceImpl();
			dto=service.viewProfile(pModel.getPid());
			
		}
		catch(Exception e)
		{
			return "error";
		}
		// convert ProfileDTO to ProfileVO
		vo=new ProfileVO();
		vo.setProfileId(String.valueOf(dto.getProfileid()));
		vo.setProfileName(dto.getProfileName());
		vo.setEmail(dto.getEmail());
		vo.setAge(String.valueOf(dto.getAge()));
		//keep vo class object in request scope
		req.setAttribute("profileInfo",vo);
		//return Logical view name
		return "show";
	}

}
