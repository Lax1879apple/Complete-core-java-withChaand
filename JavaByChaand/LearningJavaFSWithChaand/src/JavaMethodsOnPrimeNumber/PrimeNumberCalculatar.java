package JavaMethodsOnPrimeNumber;

public class PrimeNumberCalculatar {
	
	public boolean isPrime(int num) {
		int temp;
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;		
	}
	
}
