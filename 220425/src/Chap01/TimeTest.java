package Chap01;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		
		//범위 초과한 시간 세팅
		t.setHour(50);//t.hour = 50;
		t.setMinute(67);//t.minute = 67;
		t.setSecond(66);//t.second = 66;
		
		//범위 안의 값으로 세팅
		t.setHour(22);
		t.setMinute(55);
		t.setSecond(30);
		
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		
		t.showTime();
				

	}

}
