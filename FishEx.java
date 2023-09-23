class FishEx{
	
	public static void main(String[] machele){
		Fish fish=new Fish();
		fish.setFishId(1);
		fish.setFishName("Hilsa/llish");
		fish.setPrice(500);
		fish.setWeight("650-700gm");
		
		Water water=new Water();
		water.fish=fish;
		water.waterType="brackish water";
		System.out.println("Water Type : "+water.waterType);
		System.out.println("Fish Id : "+water.fish.getFishId());
		System.out.println("Fish Name : "+water.fish.getFishName());
		System.out.println("Fish Price : "+water.fish.getPrice());
		System.out.println("Fish Weigth : "+water.fish.getWeight());
		
	}
	
}