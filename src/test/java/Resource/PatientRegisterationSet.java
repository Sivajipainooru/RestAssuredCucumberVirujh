package Resource;

import Pojo.PatientRegisterPojo;

public class PatientRegisterationSet {
	public static PatientRegisterPojo PRegisteration(String phone,String email,String password,String firstName,String lastName,String dateOfBirth,String country,String address,String state,String pincode,String gender)
	{
		PatientRegisterPojo pr=new PatientRegisterPojo();
		pr.setPhone(phone);
		pr.setEmail(email);
		pr.setPassword(password);
		pr.setFirstName(firstName);
		pr.setLastName(lastName);
		pr.setDateOfBirth(dateOfBirth);
		pr.setCountry(country);
		pr.setAddress(address);
		pr.setState(state);
		pr.setPincode(pincode);
		pr.setGender(gender);
		return pr;
		
	}

}
