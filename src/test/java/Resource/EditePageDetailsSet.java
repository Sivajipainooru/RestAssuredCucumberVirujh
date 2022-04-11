package Resource;

import Pojo.EditePageDetailsPojo;

public class EditePageDetailsSet {
	public static EditePageDetailsPojo EPDetailsSet(String PatientId,String address)
	{
		EditePageDetailsPojo e=new EditePageDetailsPojo();
		e.setPatientId(PatientId);
//		e.setPhone(phone);
//		e.setEmail(email);
//		e.setPassword(password);
//		e.setFirstName(firstName);
//		e.setLastName(lastName);
//		e.setDateOfBirth(dateOfBirth);
//		e.setCountry(country);
		e.setAddress(address);
//		e.setState(state);
//		e.setPincode(pincode);
//		e.setGender(gender);

		return e;
	}

}
