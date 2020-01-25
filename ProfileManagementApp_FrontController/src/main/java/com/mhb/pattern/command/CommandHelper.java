package com.mhb.pattern.command;

public class CommandHelper {
	public static Command getCommand(String uri){
		System.out.println("---------------CommandHelper---------");
Command commad=null;
//action management
if(uri.equalsIgnoreCase("/profile.do"))
{
	commad=new ProfileCommand();
}
else{
	throw new IllegalArgumentException("Invalid mapping");
}
return commad;
}
}
