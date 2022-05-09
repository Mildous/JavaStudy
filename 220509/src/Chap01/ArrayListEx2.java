package Chap01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 10; //�߶� ������ ���� 10��(���ȭ)
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length(); //length = 43
		
		List list = new ArrayList(length/LIMIT +10); //ũ�⸦ +10���� �����ְ� ����
		
		for(int i=0; i<length; i+=LIMIT) { //i�� length���� �������� i+LIMIT(10)�� ����(-> i=i+10)
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT)); //i���� i+LIMIT���� �߶� list�� ��ȯ
			else
				list.add(source.substring(i)); //���������� ������ �ڸ���
		}
		// System.out.println(list);
		for(int i=0; i<list.size(); i++) { //list.size���� ���
			System.out.println(list.get(i));
		}

	}

}
