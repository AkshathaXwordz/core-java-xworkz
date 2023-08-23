class Tv{
static boolean isconnected;
 static int minVolume ;
 static int maxVolume=100;
 static int currentVolume ;
 


public static boolean onOrOff(){
System.out.println("Inside onOrOff");


if(isconnected == false){
isconnected = true;
System.out.println(" Tv  is turned on ...");

}
else if (isconnected== true){
	
System.out.println(" Tv is turned off.....");
isconnected = false;
}
System.out.println("end of onOrOff");
return isconnected;
}

public  static void increaseVolume (){
 System.out.println("start of increaseVolume");
 
 if (isconnected== true ){
	if(currentVolume < maxVolume){
		 currentVolume= currentVolume+1;
		 System .out.println("the current Volume is " +currentVolume);
	}
else {
System.out.println("Max volume is reached");
}
 }else{
System.out.println("...turn on the Tv first...");
}
System.out.println("end of increaseVolume");
 }


public  static void decreaseVolume ()
{
 System.out.println("start of decreaseVolume");
 
 if (isconnected== true ){
	if(currentVolume > minVolume)
	{
		 currentVolume= currentVolume-1;
		 System .out.println("the current Volume is " +currentVolume);
	}
 else {
System.out.println("Min volume is reached");
}
 }else {
System.out.println(" ....turn on the Tv first...");
}	
System.out.println("end of decreaseVolume");
}
}