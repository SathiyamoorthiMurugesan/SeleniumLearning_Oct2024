package A1basicsOfJava;

public class A6VariableValues {

	static int b; // declare

	static int c = 20; // declare + initialize;

	static int x = 100;
	
	int yy = 20;
	
	int test = 20;

	public static void main(String[] args) {
		
		A6VariableValues myObject = new A6VariableValues();
//		myObject.method1();
//		myObject.
		
//		In this method, I want to use variable "dummy's" value from method2() 
		
//		System.out.println(dummy);

//		Two ways to bring out the local variable value, outside of that method
//		return type concept  - later 
//		By assigning local variable value to class level static or non static variables
		
		System.out.println(myObject.test); 
		
		myObject.method2(); //calling function/method
		
		System.out.println(myObject.test); 
		
	}
	
	public void method2() { //called function/method
		int dummy = 1000;
		test = dummy;
	}

	public void method1() {

		int a = 10; // declare and initialize

		System.out.println(a);

		a = 20;
		// Assign - assigning value a variable
		// = assigning operator

		System.out.println(a); // 20

//		a++;
		System.out.println(a++);
		a = a++;
		System.out.println(a);

		a = a + 2; // a = 21 + 2; 21 = 21 + 2;
		System.out.println(a);

//		-, /, %, <, >, !=, <>, 

		System.out.println(b);
		b = 30;
		System.out.println(b);

		System.out.println(c);
		c = 31;
		System.out.println(c);

		c = b; // c = 30;
		System.out.println(c);

		c = a;
		System.out.println(c);
		System.out.println(a);

		int y = 10;
		y = x;
		System.out.println(y); // 100
		System.out.println(x); // 100

	}

}
