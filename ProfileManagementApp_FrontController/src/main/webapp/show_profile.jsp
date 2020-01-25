<%@ page import="com.mhb.pattern.vo.ProfileVO" isELIgnored="false" %>

  <h1 style="color:red;text-align:center">Result Page</h1>
  
  <b>Profile Details</b> <br>
   Profile Id :: ${profileInfo.profileId}<br>
   Profile Name :: ${profileInfo.profileName}<br>
   Profile Addrs :: ${profileInfo.email}<br>
   Profile Age :: ${profileInfo.age}<br>

   <a href="index.html">home</a>