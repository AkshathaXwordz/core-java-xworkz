	class Volume {
static boolean isconnected;
 static int minLevel;
 static int maxLevel=5;
 static int currentLevel=1 ;
 


public static boolean onOrOff(){
System.out.println("Inside onOrOff");


if(isconnected == false){
isconnected = true;
System.out.println(" IronBox is turned on ...");

}
else if (isconnected== true){
	
System.out.println(" IronBox  is turned off.....");
isconnected = false;
}
System.out.println("end of onOrOff");
return isconnected;
}

public  static void increaseLevel (){
 System.out.println("start of increaseLevel");
 
 if (isconnected== true ){
	if(currentLevel < maxLevel){
		 currentLevel= currentLevel+1;
		 System .out.println("the current Level is " +currentLevel);
	}
else {
System.out.println("Max Level is reached");
}
 }else{
System.out.println(" ....turn on the IronBox first...");
}
System.out.println("end of increaseLevel");
 }


public  static void decreaseLevel ()
{
 System.out.println("start of decreaseLevel");
 
 if (isconnected== true ){
	if(currentLevel > minLevel)
	{
		 currentLevel= currentLevel-1;
		 System .out.println("the current Level is " +currentLevel);
	}
 else {
System.out.println("Min Level is reached");
}
 }else {
System.out.println(" ....turn on the Level first...");
}	
System.out.println("end of decreaseLevel");
}
}