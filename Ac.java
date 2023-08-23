class Ac {
static boolean isconnected;
 static int minTemp ;
 static int maxTemp=7;
 static int currentTemp=1 ;
 


public static boolean onOrOff(){
System.out.println("Inside onOrOff");


if(isconnected == false){
isconnected = true;
System.out.println(" AC  is turned on ...");

}
else if (isconnected== true){
	
System.out.println(" AC  is turned off.....");
isconnected = false;
}
System.out.println("end of onOrOff");
return isconnected;
}

public  static void increaseTemp (){
 System.out.println("start of increaseTemp");
 
 if (isconnected== true ){
	if(currentTemp < maxTemp){
		 currentTemp= currentTemp+1;
		 System .out.println("the current Temperature is " +currentTemp);
	}
else {
System.out.println("Max temperature is reached");
}
 }else{
System.out.println(" ....turn on the AC first...");
}
System.out.println("end of increaseTemp");
 }


public  static void decreaseTemp ()
{
 System.out.println("start of decreaseTemp");
 
 if (isconnected== true ){
	if(currentTemp > minTemp)
	{
		 currentTemp= currentTemp-1;
		 System .out.println("the current Temperature is " +currentTemp);
	}
 else {
System.out.println("Min temperatureis reached");
}
 }else {
System.out.println(" ....turn on the AC first...");
}	
System.out.println("end of decreaseTemp");
}
}