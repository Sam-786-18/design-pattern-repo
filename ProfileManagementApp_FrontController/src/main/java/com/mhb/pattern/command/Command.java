package com.mhb.pattern.command;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface Command {
public String execute(ServletRequest req,ServletResponse res,Object model);
}
