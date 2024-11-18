package switchPractice;

//switch(intCondition) {
//case 1:
//	//content
//	//content
//case 2:
//	//diff content
//	//diff content
//case 3: 
//	//another diff content
//	//another diff content 
//
//}

public class SwitchPractice {

	public static void main(String[] args) {
		SwitchPractice obj = new SwitchPractice();
//		int a = 10;
//		obj.testSwitch("20");
//		obj.testSwithWithoutBreak(200);
//		obj.testSwithWithoutBreak(50);
//		obj.testSwithWithoutDefault(50);
//		obj.testSwitch(500);
		obj.testSwitch(20);
		
//		obj.testSwitch(null);
//		obj.testSwitch("");
//		obj.testSwitch("50");
		
//		obj.testSwitchWithString("a");
//		obj.testSwitchWithString("d");
//		obj.testSwitchWithString("A");

//		int atmNotes = 300;

	}
		public void usingIfCondition(int atmNotes) {
		if(atmNotes == 100) {
			
		}
		
		else if(atmNotes == 200) {
			
		}
		
		else if(atmNotes == 500) {
			
		}
		else {
			
		}
			
	}
	
	public void testSwitch(int atmNotes) {
		
//		int temp = atmNotes;
//		switch (temp) {
		switch (atmNotes) {
		case 100:
			System.out.println("Give 100");
			break;
		case 200:
			System.out.println("Give 200");
			break;
		case 500:
			System.out.println("Give 500");
			break;
		default: 
			System.out.println("Please enter 100 or 200 or 500");
		}
	}


	public void testSwitch(String value) {
		switch (value) {
		case "10": {
			method(100);
			break;}
		case "50":
			method(500);
			break;
		case "100":
			System.out.println("Go to hotel");
			break;
		default:
			System.out.println("Stay home");

		}
	}
	
	public void testSwitchWithString(String value) {
		
		if(value.equals("a") || value.equals("A")) {
			
		}
		
		if(value.equalsIgnoreCase("a")) {
			
		}
		
		switch (value.toLowerCase()) {
		case "a":
			System.out.println("100");
			break;
		case "A":
//			this case work same as case "a":
			System.out.println("100");
			break;
		case "b":
			System.out.println("200");
			break;
		case "c":
			System.out.println("300");
			break;
		default:
			System.out.println("0");

		}
	}
	
	public void testSwithWithoutBreak(int atmNotes) {
		switch (atmNotes) {
		case 100:
			System.out.println("Give 100");
		case 200:
			System.out.println("Give 200");
		case 500:
			System.out.println("Give 500");
		default: 
			System.out.println("Please enter 100 or 200 or 500");
		}
	}
	
	public void testSwithWithoutDefault(int atmNotes) {
		switch (atmNotes) {
		case 100:
			System.out.println("Give 100");
		case 200:
			System.out.println("Give 200");
		case 500:
			System.out.println("Give 500");
		}
	}

	public static void method(int val) {
		System.out.println(val);
	}

}
