package A1basicsOfJava;

/*
 * dfsfsd
 * fsdfs
 * 
 * fsfsf
 * fsd
 */

//fdjhsfjhs

//fksdfjdsk
//fsdkfjs
//eriwuiw

/*
ewiuruwodkls
dskjajdaj
mnxmcnmx
*/

public class VariablesInJava {


	int b = 10; // classLevel variable or instance variable or non-static variable;

	static int c = 20; // static variable/class level variable

//	final int d;

	VariablesInJava nonStaticObject = new VariablesInJava();
	static VariablesInJava staticObject = new VariablesInJava();

	public static void main(String[] args) {
		int a = 10; // local variable
		VariablesInJava ObName = new VariablesInJava(); // local variable

//		static int d = 10;

		System.out.println(a);

//		System.out.println(b);

		System.out.println(ObName.b);

		System.out.println(c);

		int b = 20;

		int c = 30;

		System.out.println(b);
		System.out.println(ObName.b);
//		System.out.println(nonStaticObject.b);
		System.out.println(staticObject.b);

		System.out.println(c);

		System.out.println(VariablesInJava.c);

//		System.out.println(this.c);

//		method2();

		ObName.method1();

		method2();
	}

	public void method1() {
		int a = 10; // local varibale
		VariablesInJava ObName = new VariablesInJava(); // local variable

//		static int d = 10;

		System.out.println(a);

//		System.out.println(b);
		System.out.println(ObName.b);
		System.out.println(nonStaticObject.b);
		System.out.println(staticObject.b);

		System.out.println(c);

	}

	public static void method2() {
		int a = 10;

		VariablesInJava ObName = new VariablesInJava();

		ObName.method1();
	}

	public void method3() {

		method1();

		VariablesInJava ObName = new VariablesInJava();
		ObName.method1();
	}

}
