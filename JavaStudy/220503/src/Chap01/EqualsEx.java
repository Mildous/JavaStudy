package Chap01;

public class EqualsEx {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = (Value)v1.clone();
		
		/* Value v1 = new Value(10);
		Value v2 = new Value(10); */
		// v1�� v2�� �ּҰ��� �ٸ�
		
		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		// Object Ŭ�����κ��� ��ӹ��� equals�޼���� �� ���� ���������� ���� ��ü�� �����ϰ� �ִ���,
		// �� �� ���������� ����� ��(�ּҰ�)�� �������� �Ǵ��ϴ� ��ɹۿ� �� �� ����.
		
		// v2 = v1;		// v1�� v2�� ����
		
		if(v1==v2)
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");

	}

}
