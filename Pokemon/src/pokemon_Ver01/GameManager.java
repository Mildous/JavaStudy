package pokemon_Ver01;

public class GameManager {
    final int MAX_CNT=10;
    Pokemon[] inventory = new Pokemon[MAX_CNT];
    int curCnt = 0;

    //잡은 포켓몬을 저장하는 포켓몬 가방
    void pokemonBag() {
        Pokemon[] p = new Pokemon[3];

        p[0] = new Pokemon("피카츄", 500);
        p[1] = new Pokemon("라이츄", 400);
        p[2] = new Pokemon("파이리", 450);

        for(int i=0; i<p.length; i++) {
            p[i].showGetMon();
        }
    }

    //가방에서 검색
    private int search(String name) {

        for(int i=0; i<curCnt; i++) {
            if(name.equals(inventory[i].name)) {
                return i;
            }
        }
        return -1;
    }

    //박사에게 보내기
    void deleteData() {
        System.out.print("내보낼 포켓몬 ==> ");
        String name = MenuViewer.sc.nextLine();
        int index = -1;
        index = search(name);

        if(index > -1) {//삭제할 정보를 찾았으면
            for(int i=index; i<curCnt; i++) {
                inventory[i] = inventory[i+1];
            }
            curCnt--;
            System.out.println("내보내기 완료");

        }else {
            System.out.println("소유하지않은 포켓몬입니다.");
        }
    }
}
