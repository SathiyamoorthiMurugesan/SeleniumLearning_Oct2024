package packageX;

import packageA.Class10;

public class ClassA {

	public void methodAA() {

//		We are calling/using non static variable from Class10
//		So we need to create object for Class10

		Class10 obj = new Class10();

//		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d);

	}

	public static void methodAB() {

//			We are calling/using non static variable from Class10
//			So we need to create object for Class10

		Class10 obj = new Class10();

//		System.out.println(obj.a);
		System.out.println(obj.b);
//			System.out.println(obj.c);
//		System.out.println(obj.d)

	}
}
