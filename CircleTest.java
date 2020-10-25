package eddu.smg;

public class Circle_test {
	public static void main(String[] args) {
		Circle circle1 =new Circle();
		
		System.out.println("Radius: "+ circle1.getRadius() + " Area: "+ circle1.GetArea() );
		circle1.setRadius(3);
		System.out.println("Radius: "+ circle1.getRadius() + " Area: "+ circle1.GetArea() );
		Circle circle2 = new Circle(25);
		System.out.println("Radius: "+ circle2.getRadius() + " Area: "+ circle2.GetArea() );
		
		Circle circle3 =new Circle(125);
		System.out.println("Radius: "+ circle3.getRadius() + " Area: "+ circle3.GetArea() );
	
		circle2.setNewR(100);
		System.out.println("Radius: "+ circle2.getRadius() + " Area: "+ circle2.GetArea()+ "Perimeter: " + circle2.getP() );
	}
	
}
