package eddu.smg;
import java.lang.Math;
public class RegularPolygon {
private int n=3;
private double sideLength=1;
private double x=0,y=0;
RegularPolygon(){
}
RegularPolygon(int n, double sideLenght){
	this.n=n;
	this.sideLength=sideLenght;
}
RegularPolygon(int n, double sideLenght,double x,double y){	
	this.n=n;
	this.sideLength=sideLenght;
	this.x=x;
	this.y=y;
}
public int getN() {
	return n;
}
public void setN(int n) {
	this.n=n;
}
public double getLength() {
	return sideLength;
}
public void setLength(double l) {
	sideLength=l;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x=x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y=y;
}
public double GetPerimeter() {
	double P;
	P=n*sideLength;
	return P;
}
public double GetArea() {
	double S;
	S=(n*sideLength*sideLength)/(4*(Math.tan(Math.PI/n)));
	return S;
}
}
