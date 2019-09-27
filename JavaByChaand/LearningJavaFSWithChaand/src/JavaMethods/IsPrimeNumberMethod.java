package JavaMethods;

import JavaMethodsOnPrimeNumber.PrimeNumberCalculatar;

public class IsPrimeNumberMethod {

	public static void main(String[] args) {
		PrimeNumberCalculatar calculate = new PrimeNumberCalculatar();
		if(calculate.isPrime(17)) {
			System.out.println( "The number passed is Prime number");
		}else {
			System.out.println("The number passed is not a Prime number");
		}

	}
}
