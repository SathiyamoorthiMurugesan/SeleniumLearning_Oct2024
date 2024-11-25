package collections;

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

//		Set<Entry<String, Integer>>  allMarksAndValues = marks.entrySet();
		Set<Map.Entry<String, Integer>>  allMarksAndValues = marks.entrySet();
		
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
		
		while(ite.hasNext()) {
			Entry<String, Integer> eachEntry = ite.next();
			if(eachEntry.getKey() != null && eachEntry.getKey().equalsIgnoreCase("English")) {
				System.out.println(eachEntry.getValue());
			}
		}
	}

}
