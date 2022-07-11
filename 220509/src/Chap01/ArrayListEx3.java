package Chap01;

import java.util.Vector;

public class ArrayListEx3 {

	public static void main(String[] args) {
		Vector v = new Vector(5); //capacity�� 5�� Vector �ν��Ͻ� v�� ����.
		v.add("1"); // 3���� ��ü�� ���� �־� ����
		v.add("2");
		v.add("3");
		print(v); 
		
		v.trimToSize(); // trimToSize()�� ȣ���Ͽ� v�� �� ������ �����ϰ�, size�� capacity�� ���� ��.
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6); // v�� capacity�� 6�� �ǵ��� ��(�ν��Ͻ��� ���� �����Ͽ���)
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7); // v�� size�� 7�� �ǵ��� ��. v�� capacity�� 6�̱⿡, �ڵ����� 2���� ũ��� ������.
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear(); // v�� ��� ��ü���� ������. => null. ���� capacity�� 12.
		System.out.println("=== After clear() ===");
		print(v);

	}
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " +v.size());
		System.out.println("capacity : " +v.capacity());
	}

}
