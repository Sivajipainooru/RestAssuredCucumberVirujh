package Resource;

import Pojo.FindDoctorByNamePojo;

public class FindDoctorByNameSet {
	public static FindDoctorByNamePojo FDByNameSet(String codeOrName )
	{
		FindDoctorByNamePojo f=new FindDoctorByNamePojo();
		f.setCodeOrName(codeOrName);
		return f;
	}
	

}
