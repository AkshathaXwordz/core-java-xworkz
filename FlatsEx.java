class FlatsEx{
	public static void main(String[] mana){
		
	
	Flats flats=new Flats();
	flats.setFlatId("AS");
	flats.setNoOfFlats(24);
	flats.setNoOfFloors(6);
		
	Apartments	apartments=new Apartments();
	apartments.flats=flats;
	
	apartments.apartmentName="Phoenix One Luxury Apartments";
	
		System.out.println("Apartment Name : "+apartments.apartmentName);
		System.out.println("Flat Id : "+apartments.flats.getFlatId());
		System.out.println("No of Doors : "+apartments.flats.getNoOfFlats());
		System.out.println("No of Windoors : "+apartments.flats.getNoOfFloors());
		
	}
}