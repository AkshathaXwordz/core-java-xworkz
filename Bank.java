public class Bank {
	private String bankName;
 private String branchName;
 private String manegerName;
 private String  address;
 private String ifscCode;
 private long micrCode;
 private int noOfWorkers;
 
 
 public void setBankName(String bankName){
   this.bankName=bankName;}
   public String getBankName(){
  return bankName;
   }
   
   public void setBranchName(String BranchName){
   this.branchName=branchName;}
   public String getBranchName(){
  return branchName;
   }
   
   public void setManegerName(String manegerName){
   this.manegerName=manegerName;}
   public String getManegerName(){
  return manegerName;
   }
   
   public void setAddress(String address){
   this.address=address;}
   public String getAddress(){
  return address;
   }
   
   public void setIFSCCode(String ifscCode ){
   this.ifscCode=ifscCode;}
   public String getIFSCCode(){
  return ifscCode;
   }
   
   public void setMICRCode(long micrCode){
   this.micrCode=micrCode;}
   public long getMICRCode(){
  return micrCode;
   }
 
  public void setNoOfWorkers(int noOfWorkers){
   this.noOfWorkers=noOfWorkers;}
   public int getNoOfWorkers(){
  return noOfWorkers;
   }
   }