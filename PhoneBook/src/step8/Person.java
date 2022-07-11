<<<<<<< HEAD
package Step8;
=======
package step8;
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{
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

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name);
		}else {
			return false;
		}	
	}
	
	@Override
	public int hashCode() {
		//return name.hashCode();
		return Objects.hash(name);
	}
	
	
}
