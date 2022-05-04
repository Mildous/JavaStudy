package Review;

public class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){} 	// 기본생성자
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	int getTotal() {
		return kor+eng+math;
	
	}
	
	float getAverage() {
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
	
}