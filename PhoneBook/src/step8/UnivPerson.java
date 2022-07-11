<<<<<<< HEAD
package Step8;
=======
package step8;
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba

public class UnivPerson extends Person{
	String major;
	int grade;
	
	public UnivPerson(String name, String phoneNumber, String birth, String major, int grade) {
		super(name, phoneNumber, birth);
		this.major = major;
		this.grade = grade;
	}
	public UnivPerson(String name, String phoneNumber, String major, int grade) {
		super(name, phoneNumber, null);
		this.major = major;
		this.grade = grade;
	}

	@Override
	void showPhoneInfo() {
		if(birth !=null && !birth.equals("")) //!"".equals(birth)
			System.out.printf("%s : %s : %s : %s : %d%n", name, phoneNumber, birth, major, grade);
		else
			System.out.printf("%s : %s : %s : %d%n", name, phoneNumber, major, grade);
	}
	
	
	

}
