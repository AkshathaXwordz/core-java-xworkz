class PatientEx{
	public static void main(String[] pat){
		
	Patient patient=new Patient();
	patient.setPatientId(11);
	patient.setPatientName("Akshatha");
	patient.setDiseases("Cancer");
	patient.setDocName("Naveen Hanasi");
	
		
	Hospital hospital=new Hospital();
	hospital.patient=patient;
	hospital.hospitalName="city centre Hospital";
		
	System.out.println("Hospital Name : "+hospital.hospitalName);
	System.out.println("Patient Id : "+hospital.patient.getPatientId());
	System.out.println("Patient Name : "+hospital.patient.getPatientName());
	System.out.println("Diseases : "+hospital.patient.getDiseases());
	System.out.println("Doctor name : "+hospital.patient.getDocName());
		
	}
}