class Netflix {

     static String englishMovies[]  = {"Avengers-End", "Titanic","Sceam6","OpenHimer","Spiderman","The King"};
	
	public static void main(String movies[]){
	System.out.println("Main started");
	
	System.out.println("the collection of movies are:");
	System.out.println(englishMovies.length);

for ( int dev=0; dev< englishMovies.length; dev++ ){
		System.out.println(englishMovies[dev]);
}


	
	System.out.println("the collection of movies in reverse order:");
	
for ( int dev=englishMovies.length-1 ;dev>=0; dev--){
		System.out.println(englishMovies[dev]);
}
	System.out.println("Main ended");
		
	}
}
	 