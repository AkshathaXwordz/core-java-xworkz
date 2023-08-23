class Speaker {


static boolean isconnected;
 static int minVOlume;
 static int maxVolume=6;
 static int currentVolume=6 ;

public static boolean onOrOff(){
System.out.println("Inside onOrOff");


if(isconnected == false){
isconnected = true;
System.out.println(" speaker  is turned on ...");

}
else if (isconnected== true){
	
System.out.println(" speaker  is turned off.....");
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
 }
else{
System.out.println("GUbe ....turn on the speaker first...");
}	
System.out.println("end  of increaseVolume");
 
}








}
