package chap01;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HKIT\\eclipse-workspace\\220513\\src\\chap01/FileViewer.java");
		int data = 0;
		
		while((data=fis.read())!=-1) {
			char c = (char)data;
			System.out.print(c);
		}

	}

}
