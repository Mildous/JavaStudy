package Chap02;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1_1 {
	
	public static void main	(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		System.out.println(objArr.length);
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			if(set.add(objArr[i])) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
			set.add(objArr[i]);
		}
		System.out.println(set); // String 1, Integer 1 �ߺ����� ���� X
	}

}
