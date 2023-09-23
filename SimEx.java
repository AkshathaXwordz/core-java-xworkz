class SimEx {
    public static void main(String[] args) {
        Sim sim = new Sim();
        sim.setSimName("jio");
        sim.setNumber(8431347478L);
        sim.setDatapack("4GB 299 rs");
        sim.setPrice(300);

        CellPhone cellPhone = new CellPhone();
        cellPhone.sim = sim;
        cellPhone.cellphoneName = "Mi  note * pro";

        System.out.println("Cellphone Name: " + cellPhone.cellphoneName);
        System.out.println("SIM Name: " + cellPhone.sim.getSimName());
        System.out.println("SIM Number: " + cellPhone.sim.getNumber());
        System.out.println("Data Pack: " + cellPhone.sim.getDatapack());
        System.out.println("Price: " + cellPhone.sim.getPrice());
    }
}