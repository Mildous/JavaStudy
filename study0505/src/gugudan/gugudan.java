package gugudan;

import java.util.Scanner;

public class gugudan {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 단을 입력하세요.");
        int num = Integer.parseInt(sc.nextLine());

        for(int i=1; i<10; i++){
            System.out.println(num*i);
        }

        aaa();

    }
    public static void aaa(){
        System.out.println("aaa");
    }



}
