package ifLoop;

//1) single if - if(condition) { }
//2) if else 
//3) if, else if, else if, else
//4) if, if, if
//5) if(condition1 || condition2 || condition3) 
//6) if(condition1&&condition2&&condition3)
//7) if (condition1)
//		content
//		if (condition2)
//			content

//* if is to check conditions. If always going to return us boolean. 
//* = is assigning operator 
//* == is validating operator
//* if we do not add { after if, only the line which is immediate to if condition is belongs to if.

/*
 * +
 * -
 * >
 * <
 * 
 */

public class IfPractice {

	public static void main(String[] args) {

		int a = 12;

		// verify a is even

		if (a % 2 == 0) {
			System.out.println(a + " is even number");
			System.out.println("hello");
			System.out.println(a);

			System.out.println("Hello");
			System.out.println("Hi");
			System.out.println("Hello Hi");
			System.out.println("Hello" + "Hi");

//			My name is "Sathya"

			System.out.println("My name is \"Sathya\"");
		}

		// verify a is even or odd
//		if(a % 2 != 0)

		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		}

		else
			System.out.println(a + " is odd number");

		// verify a number is divisible by 2 and then 3

//		a = 12, a = 8, a = 9, a = 7;
		if (a % 2 == 0) {
			System.out.println(a + " is divisible by 2");

			if (a % 3 == 0) {
				System.out.println(a + "is divisibled by 3");
			}
		}
		// verify a number is divisible by 2 or then 3 or neither

		if (a % 2 == 0) {
			System.out.println(a + " is divisible by 2");
		}

		else if (a % 3 == 0) {
			System.out.println(a + " is divisible by 3");
		} else
			System.out.println(a + " is neither divisible by 2 or 3");

		
		
		// verify a number is divisible by both 2 and 3
		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println(a + " is divisible by 2 and 3");
		}

		

		// NESTED IF AND IF ELSE

		if (true) {
			// content
			int bb = 10;
			if (false) {
				System.out.println();
				int cc = 20;
			} else if (true)
				System.out.println();
			else
				System.out.println("");
		}
		else {
			System.out.println("");
		}
		

		if (a % 2 == 0) {
			System.out.println(a + " is divisible by 2");

			if (a % 3 == 0) {
				System.out.println(a + " is divisible by 3");
				// content
			}
		}

		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println(a + " is divisible by 2 and 3");
		}

		if (a % 2 == 0 || a % 3 == 0) {
			System.out.println(a + " is either divisible by 2 or 3");
		}

		if (method1() % 2 == 0) {
			System.out.println("***");
		}
		
		if(a % 2 == 0) {
			int k = a % 2;
			System.out.println("its odd");
		}
		
		
		if(method2()) { 
			
		}
		
		boolean abc = true;
		if(abc) {
			
		}

	}

	public static int method1() {
		int a = 10;
		return a;
	}
	
	public static boolean method2() {
		return true;
	}

}
