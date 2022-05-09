package Chap02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetBingo {

	public static void main(String[] args) {
		//Set set = new HashSet(); //�ߺ��� �����ϱ� ���� ���
		Set set = new LinkedHashSet();
		int[][] board = new int[5][5]; //5�� 5ĭ�� 2�����迭 board ����
		
		for(int i=0; set.size()<25; i++) { //set.size�� 25�� �� �� ����
			set.add((int)(Math.random()*50)+1+""); //50������ ������ ����
		}
		
		Iterator it = set.iterator(); //�ݺ��� ����
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next()); //reader����
				System.out.print((board[i][j] < 10 ? "  " : " ")+board[i][j]); //10���� ������ "  ", ũ�� " ".
			}
			System.out.println();
		}
	}

}
