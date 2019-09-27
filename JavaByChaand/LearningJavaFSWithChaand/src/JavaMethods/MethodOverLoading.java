package JavaMethods;

public class MethodOverLoading {
	
	// method overloading is defined as methods with same name but different parameters. See example below.

	public static void main(String[] args) {
		System.out.println("Area of an object with length = 10 & width = 7.8 is equal to:- " + area(10, 7.8));
		// Or this can be accomplished by using below logic too.
	
		double area = area(10, 7.8);
		System.out.println(area);
		
		System.out.println("Area of square = " + area(4.0));
		
		System.out.println("Area of square = " + area(5)); // this will call below method with int value.
		

	}
	
	public static double area(double length, double width) {
		return(length*width);
	}
	
	public static double area(double side) {
		return side*side;
	}
	
	public static int area( int side) { // This is also a square but result will have no decimal point... it will show whole number.
		return side*side;
	}

}
