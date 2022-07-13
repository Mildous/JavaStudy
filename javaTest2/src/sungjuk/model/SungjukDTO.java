package sungjuk.model;

import java.util.Scanner;

public class SungjukDTO {
//	이름, 국어, 영어, 수학, 총점, 평균
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private String grade;
	
	public SungjukDTO() {

	}
	
	public void inputData() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = s.nextLine();
		System.out.print("국어 : ");
		String kor_ = s.nextLine();
		System.out.print("영어 : ");
		String eng_ = s.nextLine();
		System.out.print("수학 : ");
		String math_ = s.nextLine();
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int math = Integer.parseInt(math_);
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void sumTot() {
		this.tot = this.kor + this.eng + this.math;
	}
	
	public void display() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot);
	}
/*	
	public SungjukDTO(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
