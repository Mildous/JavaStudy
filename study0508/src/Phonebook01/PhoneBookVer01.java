package Phonebook01;

import java.util.Scanner;

public class PhoneBookVer01 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int choice = 0;

        while (true) {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    inputData();
                    break;
                case 2:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
    static void inputData(){
            System.out.print("이름 ==> ");
            String name = sc.nextLine();
            System.out.print("전번 ==> ");
            String phoneNum = sc.nextLine();
            System.out.print("생일 ==> ");
            String birth = sc.nextLine();

            Person p = new Person(name, phoneNum, birth);
            p.showPhoneInfo();
        }

    static void showMenu(){
            System.out.println("==== MENU ====");
            System.out.println("1. 입력");
            System.out.println("2. 종료");
            System.out.print("=> ");
        }

    }

