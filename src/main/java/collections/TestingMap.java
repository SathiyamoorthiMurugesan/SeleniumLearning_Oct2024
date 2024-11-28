package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestingMap {

	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("English", 75);
		marks.put("Maths", 100);
		marks.put(null, 50);
		marks.put(null, 45);
		marks.put("Bio", null);
		marks.put("Physics", null);
		marks.put("Chemistry", 75);
		marks.put("Maths", 95);

		System.out.println(marks);
		
//		if you want to check the any specific key is present in the keys
//		1) you need to all the keys
		Set<String> allKeys = marks.keySet(); //Set of keys
		for(String eachKey: allKeys) {
			System.out.println(eachKey);
		}
		
//		Similarly you can check for Values as well
		Collection<Integer> allValues = marks.values(); //Collection of values
		for(Integer eachVal : allValues) {
			System.out.println(eachVal);
		}
		
		Set<Entry<String, Integer>> allKeyAndValue =  marks.entrySet(); //key - value mapping;
		System.out.println(allKeyAndValue);
		for(Entry<String, Integer> each: allKeyAndValue) {
//			System.out.println(each.getKey());
//			System.out.println(each.getValue());
			
			if(each.getKey() != null &&  each.getKey().equals("English")) {
				System.out.println(each.getValue());
			}
		}
		
		
		System.out.println("Using Iterator to go through the key value pair simultaniously");
		
		Iterator<Entry<String, Integer>> ite = allKeyAndValue.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
			
			Entry<String, Integer> eachEntry = ite.next();
			if (eachEntry.getKey() != null && eachEntry.getKey().equalsIgnoreCase("English")) {
				System.out.println(eachEntry.getValue());
			}
		}
		
		

	}

	public void test() {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
//		Set<Entry<String, Integer>>  allMarksAndValues = marks.entrySet();
		Set<Map.Entry<String, Integer>> allMarksAndValues = marks.entrySet();

		System.out.println(allMarksAndValues);

		Iterator<Entry<String, Integer>> ite = allMarksAndValues.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next().getKey());
//			System.out.println(ite.next().getValue());
//		}

//		while(ite.hasNext()) {
//			Entry<String, Integer> eachEntry = ite.next();
//			System.out.println(eachEntry.getKey());
//			System.out.println(eachEntry.getValue());
//		}

		while (ite.hasNext()) {
			Entry<String, Integer> eachEntry = ite.next();
			if (eachEntry.getKey() != null && eachEntry.getKey().equalsIgnoreCase("English")) {
				System.out.println(eachEntry.getValue());
			}
		}
	}

}
