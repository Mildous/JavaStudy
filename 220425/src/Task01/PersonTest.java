package Task01;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] pArr = new Person[3];
		
		for(int i=0; i<3; i++) {
			pArr[i] = new Person();
			System.out.print("이름 : ");
			pArr[i].setName(sc.nextLine());
			System.out.print("전화번호 : ");
			pArr[i].setNum(sc.nextLine());
			System.out.print("생일 : ");
			pArr[i].setBirth(sc.nextLine());
			
		}
		
		for(int i=0; i<pArr.length; i++) {
			pArr[i].showPerson();
		}
	}

}
