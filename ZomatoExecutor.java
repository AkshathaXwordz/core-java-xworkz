class ZomatoExecutor
{
 public static void main (String args[] ) {
		   System.out.println("main started");
		    double price= Zomato.search("pizza");
			System.out.println("pizza price is" +price);
			
			 double pricewithquantity= Zomato.search("pizza",3);
			System.out.println("pizza price of 3 quantity is" +pricewithquantity);
			   System.out.println("main ended");
 }
}
//Classname.methodname();
//access modifiercreturn type methodname(parameter)


//return value;
//}