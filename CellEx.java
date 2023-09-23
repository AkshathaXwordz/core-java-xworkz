class CellEx{
	
public static void main(String args[]){

Cell cell = new Cell();

cell.setBrand("Panasonic");
cell.setComposition("Alkaline");
cell.setVoltage("1.5 Volts");
cell.setWeight("0.62 Grams");


Watch battery =new Watch();
battery.watchCell= cell;

battery.usedFor =" watch ";
System.out.println(  "Brand - "+battery.watchCell.getBrand());
System.out.println( "this cell is mainly used in " +battery.usedFor );
System.out.println("composition - "+battery.watchCell.getComposition());
System.out.println("voltage - "+battery.watchCell.getVoltage());
System.out.println( "Weigth of cell - "+battery.watchCell.getWeight());

}
}
