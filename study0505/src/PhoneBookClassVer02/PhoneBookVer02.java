package PhoneBookClassVer02;

import java.util.Scanner;

public class PhoneBookVer02 { // 정보를 직접 입력받는 PhoneBookClass 만들기.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너 생성

        System.out.print("이름 ==> ");
        String name = sc.nextLine();
        System.out.print("번호 ==> ");
        String phoneNumber = sc.nextLine();
        System.out.print("생일 ==> ");
        String birth = sc.nextLine();

        Person p = new Person(name, phoneNumber, birth);

        p.showPhoneInfo();

    }
}