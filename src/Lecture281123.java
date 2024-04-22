import java.util.Scanner;

public class Lecture281123 {

	public static void main(String[] args) {
		// void is like boolean but only 1 state "nothing" / 0 / void 
		
		int a, b, result;
		
		a = getUserInt("Type in a.");
		b = getUserInt("Now Type in b.");
		result = addiere(a,b);
		
		System.out.println(result);

	}
	
	
	
	
	// "Method" 
	// Private - just for this .java
	// Typ(int) Name(addiere) Parameterlist(int, int) 
	private static int addiere(int val1, int val2) {
		int result = val1 + val2;
		return result;
	}
	
	private static int getUserInt(String info) {
		Scanner in = new Scanner(System.in);
		System.out.println(info);
		
		while (!in.hasNextInt()) {
			System.err.println("Has to be a natural number.");
			in.next();
		}
		int input = in.nextInt();
		return input;
	}

}
