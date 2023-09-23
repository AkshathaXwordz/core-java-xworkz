class RefillEx{
	public static void main(String[] ref){
		
	Refill refill=new Refill();
	refill.setRefillName("Parker pen");
	refill.setColor("Blue");
	refill.setType("Ball point");
		
	Pen pen=new Pen();
	pen.refill=refill;
	
	pen.penName="PARKERIM";
		
	System.out.println("Pen Name"+pen.penName);
	System.out.println("Refill Name : "+pen.refill.getRefillName());
	System.out.println("Refill colour : "+pen.refill.getColore());
	System.out.println("Refill type : "+pen.refill.getType());
		
	}
}