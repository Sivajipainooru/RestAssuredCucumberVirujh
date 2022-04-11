package Resource;

import Pojo.PatientResetPasswordLinkPojo;

public class PatientResetPasswordLinkSet {
	public static PatientResetPasswordLinkPojo PRPasswordSet(String phone)
	{
		PatientResetPasswordLinkPojo prpl=new PatientResetPasswordLinkPojo();
		prpl.setPhone(phone);
		return prpl;
	}

}
