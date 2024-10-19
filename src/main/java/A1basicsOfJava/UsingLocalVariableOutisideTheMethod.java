package A1basicsOfJava;

public class UsingLocalVariableOutisideTheMethod {
	
	int c = 10;

	public static void main(String[] args) {
		UsingLocalVariableOutisideTheMethod	obj = new UsingLocalVariableOutisideTheMethod();
		System.out.println(obj.getLocalVariableValueToOutside(100)+100);
		
		System.out.println(obj.c);
		
//		After below method "c" value is replaced by a local variable value. 
//		So, here after, "c" value is "100" only.
		
		obj.getLocalVariableValueToOutside1();
		
		System.out.println(obj.c);
		
		obj.usingLocalVariableFromAboveMethod();
		
	}
	
	public int getLocalVariableValueToOutside(int a) {
		int b = 20;
//		return a;
//		return 0;
//		return b;
		return b;
	}
	
	public void getLocalVariableValueToOutside1() {
		int aa = 100;
		c = aa;
	}
	
	public void usingLocalVariableFromAboveMethod() {
//		System.out.println(aa);
//		Now I can use the value of "aa" which is local value, in some other method
		System.out.println(c);
	}

}
