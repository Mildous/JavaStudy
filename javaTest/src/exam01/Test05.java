package exam01;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		String[] sungjukArray = new String[3];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.print("이름 : ");
			String name = s.nextLine();
			
			System.out.print("국어 : ");
			int kor = Integer.parseInt(s.nextLine());
			
			System.out.print("영어 : ");
			int eng = Integer.parseInt(s.nextLine());
			
			System.out.print("수학 : ");
			int math = Integer.parseInt(s.nextLine());
			
			String imsi = name + "|" + kor + "|" + eng + "|" + math;
			sungjukArray[i] = imsi;
			
		}
		
		for(int i=0; i<sungjukArray.length; i++) {
			String imsi = sungjukArray[i];
			String[] imsiArray = imsi.split("[|]");
			String name = imsiArray[0];
			int kor = Integer.parseInt(imsiArray[1]);
			int eng = Integer.parseInt(imsiArray[2]);
			int math = Integer.parseInt(imsiArray[3]);
			int total = kor + eng + math;
			sungjukArray[i] = name + "|" + kor + "|" + eng + "|" + math + "|" + total;
			System.out.println(sungjukArray[i]);
		}
	}

}
