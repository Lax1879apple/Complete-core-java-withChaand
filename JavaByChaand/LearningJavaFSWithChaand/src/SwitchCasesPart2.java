
public class SwitchCasesPart2 {

	public static void main(String[] args) {
		char x = 'A'; // switch case or statement will not accept float value.
		String author = "Arjun";
		
		switch (x) {
		case 'a':
			System.out.println("The character is: " + x);
			break;

		case 'b':
			System.out.println("The character is: " + x);
			break;

		case 'c':
			System.out.println("The character is: " + x);
			break;

		default:
			System.out.println("The character is other than a, b, or c ");
			
			
			
			switch(author.toUpperCase()) {
			case "arjun":
				System.out.println("The author is "+ author);
				break;
			case "Ram":
				System.out.println("The author is " + author);
				
			case "Maya":
				System.out.println("The author is "+ author);
				
			default:
				System.out.println("The author name did not match");
			}
		}

	}

}
