package com.mhb.pattern.dao;

import com.mhb.pattern.bo.ProfileBO;

public interface ProfileDAO {
public ProfileBO findProfile(int pid)throws Exception;
}
