package ifLoop;




//one plus 
//5
//5T
//6
//6T
//7
//7T
//10T pro
//25T 
//
//one plus - maker 
//all one plus phones - made
//
//int a ;
//tvs onePlus;
//for(phone eachOnePlusPhone: onePlus)
//
//for(tv eachOnePlusTV: onePlus)
//
//for(car eachMaruthiCar: Maruthi)
//
//studentNames 12thStdStudentList;
//
//for(studentName eachStudentName: 12thStdStudentList)
//
//for
//
//int a = 10;
//
//one+ phones = 5, 5t, 6, 6t,
//for(int a=1, a<, a++ ) {
//if(a==5) {
//do some action)
//}
//
//}
//
//for(one+ eachPhone: phones) {
//syso(eachPhone)
//}
//
//5
//5t
//
//
//maruthi cars;
//
//for(maruthi eachCar: cars)
//
//Lenovo laptop;
//for(Lenovo eachLaptop: laptop)
//syso(eachLaptop)
//if(eachLaptop == 2) {
//do some action}
//
//int temp = 0;
//Lenovo laptop;
//for(Lenovo eachLaptop: laptop) {
//do some actions
//if(temp ==5) {
//
//}
//temp++
//}
//
//syso(temp)


public class ForEach {

	public static void main(String[] args) {
		
		
	}
	
	public void forEachPractice() {

		int abc[] = new int[3];
		abc[0] = 10;
		abc[1] = 20;
		abc[2] = 30;
		
		System.out.println(abc[0]);
		System.out.println(abc[1]);
		System.out.println(abc[2]);
		
		String onePlus[] = { "5", "5T", "6", "6T", "10Pro" };

		// index - each value is present at a specific index. index of 5 is 0, index of
		// 10pro is 4;
		// length - total items in array. here it is 5;

//* We know the length of array here. But later, in java, many concepts will come where do not know the length. 
//		That time we can not use normal for loop. We could use forEach only.
//* 

		for (int i = 0; i < 5; i++) {
			System.out.println(onePlus[i]);
		}

		System.out.println("For each**********");
		for (String eachPhone : onePlus) {
			System.out.println(eachPhone);
		}

		int a[] = { 1, 2, 3, 4, 5 };

		for (int eachValue : a) {
			System.out.println(eachValue);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	
	}

}
