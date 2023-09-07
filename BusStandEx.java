class BusStandEx {
    public static void main(String[] args) {
        BusStand busStand = new BusStand();
        busStand.setBusStandId(1);
        busStand.setBusStandName("Central Bus Stand");
        busStand.setBusStandAddress("jayanagar ");
        busStand.setLocationCode("CBS123");
        busStand.setManagerName("Akshatha");
        busStand.setNumberOfEmployees(1500);

        System.out.println("Bus Stand ID: " + busStand.getBusStandId());
        System.out.println("Bus Stand Name: " + busStand.getBusStandName());
        System.out.println("Bus Stand Address: " + busStand.getBusStandAddress());
        System.out.println("Location Code: " + busStand.getLocationCode());
        System.out.println("Manager Name: " + busStand.getManagerName());
        System.out.println("Number of Employees: " + busStand.getNumberOfEmployees());
    }
}