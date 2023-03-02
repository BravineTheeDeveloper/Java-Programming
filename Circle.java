public class Circle{
	double radius;
	Circle() {
		radius = 10.0;
	}
	Circle(double r) {
		radius = r;
	}
	double findArea (){
		return Math.PI*Math.pow(radius,2);
	}
	public static void main(String [] args){
		Circle myCircle1 = new Circle();
		Circle myCircle2 = new Circle(5.0);
		System.out.println("The circle one area is: " +
		myCircle1. findArea());
		System.out.println("The circle two area is: " +
		myCircle2. findArea());
	}
}
