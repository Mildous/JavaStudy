package Test;

public class Time {
	int hour;
	int minute;
	float second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int h) {
		if(h<0 || h>23) return;
		hour = h;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int m) {
		if(m<0 || m>59) return;
		minute = m;
	}
	public float getSecond() {
		return second;
	}
	public void setSecond(float s) {
		if(s<0 || s>59) return;
		second = s;
	}
	
	

}
