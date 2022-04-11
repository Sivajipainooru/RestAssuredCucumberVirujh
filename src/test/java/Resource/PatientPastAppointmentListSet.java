package Resource;

import Pojo.PatientPastAppointmentList;

public class PatientPastAppointmentListSet {
	public static PatientPastAppointmentList PPAppointmentListSet(String KEY,String VALUE,String KEY1,String VALUE1)
	{
		PatientPastAppointmentList ppal=new PatientPastAppointmentList();
		ppal.setKEY(KEY);
		ppal.setVALUE(VALUE);
		ppal.setKEY1(KEY1);
		ppal.setVALUE1(VALUE1);
		return ppal;
	}

}
