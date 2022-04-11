package Resource;

import Pojo.DoctorAppointmentDetailsPojo;

public class DoctorAppointmentDetailsSet {
	public static DoctorAppointmentDetailsPojo DADetailsSet(String Key,String Value,String Key1)
	{
	DoctorAppointmentDetailsPojo ddp=new DoctorAppointmentDetailsPojo();
	ddp.setKey(Key);
	ddp.setValue(Value);
	ddp.setKey1(Key1);
	return ddp;
	}

}
