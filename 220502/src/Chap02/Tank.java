package Chap02;

public class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(150);		//Tank�� HP�� 150
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}

}
