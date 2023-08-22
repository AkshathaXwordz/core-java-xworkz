class SwiggyTester {
	
	public static void main(String foodDelivery[] ){
		System.out.println ("main started");
		
		double price = Swiggy.search("pizza ");
					System.out.println("the price for pizza"+price);
			 double priceWithQuantity=Swiggy.search("pizza",3);
			 System.out.println("the price for pizza with quantity 3 is" + priceWithQuantity);
			
		System.out.println ("main ended");
	}
} 