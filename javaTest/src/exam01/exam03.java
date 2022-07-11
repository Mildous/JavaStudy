package exam01;

public class exam03 {
	public static void main(String[] args) {
		String str = "Welcome to my Site!!!";
		int strLen = str.length();
		System.out.println("strLen : " + strLen);
		
		String str2 = str.toLowerCase();
		System.out.println(str + "\n" + str2);
		
		int indexValue = str.indexOf("l");
		System.out.println(indexValue);
		
		int indexValue2 = str.indexOf("o");
		System.out.println(indexValue2);
		
		int indexValue3 = str.indexOf("my");
		System.out.println(indexValue3);
		
		System.out.println(str.contains("We"));
		
//		String firstName = "hong";
//		String lastName = "gil-dong";
//		System.out.println(firstName.concat(lastName));
		System.out.println(str.substring(3, 5));
		
		String temp = str.substring(3, 5);
		System.out.println(temp);
		
		String temp2 = str.substring(1);
		System.out.println(temp2);
		
		String temp3 = str.replace("Site", "Home");
		System.out.println(str + "\n" + temp3);
		
		String temp4 = str.trim();
		System.out.println(temp4);
		
		int num = 3279;
		String temp5 = String.valueOf(num);
		System.out.println(temp5);
		
		System.out.println(str.lastIndexOf("e"));
		
		String phone = "010-1234-5678";
		int loc01 = phone.indexOf("-");
		int loc02 = phone.lastIndexOf("-");
		System.out.println(loc01 + " / " + loc02);
		
		String imsi01 = phone.substring(0, loc01);
		String imsi02 = phone.substring(loc01 + 1, loc02);
		String imsi03 = phone.substring(loc02 + 1);
		System.out.println(imsi01 + " / " + imsi02 + " / " + imsi03);
		
		String[] imsiArray = phone.split("");
		
	}
}
