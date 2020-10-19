package eddu.smg;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle1 =new Circle();
		System.out.println("Radius: "+ circle1.radius + "Area: "+ circle1.GetArea() );

		Circle circle2 = new Circle(25);
		System.out.println("Radius: "+ circle2.radius + "Area: "+ circle2.GetArea() );
		
		Circle circle3 =new Circle(125);
		System.out.println("Radius: "+ circle3.radius + "Area: "+ circle3.GetArea() );
	
		circle2.setNewR(100);
		System.out.println("Radius: "+ circle2.radius + "Area: "+ circle2.GetArea()+ "Perimeter: " + circle2.getP() );
	}

}
