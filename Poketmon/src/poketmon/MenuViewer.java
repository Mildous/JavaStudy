package poketmon;

import java.util.Scanner;

public class MenuViewer {
    static Scanner sc = new Scanner(System.in);

    static void showMenu() { //���θ޴� ���
        System.out.println("== Pokemon World! ==");
        System.out.println("1. ���ϸ� ���");
        System.out.println("2. ���ϸ� ����");
        System.out.println("3. ��������");
        System.out.print("-> ");
    }
}