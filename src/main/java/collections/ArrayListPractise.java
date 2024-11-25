//		List<Integer> list1 = new ArrayList<Integer>(); //Generic ArrayList, we can only add Integer
//		ArrayList<Integer> AI = new ArrayList<Integer>();
//		ArrayList<String> AS = new ArrayList<String>(10); //Generic ArrayList, we can only add String
//		ArrayList<String> AS1 = new ArrayList<String>(AS);

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ArrayListPractise {
	
static boolean s;
static Integer i;
static int a2;

	public static void ALMethods()	{
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		System.out.println("***To add the element into List***");
		list.add(1);
		list.add(2);
		list.add(3);
//		list.add("Sathya");
		System.out.println(list);
		
		System.out.println("*** Adding another set of elements into ArrayList*** ");
		ArrayList<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(6);
		System.out.println(a);
		
		System.out.println("*** Add another element 5 specific to index into AL*** ");
		a.add(1, 5);
		System.out.println(a);
		
		System.out.println("*** Add list of collection items to another list  ***");
		list.addAll(a);
		System.out.println(list);
		
		System.out.println("*** Find arraylist contains specific element and returns boolean value ***");
		s=a.contains(0);
		System.out.println(s);
		
		 s=a.contains(6);
		 System.out.println(s);
		 
		 System.out.println("*** Find arraylist contains all specific element and returns boolean value ***");
		 s=a.containsAll(list);
		 System.out.println(s);
		 
		 System.out.println("***Second collection*** ");
//		 ArrayList<Integer> a1 = new ArrayList<>(3);
		 ArrayList<Integer> a1 = new ArrayList<>();
		 a1.add(1);
		 a1.add(2);
		 a1.add(3);
		 a1.add(4);
		 a1.add(5);
		 
		 System.out.println(a1);
		 
		 System.out.println("***Checking presence of collection element in another collection***");
		 s=list.containsAll(a1);
		 System.out.println(s);
		 
		 System.out.println("***Adding more eleemnents to check for false condition***");
		 a1.add(6);
		 a1.add(7);
		 a1.add(8);
		 s=list.containsAll(a1);
		 System.out.println(s);
		 
		 System.out.println("*** To increase the  city of Arraylist ***");
		 a1.ensureCapacity(10);
		 a1.add(9);
		 a1.add(10);
		 a1.add(11);
		 a1.add(12);
		 System.out.println(a1);
		 
		 System.out.println("*** To finds two arrays are equal and returns false as return type ***");
		 s=a1.equals(list);
		 System.out.println(s);
		 
		 list.add(7);
		 list.add(8);
		 list.add(9);
		 list.add(10);
		 list.add(11);
		 list.add(12);
		 System.out.println(list);
		 
		 System.out.println("*** To finds two arrays are equal and returns true as return type ***");
		 s=a1.equals(list);
		 System.out.println(s);
		 
		 System.out.println("*** To fetch the element from Arraylist using Index ***");
		i=a1.get(11);
		System.out.println(i);
		
		System.out.println("*** Returns the runtime class of this Object ***");
		Class c=a1.getClass();
		System.out.println(c);
		
		System.out.println("*** Returns hash code for the Arraylist ***");
		a2=a1.hashCode();
		System.out.println(a2);
		
		System.out.println("*** Returns index of first occurance of an eleemnt in the array ***");
		a.add(1);
		a2=a1.indexOf(1);
		System.out.println(a2);
		
		System.out.println("*** Returns true if there is no elements and false if list contains value ***");
		s=a1.isEmpty();
		System.out.println(s);
		
		s=list1.isEmpty();
		System.out.println(s);
		
		System.out.println("*** Iterating through AL**");
		
		Iterator<Integer> it=a1.iterator();
		
		System.out.println("*** Next() Returns element present in the AL**");
		i=it.next();
		System.out.println(i);
		i=it.next();
		System.out.println(i);
		
//		System.out.println("*** Throws no element present exception ***");
		Iterator<Integer> it1=list1.iterator();
//		i=it1.next();
//		System.out.println(i);
		
		System.out.println("*** hasNext() Returns BOOLEAN true if present elements are in the AL**");
		s=it.hasNext();
		System.out.println(s);
		
		System.out.println("*** hasNext() Returns BOOLEAN false if no element present "
				+ "in the AL**");
		s=it1.hasNext();
		System.out.println(s);
		
		a.add(6);
		System.out.println(a);
		a2=a.lastIndexOf(6);
		System.out.println(a2);
		
		System.out.println("**List Iterator**");
		ListIterator<Integer> listit=list.listIterator();
		System.out.println(list);
		i=listit.previous();
		listit.next();
		System.out.println("Next element "+i);
		
		i=listit.previous();
		System.out.println("Previous element"+i);
		i=listit.next();
		System.out.println("first"+i);
		i=listit.next();
		System.out.println("second"+i);
		i=listit.next();
		System.out.println("third"+i);
		i=listit.previous();
		System.out.println(i);
		
		System.out.println("**Replacing an element using set**");
		listit.set(100);
		while(listit.hasNext()) {
			i=listit.next();
			System.out.println(i);
		}
		
		System.out.println(" Traversing through Array using Iterator");
		for(Integer x:a1) {
			System.out.println(x);
					
		}
		
//		a1.notify();
//		listit.notifyAll();
		System.out.println(" Returning stream of data in sequential order of an array");
		Stream<Integer> s1=a1.parallelStream();
		System.out.println(a1);
		
		System.out.println(" Returning stream of data in sequential order from list");
		Stream s2=list.parallelStream();
		System.out.println(list);
		
		System.out.println("Remove index 4");
		System.out.println(a);
		a.remove(4);
		System.out.println(a);
		
		System.out.println("Remove all index");
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		
		System.out.println("Retaining all elements compares a1 AL with list");
		System.out.println("Before retaining elements in a1");
		System.out.println(a1);
		System.out.println(list);
		s=a1.retainAll(list);
		System.out.println(s);
		
		System.out.println("After retaining elements in a1");
		System.out.println(a1);
		System.out.println(list);
		
		System.out.println("Changing value of a array at the specified index");
		a1.set(2, 200);
		System.out.println(a1);
		
		System.out.println("Returning size of an AL");
		a2=a1.size();
		System.out.println(a2);
		a2=list.size();
		System.out.println(a2);
		a2=a.size();
		System.out.println(a2);
		
		System.out.println("Before soting an elements");
		System.out.println(a1);
		System.out.println(list);
		Collections.sort(a1);
		Collections.sort(list);
		
		System.out.println("After soting an elements");
		System.out.println(a1);
		System.out.println(list);
		
//		Spliterator<Integer> si=a1.spliterator();
//		while(si.SIZED) {
//			si.();
//			System.out.println(i);
//		}
//		
//		System.out.println(si);
		System.out.println("Returning the sub list using from and to index");
		List<Integer> li=a1.subList(5, 11);
		System.out.println(li);
		
		List<Integer> li1=a1.subList(4, 10);
		System.out.println(li1);
		
		Object[] o = a1.toArray();
		System.out.println(o);
		
		String str=a1.toString();
		System.out.println(str);
		
		System.out.println("Trim to size");
		a1.trimToSize();
		System.out.println(a1);
		
		a1.get(a2);
		

	}
	public static void main(String[] args) {
		ALMethods();
		
	}

}
