package coursera;

public class ArrayLocationVarTest {
	private double coords[];
	double[] test;
	
	public ArrayLocationVarTest(double[] coords) {
		this.coords = coords;
	}
	
	public static void main(String[] args) {
		double[] coords = {10.2, 9.1};
		ArrayLocationVarTest accera = new ArrayLocationVarTest(coords);
		System.out.println("accera.coords[0]="+accera.coords[0]);
		System.out.println("accera.coords[1]="+accera.coords[1]);
		
		coords[0]=11.2;
		coords[1]=10.1;
		System.out.println("accera.coords[0]="+accera.coords[0]);
		System.out.println("accera.coords[1]="+accera.coords[1]);
	}
}
