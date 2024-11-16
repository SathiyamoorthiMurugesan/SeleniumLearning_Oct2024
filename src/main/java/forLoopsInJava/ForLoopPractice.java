package forLoopsInJava;

public class ForLoopPractice {

//	For loop

//	Nested for loop
//		* parent loop - it controls your row
//		* child  for loop - it controls your column
//	break;
//	flag/count
//	println() or print('dkajs');
//	inner loop's initiation and condition
//	managing printing spaces

	public static void main(String[] args) {
		
		starLadderPattern(5);
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = i; j <= i; j++) {
//				System.out.print(i + " ");
//			}
//
//			System.out.println();
//		}
		
	}
		
		
		public void method1() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				if (i == 4 && j == 3)
					System.out.print("0 ");
				else
					System.out.print(i + " ");
			}

			System.out.println();
		}

	}

	public void latterPatternWithNumber() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}

	}

	public void starLadderPattern() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
//				if(i==j)
//				break;
			}

			System.out.println();
		}

	}
	
	public static void starLadderPattern(int k) {
		for (int i = 1; i <= k; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
//				if(i==j)
//				break;
			}

			System.out.println();
		}

	}
}

//******

//*
//**
//***
//****
//*****

//*****
//*****
//*****
//*****
//*****

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

//1
//2 2
//3 3 3 
//4 4 4 4 
//5 5 5 5 5
