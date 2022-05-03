package step1;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		//Person p1 = new Person();
		//Person p2 = new Person("유관순", "010-4444-3434", "1910/03/01");
		//Person p3 = new Person("세종대왕", "010-8888-7777");
		Person[] p = new Person[3];
		
		p[0] = new Person();
		p[1] = new Person("유관순", "010-4444-3434", "1910/03/01");
		p[2] = new Person("세종대왕", "010-8888-7777");
		
		//p1.showPhoneInfo();
		//p2.showPhoneInfo();
		//p3.showPhoneInfo();
		
		for(int i=0; i<p.length; i++) {
			p[i].showPhoneInfo();
		}
	}
}
