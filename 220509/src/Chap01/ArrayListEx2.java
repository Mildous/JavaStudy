package Chap01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 10; //잘라낼 글자의 갯수 10개(상수화)
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length(); //length = 43
		
		List list = new ArrayList(length/LIMIT +10); //크기를 +10으로 여유있게 지정
		
		for(int i=0; i<length; i+=LIMIT) { //i가 length보다 작을동안 i+LIMIT(10)씩 증가(-> i=i+10)
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT)); //i부터 i+LIMIT까지 잘라서 list에 반환
			else
				list.add(source.substring(i)); //마지막에는 끝까지 자르기
		}
		// System.out.println(list);
		for(int i=0; i<list.size(); i++) { //list.size마다 출력
			System.out.println(list.get(i));
		}

	}

}
