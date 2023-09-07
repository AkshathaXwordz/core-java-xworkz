class PatientEx
{

 public  static void main ( String details[]){
 
 Patient patient =new Patient();
 
 patient.setPatientId(1);
 System.out.println("the patient id is " + patient.getPatientId());
 
 patient.setPatientName("Akshatha");
 System.out.println("the patient name is " + patient.getPatientName());
 
 patient.setHospitalName("city centeral hospital");
 System.out.println("the Hospital name is " + patient.getHospitalName());
 
 patient.setPatientAddress("vidyartibhavan  Davangere");
 System.out.println("the patient address is " + patient.getPatientAddress());
 
 patient.setAdmittedDate("1-1-23");
 System.out.println("the patient admitted date is " + patient.getAdmittedDate());
 
 patient.setAge("22 yrs");
 System.out.println("the patient age is " + patient.getAge());
 
patient.setWardNo(16);
 System.out.println("the patient wardno is " + patient.getWardNo());
  
 patient.setGender("Female");
 System.out.println("the patient gender is " + patient.getGender());
 
 }
}