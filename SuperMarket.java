 class SuperMarket {
	 
	 static String chocolates[]={"cadberry","Dairymilk","perk","kitkat","toblerone","snickers","milkyWay","Ferrero","Hersheys","campco","Amul","toblerone","nestle","milkybar","Dark"};
	 static String biscuts[]=   { "good day","parleG", "oreo", "Britannia","sunfeast","patanjali", "cremica" ,"McVitie's","manaco","Happy Happy", "hide&seek","50-50","marie gold","Dark Fantasy","krack jack"};
	 static String soaps[]=     {"Lifebuoy","Cinthol","Dettol", "Lux,Liril","Dove","Pears","Medimix","Hamam","Margo","Patanjali","Himalaya","Nivea","Biotique Orange" ,"Tata Skye","santoor"};
	 static String snacks[]={ "lays" ,"kurkure","parle"," bingo","popcorn","maggi","kettle studio","pringles potato","balsnack ","lazy shoppy","chizzpa","whyfeyy","too yumm","balaji masala chips"};
	 static String fruits[]={ " mango","apple","orange","grapes","kiwi","pineapple","banana","papaya","watermelon","strawberry","cherry","dragon fruit","pomegranate","jackfruit","guava"};
	 static String vegetables[]={ "broccoli","carrot","tomato","beetroot","onion","cauliflower","lady's finger","cabbage","snakegourd","bittergourd","cucumber","brinjal","chilly","radish","potato "};
	 static String groceries[]={ " meat","bread&bakery","frozen foods", "pickles","pasta","oats","rice","wheat","honey"," cooking oil","vineger","tomato ketchup","dried fruits","almonds","cashews"};
	 static String icecreams[]={ "chocolate","vanilla","sorbet","butter pecan","caramel","cookies N'cream","strawberry","brown crunch","cotton candy","butterscotch","mango","black current","mint milk chocolate","cold modal ribbon","honey nut crunch "};
	 static String perfumes[]={ " chanel","coco mademoiselle","miss dior","davidoff","calvin klein","the body shop","guess","hugo boss","gucci","burberry","coach","nykaa","paco Rabanne","bvlgari","carolina herrera,"};
	 static String skincaresProducts[]={ " eye cream","aloevera gel", "cleanser","face wash","sunscreen","moisturiser","toner","bodyscurb","face scurb", "kajal","lipbam","serum","exfoliater","lipstick","foundation"};
	 
	 

public static void main (String market[]){
	System.out.println("main started");
	getchocolates();
		System.out.println("--------------------------------------------------------");
	getReversedchocolates();.,
	System.out.println("***************************************************************");
	getbiscuts();
		System.out.println("------------------------------------------------------------");
	getReversedbiscuts();
	System.out.println("*****************************************************************");
	getsoaps();
		System.out.println("-------------------------------------------------------------");
	getReversedsoaps();
	System.out.println("*****************************************************************");
	getsnackes();
		System.out.println("---------------------------------------------------------------");
	getReversedsnacks();
	System.out.println("*******************************************************************");
	getfruits();
		System.out.println("----------------------------------------------------------------");
	getReversedfruits();
	System.out.println("********************************************************************");
	getvegetables();
		System.out.println("-----------------------------------------------------------------");
	getReversedvegetables();
	System.out.println("*********************************************************************");
	getgroceries();
		System.out.println("------------------------------------------------------------------");
	getReversedgroceries();
	System.out.println("**********************************************************************");
	geticecreams();
		System.out.println("------------------------------------------------------------------");
	getReversedicecreams();
	System.out.println("**********************************************************************");
	getperfumes();
		System.out.println("------------------------------------------------------------------");
	getReversedperfumes();
	System.out.println("**********************************************************************");
	getskincareProducts();
		System.out.println("-------------------------------------------------------------------");
	getReversedskincareProducts();
		System.out.println("********************************************************************");
	System.out.println("main ended");
}


public static void getchocolates(){
	System.out.println("the chocolates available are: ");
	System.out.println(chocolates.length);

for ( int sup=0; sup<chocolates.length; sup++ ){
		System.out.println(chocolates[sup]);
}
}	
	public static void getReversedchocolates(){
	System.out.println("the reversed chocolates available are: ");
	System.out.println(chocolates.length);

for ( int  sup=chocolates.length -1; sup>=0;sup-- ){
		System.out.println(chocolates[sup]);
}
	}


public static void getbiscuts(){
	System.out.println("the biscuts available are: ");
	System.out.println(biscuts.length);

for ( int sup=0; sup<biscuts.length; sup++ ){
		System.out.println(biscuts[sup]);
}	
}
	public static void getReversedbiscuts(){
	System.out.println("the  reversed biscuts available are: ");
	System.out.println(biscuts.length);

for ( int  sup=biscuts.length -1; sup>=0;sup-- ){
		System.out.println(biscuts[sup]);
}
	}
	
	
public static void getsoaps(){
	System.out.println("the soaps available are: ");
	System.out.println(soaps.length);

for ( int sup=0; sup<soaps.length; sup++ ){
		System.out.println(soaps[sup]);
}	
}
	public static void getReversedsoaps(){
	System.out.println("the reversed soaps available are: ");
	System.out.println(soaps.length);

for ( int  sup=soaps.length -1; sup>=0;sup-- ){
		System.out.println(soaps[sup]);
}
	}
	
		
public static void getsnackes(){
	System.out.println("the snacks available are: ");
	System.out.println(snacks.length);

for ( int sup=0; sup<snacks.length; sup++ ){
		System.out.println(snacks[sup]);
}	
}
	public static void getReversedsnacks(){
	System.out.println("the reversed snacks available are: ");
	System.out.println(snacks.length);

for ( int  sup=snacks.length -1; sup>=0;sup-- ){
		System.out.println(soaps[sup]);
}
	}
	
	
		
public static void getfruits(){
	System.out.println("the fruits available are: ");
	System.out.println(fruits.length);

for ( int sup=0; sup<fruits.length; sup++ ){
		System.out.println(fruits[sup]);
}	
}
	public static void getReversedfruits(){
	System.out.println("the reversed fruits available are: ");
	System.out.println(fruits.length);

for ( int  sup=fruits.length -1; sup>=0;sup-- ){
		System.out.println(fruits[sup]);
}
	}


public static void getvegetables(){
	System.out.println("the vegetables available are: ");
	System.out.println(vegetables.length);

for ( int sup=0; sup<vegetables.length; sup++ ){
		System.out.println(vegetables[sup]);
}	
}
	public static void getReversedvegetables(){
	System.out.println("the  reversed vegetables available are: ");
	System.out.println(vegetables.length);

for ( int  sup=vegetables.length -1; sup>=0;sup-- ){
		System.out.println(vegetables[sup]);
}
	}	
	
	public static void getgroceries(){
	System.out.println("the groceries available are: ");
	System.out.println(groceries.length);

for ( int sup=0; sup<groceries.length; sup++ ){
		System.out.println(groceries[sup]);
}	
	}
	
	public static void getReversedgroceries(){
	System.out.println("the reversed  groceries available are: ");
	System.out.println(groceries.length);

for ( int  sup=groceries.length -1; sup>=0;sup-- ){
		System.out.println(groceries[sup]);
}
	}


public static void geticecreams(){
	System.out.println("the icecreams available are: ");
	System.out.println(icecreams.length);

for ( int sup=0; sup<icecreams.length; sup++ ){
		System.out.println(icecreams[sup]);
}	
}
	public static void getReversedicecreams(){
	System.out.println("the  reversed icecreams available are: ");
	System.out.println(icecreams.length);

for ( int  sup=fruits.length -1; sup>=0;sup-- ){
		System.out.println(icecreams[sup]);
}
	}


public static void getperfumes(){
	System.out.println("the perfumes available are: ");
	System.out.println(perfumes.length);

for ( int sup=0; sup<perfumes.length; sup++ ){
		System.out.println(perfumes[sup]);
}
}
	
	public static void getReversedperfumes(){
	System.out.println("the  reversed perfumes available are: ");
	System.out.println(perfumes.length);

for ( int  sup=perfumes.length -1; sup>=0;sup-- ){
		System.out.println(perfumes[sup]);
}
	}
public static void getskincareProducts(){
	System.out.println("the skincaresProducts available are: ");
	System.out.println(skincaresProducts.length);

for ( int sup=0; sup<skincaresProducts.length; sup++ ){
		System.out.println(skincaresProducts[sup]);
}	
}
	public static void getReversedskincareProducts(){
	System.out.println("the reversed skincaresProducts available are: ");
	System.out.println(skincaresProducts.length);

for ( int  sup=skincaresProducts.length -1; sup>=0;sup-- ){
		System.out.println(skincaresProducts[sup]);
}
	}
 }