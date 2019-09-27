package JavaMethods;

public class Method1 {

	public static void main(String[] args) {
		
		loop(1, 10);
		System.out.println("********");
		loop(20, 40);
		
	}
	
/*	public static void loop1(int firstNum ){
//		int x = 1;  instead of using variable here which is commented, we are initializing it by passing it as parameter. 
		while(firstNum <= 10) {
			System.out.println(firstNum);
			firstNum++;
		}
		
	}
	
	public static void loop2(int secondNum) {
		// int j = 20; we are doing the same thing here as mentioned in line 14. 
		while(secondNum <= 40) {
			System.out.println(secondNum);
			secondNum++;
		}
	} */
	// now lets execute the same code using same logic by using one method only. 
	
	public static void loop(int firstNum, int secondNum) {
		while(firstNum <= secondNum) {
			System.out.println(firstNum);
			firstNum ++;
		}
	}
}
