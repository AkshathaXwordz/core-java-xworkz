class Fact{
 public static void main(String fact[]){
 System.out.println("main started");
 getFact(8);
 getFact (9);
 getFact(5);

 }
 
public static void getFact(int factnumber){
	 System.out.println("main started");

	int fact =1;
	for (int n=1;n<factnumber;n++){
		fact=fact*n;
	}
	System.out.println("the factorial of "+factnumber+" is "+fact);
	
}
}