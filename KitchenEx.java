class KitchenEx{
	
	public static void main(String[] food){
		Kitchen kitchen=new Kitchen();
		kitchen.setKitchenName("Akshatha Hanasi");
		kitchen.setCookName("indira");
		kitchen.setDishName("Allu parota");
		kitchen.setTypeOfDish("Spicy");
		
		Hotel hotel=new Hotel();
		hotel.kitchen=kitchen;
		hotel.hotelName="Bharath";
		
		System.out.println("Hotel Name : "+hotel.hotelName);
		
		System.out.println("Kitchen Name : "+hotel.kitchen.getKitchenName());
		System.out.println("Kitchen Cook Name : "+hotel.kitchen.getCookName());
		System.out.println("Dish Cooked in Kitchen : "+hotel.kitchen.getDishName());
		System.out.println("Type of Dish : "+hotel.kitchen.getTypeOfDish());
		
	}
}