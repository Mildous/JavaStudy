package Chap01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		/* int[] score = new int[5];
		//System.out.println(score[3]);
		
		ArrayList list1 = new ArrayList(); //10��¥�� array����
		System.out.println(list1);
		
		for(int i=0; i<20; i++)
			list1.add(i);
			
		System.out.println(list1); */
		ArrayList<Integer> list1 = new ArrayList(10); //int�� ����ϵ��� ����(���ʸ�)
		list1.add(new Integer(5));	//�ڽ�
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		//System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //list1�� 1��°~3��°������ sublist ����
		//System.out.println(list2);
		print(list1, list2);
		
		Collections.sort(list1);	//list1�� list2�� ������������ ����
		Collections.sort(list2);	//Collections.sort(List 1)
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add("B");		//list2�� "B"�� "C"�� �߰� (add)
		list2.add("C");		//ArrayList�� Ÿ�� ������� ���� ������ �� �ִ�.(int, string)
		list2.add(3, "A");		//list2�� 3��°���� "A"�� �߰� (add)
		print(list1, list2);
		
		list2.set(3, "AA");		//list2�� 3��°���� "AA"�� ����(�������̵�) (set)
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2)); 
		//list1���� list2�� ��ġ�� �κи� ����� �������� ����
		print(list1, list2);
		
		for(int i=list2.size() -1; i>=0; i--) { // list2�� ���������� �ϳ��� ���鼭
			if(list1.contains(list2.get(i))) // list1���� ����� �� �̿��� ����
				list2.remove(i); // list2���� �����Ѵ�.
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list 1 : " +list1);
		System.out.println("list 2 : " +list2);
		System.out.println();
	}

}
