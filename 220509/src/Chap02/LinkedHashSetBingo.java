package Chap02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetBingo {

	public static void main(String[] args) {
		//Set set = new HashSet(); //중복을 제거하기 위해 사용
		Set set = new LinkedHashSet();
		int[][] board = new int[5][5]; //5줄 5칸의 2차원배열 board 생성
		
		for(int i=0; set.size()<25; i++) { //set.size가 25가 될 때 까지
			set.add((int)(Math.random()*50)+1+""); //50까지의 난수를 저장
		}
		
		Iterator it = set.iterator(); //반복자 역할
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next()); //reader역할
				System.out.print((board[i][j] < 10 ? "  " : " ")+board[i][j]); //10보다 작으면 "  ", 크면 " ".
			}
			System.out.println();
		}
	}

}
