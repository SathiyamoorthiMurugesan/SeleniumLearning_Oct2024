package trials;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeDate {

	public static void main(String[] args) {
		
//		LocalDateTime localDateAndTime = LocalDateTime.now();
//		System.out.println(localDateAndTime);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
//		String dateTime = formatter.format(localDateAndTime);
//		System.out.println(dateTime);
		
		System.out.println(LocalDateTime.now());
		DateTimeFormatter formatINeed = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String myTime = formatINeed.format(LocalDateTime.now());
		System.out.println(myTime);
	}

}
