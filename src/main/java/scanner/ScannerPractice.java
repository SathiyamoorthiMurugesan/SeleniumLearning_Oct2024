package scanner;

import java.io.PrintStream;
import java.util.Scanner;

public class ScannerPractice {

	static PrintStream obj;

	public static void main(String[] args) {
		ScannerPractice scan = new ScannerPractice();
//		scan.scannerBasic();

		Scanner sc = new Scanner(System.in);

//		System.out.println("Please enter a number");
//		sc.nextInt();

//		System.out.println("Please enter 5 numbers");
//		sc.nextInt();
//		sc.nextInt();
//		sc.nextInt();
//		sc.nextInt();
//		sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Please enter " + i + " numbers");
			int a = sc.nextInt();
			if (a > 5) {
				System.out.println("This number is greater than 5");
			} else if (a < 5)
				System.out.println("This number is less than 5");
			else
				System.out.println("This number is equal to 5");
			System.out.println();
		}
		
	}
	

	public void scannerBasic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a two digit number: ");
		int a = sc.nextInt();
		if (a < 10) {
			System.out.println("You have entered single digit number, please enter two digit number");
		} else if (a >= 100) {
			System.out.println("Please enter two digit only");
		} else
			System.out.println("Good");

		System.out.print("Enter enter your name : ");
		sc.next();
	}
	

}
