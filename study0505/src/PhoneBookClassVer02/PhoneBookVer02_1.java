package PhoneBookClassVer02;

import java.util.Scanner;

public class PhoneBookVer02_1 { // 메뉴를 보여주고, 정보를 직접 입력받기. 프로그램 종료 기능 생성.
    static Scanner sc = new Scanner(System.in); // 스캐너를 전역에서 사용 가능하도록 static으로 변경.

    public static void main(String[] args) {
        int choice = 0; // 메뉴를 선택받을 choice 변수 생성.

        while (true) { // 사용자가 종료를 원하기 전까지 메뉴 보여주기를 반복한다.
            showMenu(); // 메뉴를 보여주는 showMenu 메서드를 호출한다.
            choice = Integer.parseInt(sc.nextLine()); // 메뉴를 사용자로부터 입력받는다.

            switch (choice) { // 사용자가 입력한 메뉴가
                case 1: // 1번일 경우 inputData 메서드 실행
                    inputData();
                    break;
                case 2: // 2번일 경우 프로그램 종료 메세지를 출력하고,
                    System.out.println("프로그램을 종료합니다.");
                    return; // 반복문을 벗어남으로써 프로그램을 종료한다.
            }
        }
    }

        static void inputData() { // 앞의 메인을 정보를 입력받는 '메서드'로 변경.
            System.out.print("이름 ==> ");
            String name = sc.nextLine();
            System.out.print("번호 ==> ");
            String phoneNumber = sc.nextLine();
            System.out.print("생일 ==> ");
            String birth = sc.nextLine();

            Person p = new Person(name, phoneNumber, birth);
            p.showPhoneInfo();
        }

        static void showMenu() { // 메뉴 목록을 출력하여 보여준다.
            System.out.println("==== MENU ====");
            System.out.println("1. 정보입력");
            System.out.println("2. 프로그램 종료");
            System.out.print(">> ");

        }

    }