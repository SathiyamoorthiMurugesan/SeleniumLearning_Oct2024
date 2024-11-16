package forLoopsInJava;

public class Debug {
	
	int a = 10;
	static int c = 30;
	
	public void method1() {
		int b = 10 +1; 
	}

	public static void main(String[] args) {
		
		Debug debug = new Debug();
		debug.method1();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == i) {
					System.out.print(j);
					break;
				} else
					System.out.print(" ");
			}
			System.out.println();

		}
	}

}
