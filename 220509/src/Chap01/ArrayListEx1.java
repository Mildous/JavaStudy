package Chap01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		/* int[] score = new int[5];
		//System.out.println(score[3]);
		
		ArrayList list1 = new ArrayList(); //10개짜리 array생성
		System.out.println(list1);
		
		for(int i=0; i<20; i++)
			list1.add(i);
			
		System.out.println(list1); */
		ArrayList<Integer> list1 = new ArrayList(10); //int만 사용하도록 선언(제너릭)
		list1.add(new Integer(5));	//박싱
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		//System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //list1의 1번째~3번째값으로 sublist 생성
		//System.out.println(list2);
		print(list1, list2);
		
		Collections.sort(list1);	//list1과 list2를 오름차순으로 정렬
		Collections.sort(list2);	//Collections.sort(List 1)
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add("B");		//list2에 "B"와 "C"를 추가 (add)
		list2.add("C");		//ArrayList는 타입 관계없이 값을 저장할 수 있다.(int, string)
		list2.add(3, "A");		//list2의 3번째값에 "A"를 추가 (add)
		print(list1, list2);
		
		list2.set(3, "AA");		//list2의 3번째값을 "AA"로 변경(오버라이드) (set)
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2)); 
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		print(list1, list2);
		
		for(int i=list2.size() -1; i>=0; i--) { // list2의 끝에서부터 하나씩 빼면서
			if(list1.contains(list2.get(i))) // list1과의 공통된 값 이외의 것을
				list2.remove(i); // list2에서 삭제한다.
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list 1 : " +list1);
		System.out.println("list 2 : " +list2);
		System.out.println();
	}

}
