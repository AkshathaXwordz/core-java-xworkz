class Swiggy{
public static double search(String foodName , int quantity){
	double price= 0.0;
System.out.println("invoked search : foodName(String), quantity(int)");
if(foodName == "pizza"){ 
	price =110.0* quantity;
	return price;
	
}
if (foodName == " veg Biriyani"){
price =260.0 * quantity;
return price;

}
	System.out.println( "end of search");
	return price;
}
}