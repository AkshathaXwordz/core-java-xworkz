class DominosExecutor
{
 public static void main (String args[] ) {
		   System.out.println("main started");
		    double price= Dominos.search("chicken pepproni");
			System.out.println("chicken pepproni price is" +price);
			
			 double pricewithquantity= Dominos.search("chicken pepproni",5);
			System.out.println("chicken pepproni price is" +pricewithquantity);
			   System.out.println("main ended");
 }
}