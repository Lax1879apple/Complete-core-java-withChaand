
public class SumOfDigits {

	public static void main(String[] args) {
		int value = 34678;
		int sumOfDigit = 0;

		while (true) {
			sumOfDigit = sumOfDigit + value % 10; // 0 +8, 8+7
			value = value / 10;
			if (value < 10) {
				break;

			}

		}
		sumOfDigit = sumOfDigit + value;
		System.out.println("Sum of digits is = " + sumOfDigit);

	}

}
