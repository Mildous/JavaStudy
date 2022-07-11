package Chap01;

import java.util.Vector;

public class ArrayListEx3 {

	public static void main(String[] args) {
		Vector v = new Vector(5); //capacity가 5인 Vector 인스턴스 v를 생성.
		v.add("1"); // 3개의 객체에 값을 넣어 저장
		v.add("2");
		v.add("3");
		print(v); 
		
		v.trimToSize(); // trimToSize()를 호출하여 v의 빈 공간을 삭제하고, size와 capacity를 같게 함.
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6); // v의 capacity가 6이 되도록 함(인스턴스를 새로 생성하였음)
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7); // v의 size가 7이 되도록 함. v의 capacity는 6이기에, 자동으로 2배의 크기로 증가함.
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear(); // v의 모든 객체값을 삭제함. => null. 따라서 capacity는 12.
		System.out.println("=== After clear() ===");
		print(v);

	}
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " +v.size());
		System.out.println("capacity : " +v.capacity());
	}

}
