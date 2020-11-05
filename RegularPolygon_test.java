package eddu.smg;

public class RegularPolygon_test {

	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6,4);
		RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("P1: "+ p1.GetPerimeter()+ " S1: "+ p1.GetArea());
		System.out.println("P2: "+ p2.GetPerimeter()+ " S2: "+ p2.GetArea());
		System.out.println("P3: "+ p3.GetPerimeter()+ " S3: "+ p3.GetArea());
	}

}
