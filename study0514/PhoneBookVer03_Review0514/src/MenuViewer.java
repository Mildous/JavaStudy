import java.util.Scanner;

public class MenuViewer {
    static Scanner sc = new Scanner(System.in);
    //입력, 검색, 수정, 삭제, 전제출력, 종료
    static void showMenu(){
        System.out.println("===== MENU =====");
        System.out.println("1. Input Data...");
        System.out.println("2. Search Data..");
        System.out.println("3. Edit Data....");
        System.out.println("4. Delete Data..");
        System.out.println("5. All Data.....");
        System.out.println("6. Exit.........");
        System.out.print("---> ");

    }
}
