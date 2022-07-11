package Chap05;

import java.text.SimpleDateFormat;
<<<<<<< HEAD

=======
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		String td = sf.format(today);
		
		System.out.println(td);
		

	}

}
