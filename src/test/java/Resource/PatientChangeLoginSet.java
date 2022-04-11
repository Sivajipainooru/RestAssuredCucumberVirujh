package Resource;

import Pojo.PatientLoginPojo;

public class PatientChangeLoginSet {
public static PatientLoginPojo PCloginSet(String phone,String password)
{
	PatientLoginPojo p=new PatientLoginPojo();
	p.setPhone(phone);
	p.setPassword(password);
	return p;
}
}
