package Chap02;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet(); //TreeSet은 값을 정렬할 때 저장하기 때문에 sort 필요 X
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); //set.add(new Integer(num));
		}
		System.out.println(set);
	}

}
