class GasEx {
    public static void main(String[] args) {
       Gas gas=new Gas();
	   gas.setGasName("LPG");
	   gas.setVolume(14.2);
	   gas.setPrice(1200);
	   
	   Cylinder cylinder=new Cylinder();
	   cylinder.gas=gas;
	   cylinder.cylinderName="Bharath Gas";

        System.out.println("Cylinder Name: " +cylinder.cylinderName);
        System.out.println("Gas Type: " + cylinder.gas.getGasName());
        System.out.println("Gas Volume: " + cylinder.gas.getVolume()+ " liters");
		System.out.println("Gas price: " + cylinder.gas.getPrice());
    }
}