package forLoopsInJava;

public class TryForLoop {

//	https://www.edureka.co/blog/30-pattern-programs-in-java/

	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void forLoop1() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				int a = 0;
				if (i >= j) {
					a = 1;
					System.out.print(j + " ");
				} else {
					break;
				}

			}

			System.out.println();
		}

	}

	public void forLoop2() {

		for (int i = 5; i > 0; i--) {

			for (int j = 5; j > 0; j--) {

				if (i >= j) {
					System.out.print(j + "");
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
