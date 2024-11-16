package forLoopsInJava;

//for(initialize; condition; increment/decrement) {
//content
//}
//
//for(initialize; condition;) {
//	**content*****
//increment/decrement;
//}

public class ForLoopBasic {

	static int amt;
	static int val = 1;

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {
//			System.out.println(a);
			System.out.print(a);
//			System.out.println();
		}
//		
//		for (int a = 1; a <= 10; a++) {
//			if(a % 2 != 0)
//			System.out.println(a);
//		}
//		
//		for (int a = 1; a <= 10; ) {
//			System.out.println(a);
//			a = a+2;
//		}
//		
//		for (int a = 1; a <= 10; a++) {
//			System.out.println(a);
//		}
		
//		System.out.println("hello");
//
//		for (int a = 26; a < 31;) {
//			System.out.println(a);
//			a++;
//			System.out.println("Hello");
//		}
////		System.out.println(a);
//
//		method1();
//		method1();
//		method1();
//		method1();
//		method1();
//
//		for (int i = 1; i <= 5; i++) {
//			method1();
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			int a = 20;
//			System.out.println(a);
//		}
//
//		int s = 1;
//		int s;
//		for (s = 2; s <= 10; s++) {
//			
//		}
//		System.out.println(s);
//
//		for (amt = 10; amt < 0; amt++) {
//
//		}
//
//		for (val < 10; val++) {
//		for (;val < 10; val++) {
//
//		}
//
//		int i;
//		for (i = 1; i <= 5; i++) {
//			System.out.println(i);
//			i++;
////			break;
//			if(true) {
////				some content
//				break;
//			}
////			System.out.println("Hello");
//		}
//		System.out.println(i);
//
//		s++ is nothing but s = s+1;
//		s+2 is nothing but s = s+2;
//		int s;
//		for (s = 1; s <= 10; s++) {
//			
//		}
//
//		int s;
//		for (s = 1; s <= 10; s++) {
//			System.out.println(s);
//		}
//
//		for (int a = 1; a <= 10; a++) {
//			if (a < 5) {
//				System.out.println("Hello");
//				break;
////				System.out.println("Hello");
//			}
//			System.out.println(a + "&&&&&&");
//			break;
////			System.out.println(a + "&&&&&&");
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			int a = 10;
////			int j;
//			int c;
//			for (int j = 100; j <= 105; j++) {
////				int b = 20;
////				c = 30;
//				System.out.println(i);
//				System.out.println("***********" + j);
//			}
////			System.out.println(j);
////			System.out.println(b);
////			System.out.println(c);
//
//		}
//
//		for (int i = 1; i <= 5; i++) {
//		System.out.println(i);
//		for (int j = 1; j <= 5; j++) {
//			System.out.println("***********"+j);
//		}
//	}
//
//		for (int i = 1; i <= 5; i++) {
//		System.out.println(i);
//		for (int j = 1; j <= 5; j++) {
//			break;
//		}
//	}
//
		for (int i = 1; i <= 5; i++) {
		System.out.println(i);
		for (int j = 1; j <= 5; j++) {
			System.out.println("*******"+j);
			continue;
//			System.out.println("Hello");
		}
	}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.println("***********" + j);
//			}
//			System.out.println(i);
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j <= 5; j++) {
//				System.out.println("***********" + j);
//			}
//			System.out.println(i);
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.println("***********" + j);
//			}
//			System.out.println(i);
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("1");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("1");
//				System.out.print(i);
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j <= 5; j++) {
//				for (int j = 5; j >= i; j--) {
//				System.out.print("1");
//				System.out.print(i);
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		int temp = 5;
//		for (int a = 1; a <= 10; a++) {
//			if (a > temp) {
//				break;
//			}
//			System.out.println(a + "&&&&&&");
//		}
//		
//		int a1 = 19;
//		int prime = 1;
//		for(int i = 2; i<a1; i++) {
//			if(a1%i == 0) {
//				System.out.println(a1 +" is not prime number");
//				prime++;
//				break;
//			}
//		}
//		if(prime==1)
//		System.out.println(a1 + " is prime number");
//
//	
//	int val = 29;
//	int temp = 0; // flag or indicator
//	System.out.println("PRIME NUMBER CHECK*********");
//	for (int a = 2; a < val - 1; a++) {
//		if (val % a == 0) {
//			temp++;
//			System.out.println(val + " is not prime number");
//			break;
//		}
//	}
//	if (temp != 1)
//		System.out.println(val + " is prime number");
//
}

	public static void method1() {
		System.out.println("I am method1");
	}
//
//	public void method2() {
//
////		for (int i = 1; i <= 5; i++) {
////			System.out.println(i);
////			for (int j = i; j <= i; j++) {
////				int a = 10;
////				i = 30;
////				System.out.println("***********" + j);
////			}
////			System.out.println(a);
////		}
//
//
////		for (int i = 1; i <= 5; i++) {
////			System.out.println(i);
////			for (int j = 1; j <= 5; j++) {
////				System.out.println("***********" + j);
////				if (1 == 1) {
////					break;
////				}
////			}
////		}
//
////		for (int i = 1; i <= 5; i++) {
////			for (int j = 1; j <= 5; j++) {
////				System.out.print( j+" ");
////			}
////			System.out.println();
////		}
//
//
//
//	}

}




/*
1 1 2 3
2 1 2 3 
3 1 2 3
4 1 2 3
5 1 2 3 

1
2
3
4
5

123123123

123
123
123

1 2 3 
1 2 3 
1 2 3


1 
2
3
4
5
6
7
8


for(condition) {

do some work;

do small work1
do small work2 
do small work3
}

for(condition) {

	for(condition) {
		small work 400 times
		break;

	}
}



12345
12345
12345
12345


for(int i =1; i<=4; i++){
  int a = 10;
    for (int j = 1; j<=60; j++){
int b = 20;
	if(j<=3) {
sysout(a);
    System.out.print(j);
break;
}	
    
    }
sysout(b);
 Sysem.out.println()
}

12345
12345
12345

123
123
123
123


1
1


1111
2222
3333
4444


for(int i =0; i<4; i++){
    for (int j = 1; j<=4; j++){
    System.out.print(i);
    
    }
 Sysem.out.println()
}

1111
2222

1
12
123
1234
12345

for(int i =1; i<=5; i++){
    for (int j = 1; j<=5; j++){
	if(j==i) {
    System.out.print(*);
	break;
    }
else 
	System.out.print(" ");
}
 Sysem.out.println()

}

12
12
12
12
12


1
 2
  3
   4
    5


*
**
***
****
*****


1
1
1
1
1


for(condition)

sysout(1)
syso new line

}

for(condition)

	for(condotion)
	syso(j)
continue;

}



12345
12345
12345

12345


for(condition) {

if(i == 4) {
println();
	continue;
}
	for(condition) {
	sysout(j)

}
println();
}


12345
12
12345
12345
12345

public void metho1() {

int temp; 
boolean b;
for(int i = 1; i<=10; i++ ) {
int temp = 0;

	for(int j = 1; j<=10; j++ ) {

if(name == karthi) {
temp = 1;
b = true;
 break;
}

        }
if(temp == 1|| b == true) {
break;
}
            }

syso(temp);

}


*/