class SwiggyNExecutor
{
 public static void main (String args[] ) {
		   System.out.println("main started");
		    double price= SwiggyN.search("vada pav");
			System.out.println("vada pav price is" +price);
			
			 double pricewithquantity= SwiggyN.search("vada pav",8);
			System.out.println("vada pav price is" +pricewithquantity);
			   System.out.println("main ended");
 }
}
//writtwn statemwnt istthe last statemwnt of execyted in method
//multiple times writing of returns is best-time saVING,COME OUT from method,execute fast