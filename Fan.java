package eddu.smg;

public class Fan {
	public final int  SLOW=1,FAST=3,MEDIUM=2;
	private int speed=SLOW;
	private boolean switchedOn;
	private double radius =5;
	private String color = new String("Blue");
	
	Fan(){
	}
	
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed=speed;
}
public boolean getSwichedOn() {
	return switchedOn;
}
public void setSwitchedOn(boolean switchedOn) {
	this.switchedOn=switchedOn;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color=color;
}
public String toString() {
	if(switchedOn) {
		return" Speed: "+ speed + " Colour: " + color+ " Radius: "+ radius ;
	}
	else {
		return " Colour: " + color+ " Radius: "+ radius + " The fan is turned off. " ;	
	}
}
}
