class Numbers{
public static void main (String arrays[])
{
	int numbers[]= {1,10,9,15,3};
	
	
	System.out.println("Original arrays:");
		System.out.println(numbers.length);
	for (int num=0; num<numbers.length;num++){
	System.out.println(numbers[num]);}
	
	System.out.println("reverse arrays:");
		
	for (int num=numbers.length-1;num>=0;num--){
	System.out.println(numbers[num]);}
	
	
}
}