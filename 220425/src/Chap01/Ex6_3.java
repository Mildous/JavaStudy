package Chap01;
class Tv2 { 
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUP() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class Ex6_3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
	}

}
