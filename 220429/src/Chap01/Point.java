package Chap01;

public class Point {
	
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){}
	String getLocation() {
		return "x :"+x+", y :"+y;
	}

}
