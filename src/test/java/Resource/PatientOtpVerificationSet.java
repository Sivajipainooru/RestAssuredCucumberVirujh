package Resource;

import Pojo.PatientOtpVerificationPojo;
import io.restassured.path.json.JsonPath;

public class PatientOtpVerificationSet {
	public static PatientOtpVerificationPojo POVerificationSet(String phone, String passcode)
	{
	  PatientOtpVerificationPojo povp=new PatientOtpVerificationPojo();
	  povp.setPhone(phone);
	  povp.setPasscode(passcode);
	  
	  return povp;
	}
  
}
