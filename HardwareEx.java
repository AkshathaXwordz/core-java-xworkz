class HardwareEx{
	public static void main(String[] phone){
		
	
	Hardware hardware=new Hardware();
	hardware.setHardwareName("Motherboard");
	hardware.setPrice(2239);
	hardware.setComanyName("ZEBRONICS");
	hardware.setWeigth(200);
		
	Software software=new Software();
	software.hardware=hardware;
	software.softwareName="BIOS software";
	
	System.out.println("Soft ware in Hardware : "+software.softwareName);
	System.out.println("Hard Ware Component Name : "+software.hardware.getHardwareName());
	System.out.println("Price of the Hardware Component : "+software.hardware.getPrice());
	System.out.println("Company : "+software.hardware.getComanyName());
	System.out.println("weigth of the component in grams: "+software.hardware.getWeigth());
		
	}
}