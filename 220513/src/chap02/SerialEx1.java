package chap02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		
		try {
		String fileName = "UserInfo.ser";
		fos = new FileOutputStream(fileName);
		out = new ObjectOutputStream(fos);
		
		UserInfo u1 = new UserInfo("Shin", "1234", 10);
		UserInfo u2 = new UserInfo("Park", "0000", 10);
		
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		
		//out.writeObject(u1);
		//out.writeObject(u2);
		out.writeObject(list);
		System.out.println("직렬화가 잘 끝났습니다.");
		
		}catch(IOException e){
			e.printStackTrace();
		
		}finally {
			try {
				if(out != null) out.close();
				if(fos != null) fos.close();
				
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
