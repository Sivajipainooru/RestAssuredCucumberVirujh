package Resource;

import Pojo.DoctorlistByHospitalIDPojo;

public class DoctorlistByHospitallDSet {
	public static DoctorlistByHospitalIDPojo DLBHospitallDSet(String key,String key1)
	{
		DoctorlistByHospitalIDPojo d=new DoctorlistByHospitalIDPojo();
	    d.setKey(key);
	    //d.setValue(value);
	    d.setKey1(key1);
	    //d.setValue1(value1);
		return d;
	}

}
