package forLoopsInJava;

public class ForEach {

//	Should be visited after array

//	public static void main(int a) {
//	public static void main(int[] a) {
	public static void main(String[] args) {

//		one plus - maker 
//		all one plus phones - made
		
//		OnePlus
//
//		Phone
//		5T
//		6
//		6T
//		7
//		7T
//		10
//		10T
//		10Pro
//
//		TV
//		TV01
//		TV02
//		TV03
//		TV04
//
//		Headset
//		Z1
//		Z2
//		Z3
//
//		OnePlus { Phone, TV, Headset}
//		OnePlus { {5T, 6, 6T}, {TV01, TV02. TV03, TV04} , {Z1,Z2,Z3} }
//
//		for(int i = 0; i<phone.length; i++) {
//		syso(phone[i]);
//		}
//
//		for(Phone each: Oneplus) {
//		syso(each);
//		}
//
//		for(TV eachTV: OnePlus) {
//		syso(eachTV)
//		}
//
//
//		TV01
//		TV02
//		TV03
//		TV04
//
//
//		for(Headset each: OnePlus) {
//		syso(each)
//		}
//		Z1
//		Z2
//		Z3
//
//		int a ;
//		tvs onePlus;
//		for(phone eachOnePlusPhone: onePlus)
//
//		for(tv eachOnePlusTV: onePlus)
//
//		for(car eachMaruthiCar: Maruthi)
//
//		studentNames 12thStdStudentList;
//
//		for(studentName eachStudentName: 12thStdStudentList)

		String onePlus[] = { "5", "5T", "6", "6T", "10Pro" };

		// index - each value is present at a specific index. index of 5 is 0, index of
		// 10pro is 4;
		// length - total items in array. here it is 5;

//* We know the length of array here. But later, in java, many concepts will come where do not know the length. 
//		That time we can not use normal for loop. We could use forEach only.
//* 

		for (int i = 0; i < onePlus.length; i++) {
			System.out.println(onePlus[i]);
		}

		System.out.println("For each**********");
		for (String eachPhone : onePlus) {
			System.out.println(eachPhone);
		}

		int a[] = { 1, 2, 3, 4, 5 }; // 1x5

		int b[] = {};

		for (int eachValue : a) {
			System.out.println(eachValue);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Difference between for and forloop using an example");
// 		We can not use for each loop for index based operation (we can use but we need to do a extra work)
//		To iterate array values in reverse order we can not use for each loop

//		To find whether the "a" array has a value 3.

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 3) {
				System.out.println("This array has value 3");
			}
		}
		
		for(int each: a) {
			if(each == 3) {
				System.out.println("This array has value 3");
			}
		}
		
//		Check whether value '3' present at index 3 of int array 'a'
		
		if(a[3] == 3) {
			System.out.println("Hi");
		}
		
		
	}

}
