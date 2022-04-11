package Resource;

import Pojo.SeleniumPojo;

public class SeleniumSet {
	public static SeleniumPojo selSet(String EmailID,String Password)
	{
		SeleniumPojo s=new SeleniumPojo();
		s.setEmailID(EmailID);
		s.setPassword(Password);
		return s;
	}

}
