// * When a variable or object is created inside a method, its belong to the method. No other method can use it.
// * So, whenever we have a method with return type, it does some work and give us something back
//		These methods or variable's visibility ends once the holding method get executed. In order to use the variable's 
//		value outside the method, we have return type concepts.
// * Whenever there is return type mentioned, at the end of method, we need to use "return" keyword, after that we should not be writing anything
//   		* means, return should be always at end of the methods 
// * Whenever we use a return type in a method, store method's returned value in a respective datatype and use that variable wherever we want to use the method.
// * Return type can be anything such as Interface, Class, primitive and non-premitive data type such as String and Array, Collections and Object too
// * Either we can directly use the method in some other method or we assign method's return type to respective variable
// * Return keyword can have exact return type or its variable name
//		* Parameters can be methods with return type too
// * If a method have return type, consider that method as that data type itself.
//		* means whatever calculation or manipulation we do on that data type, we can do it on the method

package A1basicsOfJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnDefinition {

	int valueNeededForMethod4andMethod5;
	static int aaa = 2000;

	public static void main(String[] args) {
		ReturnDefinition test = new ReturnDefinition();
		test.methodWithOutReturnType();

//		System.out.println(str);

		System.out.println();
		System.out.println(test.methodWithStringReturnType());
//		System.out.println("Sathya");

		String value = test.methodWithStringReturnType();
//		String value = "Sathya";

//		System.out.println(a + 10);
//		test.method1(100);
		System.out.println(test.method1(100) + 10);

		int ret = test.method3(10);
//		int ret = 100;
		System.out.println(ret);

//		int valueNeededForMethod4andMethod5 = test.method1(1);
		test.valueNeededForMethod4andMethod5 = test.method1(1);

		int xyz = 100;
		test.method6(0);
		test.method6(xyz);
		test.method6(test.valueNeededForMethod4andMethod5);
		test.method6(aaa);
		test.method6(test.method3(200));
		
		WebDriver driver = new ChromeDriver();

	}

	public void methodWithOutReturnType() {
		String str = "Sathya";
		System.out.println(str);
	}

	public String methodWithStringReturnType() {
		String str = "Sathya";
//		System.out.println(str);
		return str;
	}

	public String methodWithStringReturnType1() {
		String str = "Sathya";
//		System.out.println(str);
//		return null;
//		return "";
//		return "    ";
//		return "abc";
//		return "hello, I am return a String";
		return "testmail@gmail.com";
	}

	public int methodWithIntReturnType() {

		return 0;
	}

	public int method1(int a) {
		return a;
	}

	public String method2(int a) {
		return "Sathya";
	}

	public int method3(int a) {
		a = 100;
		return a;
	}

	public int method4(int a) {
//		int method4 we need value from method1.
//		method1(1);
		System.out.println(valueNeededForMethod4andMethod5);
		return a;
	}

	public int method5(int a) {
//		int method5 we need value from method1.
//		method1(1);
		System.out.println(valueNeededForMethod4andMethod5);

		return a;
	}

	public void method6(int abc) {
		System.out.println(abc);
	}

}

