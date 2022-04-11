package Resource;

import Pojo.PatientLoginPojo;

public class PatientLoginSet {
	public static PatientLoginPojo PLogin(String phone,String password)
	{
	PatientLoginPojo patientLogin=new PatientLoginPojo();
		patientLogin.setPhone(phone);;
		patientLogin.setPassword(password);
		return patientLogin;
	}
}
