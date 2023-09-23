class PassengersEx{
	public static void main(String[] travel){
		Passengers passengers=new Passengers();
		passengers.setPassengerId(1233267);
		passengers.setPassengerName("Akshatha HV");
		passengers.setStartingPoint("Bengaluru");
		passengers.setDestination("Davangere");
		
		Train train= new Train();
		train.passengers=passengers;
		train.trainName="indian express";
		
		System.out.println("Train Name : "+train.trainName);
		System.out.println("Passengers Id : "+train.passengers.getPassengerId());
		System.out.println("Passengers Name : "+train.passengers.getPassengerName());
		System.out.println("Passengers Startig Point : "+train.passengers.getStartingPoint());
		System.out.println("Passengers Destination : "+train.passengers.getDestination());
		
	}
}