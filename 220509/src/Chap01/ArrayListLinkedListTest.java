package Chap01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		
		System.out.println("=== 순차추가 ===");
		System.out.println("ArrayList : "+add1(al));
		System.out.println("LinkedList : "+add1(ll));
		System.out.println();
		System.out.println("=== 중간에 추가 ===");
		System.out.println("ArrayList : "+add2(al));
		System.out.println("LinkedList : "+add2(ll));
		System.out.println();
		System.out.println("=== 중간에서 삭제 ===");
		System.out.println("ArrayList : "+remove2(al));
		System.out.println("LinkedList : "+remove2(ll));
		System.out.println();
		System.out.println("=== 순차적으로 삭제 ===");
		System.out.println("ArrayList : "+remove1(al));
		System.out.println("LinkedList : "+remove1(ll));
		//순차적 추가/삭제는 ArraysList가 LinkedList보다 빠르다.
		//중간데이터를 추가/삭제하는 경우 LinkedList가 ArrayList보다 빠르다.
		

	}
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) list.add(i+"");
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
	}
}
