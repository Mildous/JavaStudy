package Chap01;

import java.util.Scanner;

public class Exam07 {
	/* ����� ��޿� ���� �ð��� �޿��� ������ ���� ���ǵǾ� �ִ�.
	 * 1���Ͽ� 40�ð��� �⺻ �ٹ��ð��̸�, �̸� �ʰ��ϴ� ��� �⺻ �ð��� �޿��� 1.5�谡 ���޵ȴ�.
	 * ����� ��ް� 1���� ������ �ٹ� �ð��� �Է¹޾� �� �޿��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ��, �ٹ� �ð��� 40�ð��� �̴��ϴ� ��쿡�� 40�ð����� ó���Ѵ�.
	 * ������ 7, 8���� ��� : 15000/�ð�
	 * ������ 5, 6���� ��� : 20000/�ð� */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = 0;
		int mph = 0;
		int hour = 0;
		double total = 0;
		
		System.out.print("����(5,6,7,8) ==> ");
		grade = Integer.parseInt(sc.nextLine());
		System.out.print("�ٹ��ð� ==> ");
		hour = Integer.parseInt(sc.nextLine());
		
		//�ñް���
		if(grade==5 || grade==6) {
			mph = 20000;
		} else if(grade==7 || grade==8) {
			mph = 15000;
		}
		
		//�ٹ��ð� üũ�ؼ� 40�����̸� 40���� ����
		if(hour < 40) {
			hour = 40;
		}
		
		//�޿����
		total = (mph*40) + (mph*(hour-40)*1.5);
		
		System.out.println("�ֱ޿� : " +Math.round(total));

	}

}
