package poketmonproject;

import java.util.stream.Collectors;

public class BattleMewtwo {
	final int MewtwoCP=1000;


	public int getTotalCp() { // vsList에 담긴 포켓몬의 cp를 더한 총 합
		return (int) GameConst.vsList.stream().collect(Collectors.summarizingInt(v -> v.cp)).getSum();
	}
	
	public void battleIf() {
		if(getTotalCp() > MewtwoCP) { //뮤츠 CP설정, 이겼을 경우
			System.out.println();
			System.out.println("                  < 승리 >");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("                  < 패배 >");
			System.out.println();
		}
	}
	public void showBattle() {
		System.out.println();
		try 
		{
			Thread.sleep(1000);
			System.out.println("   	      Ａ__Ａ  		 	");
			System.out.println("   	 　　  (o・ω・)  	 	");
			System.out.println(" 	  /ヽヘし▄︻▇〓┳═-・*。 	");
			System.out.println(" 	   ＼/ヽｕ─ｕ'  		");
			System.out.println();
			Thread.sleep(500);
			System.out.print("	    싸");
			Thread.sleep(500);
			System.out.print(" 우");
			Thread.sleep(500);
			System.out.print(" 는");
			Thread.sleep(500);
			System.out.print(" 중");
			Thread.sleep(500);
			System.out.print(" .");
			Thread.sleep(500);
			System.out.print(" .");
			Thread.sleep(2000);
			System.out.println();
			battleIf();
			Thread.sleep(500);
			System.out.println("            [TOTAL CP] " + getTotalCp()); //CP합계 출력
			Thread.sleep(1000);
			System.out.println("            [뮤츠의　CP] "+ MewtwoCP);
			Thread.sleep(1000);
		}catch(InterruptedException e) {
		}
		System.out.println();
		GameConst.vsList.clear();
	}

}