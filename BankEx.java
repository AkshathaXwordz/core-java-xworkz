class BankEx
{

 public  static void main ( String details[]){
 
 Bank bank = new Bank();
 
 bank.setBankName("Canara Bank");
 System.out.println("the bank name is " + bank.getBankName());
 
 bank.setBranchName("VidyaNagar");
 System.out.println("the bank name is " + bank.getBranchName());
 
 bank.setManegerName("Kaushik");
 System.out.println("the maneger name is " + bank.getManegerName());
 
 bank.setAddress("Taralubalu Badavane Vidyanagar Davangere");
 System.out.println("the address " + bank.getAddress());
 
 bank.setIFSCCode("CNRB0001813");
 System.out.println("the IFSC code of the bank  is " + bank.getIFSCCode());
 
 bank.setMICRCode(577015007L);
 System.out.println("the MICR Code of the bank is " + bank.getMICRCode());
 
 bank.setNoOfWorkers(7);
 System.out.println("the number of workers in bank  " + bank.getNoOfWorkers());
 
 }
}
 