package Step8;

public class CompPerson extends Person{
	String company;
	
	public CompPerson(String name, String phoneNumber, String birth, String company) {
		super(name, phoneNumber, birth);
		this.company = company;
	}
	public CompPerson(String name, String phoneNumber, String company) {
		super(name, phoneNumber, null);
		this.company = company;
	}
	void showPhoneInfo() {
		
		if(birth !=null && !birth.equals("")) //!"".equals(birth)
		System.out.printf("%s : %s : %s : %s%n", name, phoneNumber, birth, company);
		else
		System.out.printf("%s : %s : %s%n", name, phoneNumber, company);
	}

}
