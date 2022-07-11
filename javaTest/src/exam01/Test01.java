package exam01;

public class Test01 {
//	리터럴 == 값 자체
//	상수, 변수 == 그릇
//	변수는 항상 선언부터 먼저 하고, 값을 집어넣는다.
	
//	int a;		: 선언
//	a = 5;		: 값을 집어넣는다 --> 초기화
//	int a=5;	: 선언 및 초기화


	public static void main(String[] args) {
		/* 
		System.out.printf("%s님은 %d세입니다.%n\n", "홍길동", 19);
		String name = "홍길동";
		name = "이성순";
		name = "장천용";
		
		System.out.println("당신의 이름은 " + name + "입니다.");	//문자열 + 문자열 --> 나열, 결합
		*/
		String[] name = {"홍길동", "이성순"};
		int[] kor = {90, 80};
		int[] eng = {90, 80};
		int[] math = {90, 80};
		int[] sci = {90, 80};
		int[] his = {90, 80};
		int total = 0;
		double avg = 0.0;
		String tab = "    ";
		System.out.println("---------------------------------------------------");
		System.out.println(" 이름    국어   영어   수학   과학   역사    총점    평균 ");
		System.out.println("---------------------------------------------------");
		total = kor[0] + eng[0] + math[0] + sci[0] + his[0];
		avg = total/5;
		System.out.println(name[0] + tab + kor[0] + tab + eng[0] + tab + math[0] + tab + sci[0] + tab + his[0] + tab + total + tab + avg);
		total = kor[1] + eng[1] + math[1] + sci[1] + his[1];
		avg = total/5;
		System.out.println(name[1] + tab + kor[1] + tab + eng[1] + tab + math[1] + tab + sci[1] + tab + his[1] + tab + total + tab + avg);
	}
}
