package packageX;

import packageA.Class10;

public class ClassB10 extends Class10 {

	public void methodBA() {

//		We are calling/using non static variable from Class10
//		So we need to create object for Class10

		Class10 obj = new Class10();

//		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d);
		
//		&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
//		Since ClassB10 follows Class10, 
//			ClassB10 can use variables/methods of Class10 directly.
//			No need to create object
//		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
		System.out.println(d);

	}

	public static void methodBB() {

//			We are calling/using non static variable from Class10
//			So we need to create object for Class10

		Class10 obj = new Class10();

//		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d)

	}

}
