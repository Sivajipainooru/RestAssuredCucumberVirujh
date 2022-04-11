package Resource;

import Pojo.PatientChagePasswordPojo;

public class PatientChangePasswordSet {
	public static PatientChagePasswordPojo PCPasswordSet(String oldPassword,String newPassword,String confirmNewPassword)
	{
		PatientChagePasswordPojo pc=new PatientChagePasswordPojo();
		pc.setOldPassword(oldPassword);
		pc.setNewPassword(newPassword);
		pc.setConfirmNewPassword(confirmNewPassword);
		return pc;
	}

}
