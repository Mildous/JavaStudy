package javatest;

public class Ex04 {

	public static void main(String[] args) {
//	   형변환 : 자동 형변환(promotion) / 강제 형변환(casting)
//				작은 그릇의 값은 큰 그릇에 그냥 들어간다.
//				byte < short < int < long : promotion
		int n1 = 5;
		long n2 = 6L;
		
		n2 = n1;	//자동 형변환이 일어남..
		System.out.println(n2);
		
		n1 = (int)n2;	//강제 형변환
		System.out.println(n1);
		
		int kor = 83;
		int eng = 93;
		int mat = 81;
		int tot = kor + eng + mat;
		float avg1 = tot/3;
		float avg2 = tot/3.0f;
		float avg3 = tot/ (float)3;
		float avg4 = (float)tot / 3;
		float avg5 = (float)tot / (float)3;
	}

}
