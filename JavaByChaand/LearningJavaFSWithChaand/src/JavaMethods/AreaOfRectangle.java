package JavaMethods;

//if you remove the last rectangle part in line 6, and uncomment line 7 & 8, u get same result.

public class AreaOfRectangle {

	public static void main(String[] args) {
		System.out.println("Area of rectangle of length 5.4 and width 3.9 = " + rectangleArea(5.4, 3.9));
//		double area = rectangleArea(5.4, 3.9);
//		System.out.println(area);

	}

	public static double rectangleArea(double lenght, double width) {
		return (lenght * width);

	}

}
