package Chap02;

public class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++; 	// Unit의 HP를 증가시킨다.
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}

	}
}
