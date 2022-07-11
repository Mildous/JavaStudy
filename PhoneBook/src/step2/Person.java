<<<<<<< HEAD
package step2;

public class Person {
	String name;
	String phoneNumber;
	String birth;
	
	Person(){
		this("ȫ�浿", "010-0000-0000", "1900/01/01");
	}
	
	Person(String name, String phoneNumber, String birth){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	
	Person(String name, String phoneNumber){
		this(name, phoneNumber, null);
	}
	void showPhoneInfo(){
		//if(birth != null && birth.length() != 0)
		//	System.out.printf("%s : %s : %s%n", name, phoneNumber, birth);
		if(birth !=null && !birth.equals("")) //!"".equals(birth)
			System.out.printf("%s : %s : %s%n", name, phoneNumber, birth);
		else
			System.out.printf("%s : %s%n", name, phoneNumber);
	}
}
=======
package step2;

public class Person {
	String name;
	String phoneNumber;
	String birth;
	
	Person(){
		this("ȫ�浿", "010-0000-0000", "1900/01/01");
	}
	
	Person(String name, String phoneNumber, String birth){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	
	Person(String name, String phoneNumber){
		this(name, phoneNumber, null);
	}
	void showPhoneInfo(){
		//if(birth != null && birth.length() != 0)
		//	System.out.printf("%s : %s : %s%n", name, phoneNumber, birth);
		if(birth !=null && !birth.equals("")) //!"".equals(birth)
			System.out.printf("%s : %s : %s%n", name, phoneNumber, birth);
		else
			System.out.printf("%s : %s%n", name, phoneNumber);
	}
}
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
