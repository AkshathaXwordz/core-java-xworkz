public class Patient {
	private int patientId;
 private String patientName;
  private String hospitalName;
 private String  patientaddress;
 private String admittedDate;
 private String age;
 private int wardNo;
 private String gender;
 
 public void setPatientId(int patientId){
   this.patientId=patientId;}
   public int getPatientId(){
  return patientId;
   }
   
   public void setPatientName(String patientName){
   this.patientName=patientName;}
   public String getPatientName(){
  return patientName;
   }
   
   public void setHospitalName(String hospitalName){
   this.hospitalName=hospitalName;}
   public String getHospitalName(){
  return hospitalName;
   }
   
   public void setPatientAddress(String patientaddress){
   this.patientaddress=patientaddress;}
   public String getPatientAddress(){
  return patientaddress;
   }
   
   public void setAdmittedDate(String admittedDate){
   this.admittedDate=admittedDate;}
   public String getAdmittedDate(){
  return admittedDate;
   }
   
   public void setAge(String age){
   this.age=age;}
   public String getAge(){
  return age;
   }
   
   public void setWardNo(int wardNo){
   this.wardNo=wardNo;}
   public int getWardNo(){
  return wardNo;
   }
   
   public void  setGender(String gender){
	   this.gender=gender; }
    public String  getGender(){
   return gender;
   }
   
}