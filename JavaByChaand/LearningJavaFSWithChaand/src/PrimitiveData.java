
public class PrimitiveData {
 //  all discussed here are primitie data types.
	public static void main(String[] args) {
		int intgr = 10; // only accepts whole numbers
		int maxValue = 2147483647;
		int minValue = -2147483648;
		short minShort = 32767;
		short maxShort = -32768;
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		byte maxByte =127;
		byte minByte =-128;
		float floatValue = 9f;
		double doubleValue = 9d;
		
		boolean var =  true;
		
		// For character, unicode can be used.
		char character = 'g'; // character variable, must be in a single coats.
		char character1 = '\u00A5';
		char Char2 = '\u01C6';
		
		System.out.println("This is the interger value = " + intgr);
		System.out.println("This is the maximum interger value = " + maxValue);
		System.out.println("This is the minimum interger value = " + minValue);
		System.out.println("Boolean value = " + var);
		System.out.println("Character1 = "+ character1);
		System.out.println("Char2 is = "+ Char2);
	}
	

}
