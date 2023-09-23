class Fish{
	private int fishId;
	private String fishName;
	private double price;
	private String weight;
	
	public Fish(){
		
	}
	
	public void setFishId(int fishId){
		this.fishId=fishId;
	}
	public void setFishName(String fishName){
		this.fishName=fishName;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setWeight(String weight){
		this.weight=weight;
	}
	
	public int getFishId(){
		return fishId;
	}
	public String getFishName(){
		return fishName;
	}
	public double getPrice(){
		return price;
	}
	public String getWeight(){
		return weight;
	}
}