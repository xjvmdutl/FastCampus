package chapter06.ch18;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\blond\\git\\FastCampus\\FastCampus\\newFile.txt");
		file.createNewFile();//파일 생성하기
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		file.delete();//파일 지우기
	}
	
	
	
}
