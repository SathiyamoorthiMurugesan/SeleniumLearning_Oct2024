package exceptionLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CreatingNewFileUsingJava {

	public static void main(String[] args) throws Exception {
		String str = null;

//		File file1 = new File(str);
//		File file1 = new File("");
//		File file1 = new File("test.txt");
//		File file1 = new File("C:\\Users\\Ca\\git\\Tamil_Java\\src\\test\\java\\exceptionLearning\\exception.txt");
		File file1 = new File("C:\\Users\\Ca\\git\\Tamil_Java\\src\\test\\java\\exceptionLearning\\exception1.txt");
		//to read file we use FileInputStream class.. but if there is no file then we get FileNotFoundException;
		try {
			FileInputStream fis = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			file1.createNewFile();
			FileInputStream fis = new FileInputStream(file1);
		}
//		System.out.println(fis.read());
	}
	
	
//	public static void main(String[] args) {
//	 File myObj = new File("filename1.txt");
//   try {
//     File myObj1 = new File("filename.txt");
//     if (myObj.createNewFile()) {
//       System.out.println("File created: " + myObj.getName());
//     } else {
//       System.out.println("File already exists.");
//     }
//   } catch (IOException e) {
//     System.out.println("An error occurred.");
//     e.printStackTrace();
//   }
// }


}
