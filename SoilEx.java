class SoilEx {
    public static void main(String[] plantgrowth) {
        Soil soil = new Soil();
        soil.setSoilName("Red soil");
        soil.setMoistur("16.5-19.4%");
        soil.setMinerals("iron,aluminium");

        Plant plant = new Plant();
        plant.soil = soil;
        plant.plantName = "sugarcane";

        System.out.println("Plant Name: " + plant.plantName);
        System.out.println("Soil Name: " + plant.soil.getSoilName());
        System.out.println("Moisture: " + plant.soil.getMoistur());
        System.out.println("Minerals: " + plant.soil.getMinerals());
    }
}