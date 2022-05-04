package Chap01;

public class EqualsEx {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = (Value)v1.clone();
		
		/* Value v1 = new Value(10);
		Value v2 = new Value(10); */
		// v1과 v2는 주소값이 다름
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		// Object 클래스로부터 상속받은 equals메서드는 두 개의 참조변수가 같은 객체를 참조하고 있는지,
		// 즉 두 참조변수에 저장된 값(주소값)이 같은지를 판단하는 기능밖에 할 수 없다.
		
		// v2 = v1;		// v1을 v2에 대입
		
		if(v1==v2)
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");

	}

}
