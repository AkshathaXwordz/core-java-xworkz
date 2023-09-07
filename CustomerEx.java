class CustomerEx
{

 public  static void main ( String cust[]){

Customer customer =new Customer();
customer.setCustomerId(1);
+

customer.setCustomerName("Akshatha");
System.out.println("the customer name is " + customer.getCustomerName());

customer.setAddress("ganesh layout Davangere");
System.out.println("the customer address is " + customer.getAddress());

customer.setContactNo(8431347478L);
System.out.println("the customer phone no  is " + customer.getContactNo());

customer.setEmail("akshathahv2001@gmail.com");
System.out.println("the customer email id is " + customer.getEmail());

customer.setDob("02-10-2001");
System.out.println("the customer date of birth is " + customer.getDob());

customer.setGender("Female");
System.out.println("the customer gender is " + customer.getGender());


 }
}
// patient -id , name, attenderName,age,dieaseName, wardNo,admitteddate,
 //HospitalName,address,gender,consultantDoctor

// bank- id ,branchname ,ifsccode
// railwaystation 
////postoffice-
//bustand