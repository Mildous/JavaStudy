package whyrano0524poketmon;

import java.util.stream.Collectors;

public class BattleMewtwo {
<<<<<<< HEAD
	int MewtwoCP=1000;
=======
	final int MewtwoCP=1000;
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba


	public int getTotalCp() { // vsList에 담긴 포켓몬의 cp를 더한 총 합
		return (int) GameConst.vsList.stream().collect(Collectors.summarizingInt(v -> v.cp)).getSum();
	}
	
	public void battleIf() {
		if(getTotalCp() > MewtwoCP) { //뮤츠 CP설정, 이겼을 경우
<<<<<<< HEAD
			System.out.println("                    <승리>");
		}else {
			System.out.println("                    <패배>");
=======
			System.out.println();
			System.out.println("                  < 승리 >");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("                  < 패배 >");
			System.out.println();
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		}
	}

}