class Box8Executor
{
 public static void main (String args[] ) {
		   System.out.println("main started");
		    double price= Box8.search("roti");
			System.out.println("roti price is" +price);
			
			   double pricewithquantity= Box8.search("roti",5);
			System.out.println("roti price is" +pricewithquantity);
			   System.out.println("main ended");
 }
}