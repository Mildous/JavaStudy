package Step5;

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
