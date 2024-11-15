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
		File file1 = new File("C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\src\\main\\java\\exceptionLearning\\exception.txt");
		File file2 = new File("C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\src\\main\\java\\exceptionLearning\\exception1.txt");
		File file3 = new File("C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\src\\main\\java\\exceptionLearning\\exception2.txt");
		//to read file we use FileInputStream class.. but if there is no file then we get FileNotFoundException;
		try {
			FileInputStream fis = new FileInputStream(file3);
		} catch (FileNotFoundException e) {
//			file1.createNewFile();
//			FileInputStream fis = new FileInputStream(file1);
			System.out.println("aaaa");
		}
		System.out.println("Hello");
	}

}

//File file1 = new File("C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\src\\main\\java\\exceptionLearning\\exception.txt");
//FileInputStream fis = new FileInputStream(file3);
//System.out.println("Hello");
