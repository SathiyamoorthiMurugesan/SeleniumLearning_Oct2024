package forLoopsInJava;

public class ForLoopCheck {

	static int number;

	public static void main(String[] args) {
//		method1();
//		method1();
//		method1();
//		method1();
//		method1();

//		for(int i = 1; i<=5; i++) {
//			System.out.println(i);
//			method1();
//		}
//		System.out.println(i);

//		int i;
//		for (i = 1; i <= 5; i++) {
////			System.out.println(i);
////			method1();
//		}
//		System.out.println(i);
//
//		for (number = 1; number <= 5; number++) {
//			method1();
//		}
//
//		
//		for (number = 65; number <70; number++) {
//			method1();
//		}
//		
//		for (number = 0; number <5; number++) {
//			method1();
//		}

//		for (number = 65; number >60; number--) {
//			method1();
//		}

		for (int i = 1; i <= 5; i++) {
			method1();
			for (int j = 1; j <= 5; j++) {
				method2();
			}
		}

	}

	public static void method1() {
		System.out.println("Hii");
	}

	public static void method2() {
		System.out.println("Hello");
	}

}
