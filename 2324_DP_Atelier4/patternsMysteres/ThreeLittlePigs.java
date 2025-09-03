package patternsMysteres;
/*
 * Inspiration ?
 */

public class ThreeLittlePigs {
	public static void main(String[] args) {		
		House house1 = new StrawHouse();
		House house2 = new WoodenHouse();
		System.out.println("\nConstruction 1ère maison");
		house1.buildHouse();
		System.out.println("\nConstruction 2ème maison");
		house2.buildHouse();
	}
}
interface House{
	public void buildHouse();
}
 abstract class PigHouse implements House{
	public final void buildHouse(){
		buildRoof();
		buildWalls();
		buildWindows();
		System.out.println("La maison est construite");
	}
	private void buildWindows() {
		System.out.println("Les fenêtres sont en verre");
	}
	protected abstract void buildWalls();
	protected abstract void buildRoof();
}
 class StrawHouse extends PigHouse {
	 protected void buildWalls() {
		System.out.println("Les murs sont en paille");
	}
	 protected void buildRoof() {
		System.out.println("Le toit est en paille");
	}
}
 class WoodenHouse extends PigHouse {
	 protected void buildWalls() {
		System.out.println("Les murs sont en bois");
	}
	protected void buildRoof() {
		System.out.println("Le toit est en bois");
	}
}
