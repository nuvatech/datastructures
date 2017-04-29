package coursera;

public class SimpleLocation {
	public double lat;
	public double lon;
	
	public SimpleLocation(double lat, double lon) {
		this.lat=lat;
		this.lon=lon;
	}
	
	public static void main(String args[]) {
		SimpleLocation loc1 = new SimpleLocation(39.9, 116.4);
		SimpleLocation loc2 = new SimpleLocation(55.8, 37.6);
		
		System.out.println("loc1.lat=" + loc1.lat + " loc1.lon=" + loc1.lon);
		System.out.println("loc2.lat=" + loc2.lat + " loc2.lon=" + loc2.lon);
		System.out.println("loc1=" + loc1 + " loc2=" + loc2);

		
		loc1=loc2;
		loc1.lat=-8.3;
		System.out.println("loc1.lat=" + loc1.lat + " loc1.lon=" + loc1.lon);
		System.out.println("loc2.lat=" + loc2.lat + " loc2.lon=" + loc2.lon);
		System.out.println("loc1=" + loc1 + " loc2=" + loc2);
		
		loc2=loc1;
		System.out.println("loc1.lat=" + loc1.lat + " loc1.lon=" + loc1.lon);
		System.out.println("loc2.lat=" + loc2.lat + " loc2.lon=" + loc2.lon);	
		System.out.println("loc1=" + loc1 + " loc2=" + loc2);

	}
}
