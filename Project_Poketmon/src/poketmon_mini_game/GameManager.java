package poketmon_mini_game;

import java.util.*;

public class GameManager {

<<<<<<< HEAD
	public void showBagInPokekmon(){
        for(int i = 0; i < GameConst.poketmonBag.size(); i++){
            Poketmon p = GameConst.poketmonBag.get(i);
            System.out.println("["+(i+1)+"] "+"[Lv." + p.level + " " + p.name + "] [CP: " + p.cp +"]");
        }
        if(GameConst.poketmonBag.isEmpty()){
            System.out.println("�� �����Դϴ�..");
=======
	public void showBagInPokekmon(){ //가방에 담긴 list를 보여주는 함수
        for(int i = 0; i < GameConst.poketmonBag.size(); i++){
            Poketmon p = GameConst.poketmonBag.get(i); //poketmonBag에 담긴것을 p에 대입
            System.out.println("["+(i+1)+"] "+"[Lv." + p.level + " " + p.name + "] [CP: " + p.cp +"]");
        }
        if(GameConst.poketmonBag.isEmpty()){ //비어있는 list일 경우
            System.out.println("빈 가방입니다..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
        }
    }
	
    
    public boolean getPoketmon(int selectType){
        List<Poketmon> typePoketmons = new ArrayList();
        for(int i = 0 ; i < GameConst.poketmons.size() ; i++){
            if(selectType == GameConst.poketmons.get(i).type){
                typePoketmons.add(GameConst.poketmons.get(i));
            }
        }
        Poketmon p = typePoketmons.get((int)(Math.random()*3));
        
        p.cp = getRandomNumber(GameConst.LV_CP_MAPPING.get(p.level).get("min"), GameConst.LV_CP_MAPPING.get(p.level).get("max"));
<<<<<<< HEAD
        System.out.println("�߻��� ���ϸ� "+p.name+"��(��) ��Ÿ����!");
        p.showGetMon();
        if((new Random().nextInt(100) < GameConst.LV_CP_MAPPING.get(p.level).get("p"))){
            System.out.println("��! ��Ҵ�!");
            setPoketmon(p);
            return true;
        }else{
            System.out.println("�����ߴ�..");
=======
        System.out.println("야생의 포켓몬 "+p.name+"이(가) 나타났다!");
        p.showGetMon();
        if((new Random().nextInt(100) < GameConst.LV_CP_MAPPING.get(p.level).get("p"))){
            System.out.println("와! 잡았다!");
            setPoketmon(p);
            return true;
        }else{
            System.out.println("놓쳐버렸다..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
            return false;
        }
    }

    public void setPoketmon(Poketmon poketmon){
        GameConst.poketmonBag.add(poketmon);
    }

    public void deletePoketmon(int select){
    	
        GameConst.poketmonBag.remove(select-1);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
