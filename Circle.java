package eddu.smg;
import java. lang. Math;
public class Circle {
public double radius =1;
Circle(){
}
Circle(double NewRadius){
	radius = NewRadius;
}
public double GetArea(){
	return radius*radius*Math.PI;
}
public double getP(){
	return 2*radius*Math.PI;
}
public void setNewR(double NewRadius){
	radius = NewRadius;
}
}
