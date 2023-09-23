class ApplicationEx{
	
public static void main(String apps[]){

Application app = new Application();

app.setName("phonepe");
app.setsizeInMb(4.3);
app.setversion("5th version");
app.setrating("5 stars");
app.setnoOfDownloads("1 million");
app.setcompanyName("phonepe");

PlayStore store =new PlayStore();
store.application= app;

store.manegedBy ="google";
System.out.println( "Playstore is maneged by " +store.manegedBy );
System.out.println(store.application.getName());
System.out.println(store.application.getsizeInMb());
System.out.println(store.application.getversion());
System.out.println(store.application.getrating());
System.out.println(store.application.getnoOfDownloads());
System.out.println(store.application.getcompanyName());
}
}