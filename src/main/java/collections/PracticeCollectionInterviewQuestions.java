package collections;

import java.util.HashSet;

public class PracticeCollectionInterviewQuestions {

	public static void main(String[] args) {
		String str = "Sathiyamoorthi Murugesan";
		
		String[] allLetters = str.split("");
		
//		for(String eachLetters: allLetters ) {
//			
//		}
		
		HashSet<String> collection = new HashSet<String>();
//		ArrayList<String> collection = new ArrayList<String>();
		
		for(int i = 0; i<str.length(); i++) {
			int count = 1;
			if(!collection.contains(allLetters[i])) {
//				collection.add(allLetters[i]);
			for(int j = i+1; j<str.length();j++) {
				if(allLetters[i].equals(allLetters[j])) {
					count++;
				}
			}
			
			if(count == 1) {
				if(allLetters[i].equalsIgnoreCase(" ")) {
					allLetters[i] = "space";
				}
				System.out.println(allLetters[i]+ " is repeated "+count+ " times");
			}
			else
				System.out.println(allLetters[i]+ " is repeated "+count+ " times");
		}
			collection.add(allLetters[i]);
		}
		
		System.out.println(collection);
	}

}
