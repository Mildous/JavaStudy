package poketmon0523;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class GameManager {

	Map<String, String> userInfostorage = new HashMap<String, String>();
	Map<String, List<Poketmon>> userPoketmons= new HashMap<String, List<Poketmon>>();
	File poketmonSaveFile = new File("C:\\Temp\\PoketmonSaveFile.txt");
	File loginSaveFile = new File("C:\\Temp\\LoginSaveFile.txt");
	static String id;
	static String password;
	
	
	public void showBagInPokekmon() { // 가방에 담긴 포켓몬을 보여주는 메서드
		for (int i = 0; i < GameConst.poketmonBag.size(); i++) { // arrayList의 크기만큼
			Poketmon p = GameConst.poketmonBag.get(i); // arrayList에 담긴 내용을
			System.out.println("[" + (i + 1) + "] " + "[Lv." + p.level + " " + p.name + "] [CP: " + p.cp + "]"); // 출력한다
		}
		if (GameConst.poketmonBag.isEmpty()) { // arrayList가 비어있을 경우
			System.out.println("빈 가방입니다.."); // 출력한다
		}
	}

	public boolean getPoketmon(int selectType) { // 서브메뉴 출력 후 입력한 값(int)을 받아옴
		List<Poketmon> typePoketmons = new ArrayList(); // 타입별 포켓몬을 담을 typePoketmon 리스트 생성
		for (int i = 0; i < GameConst.poketmons.size(); i++) { // 상수로 정해둔 총 포켓몬의 수 만큼 돌면서
			if (selectType == GameConst.poketmons.get(i).type) { // selectType(받아온 숫자)과 const에서 정해둔 타입이 일치하는것만
				typePoketmons.add(GameConst.poketmons.get(i)); // typePoketmons에 담는다
			}
		}
		Poketmon orgPoketmon = typePoketmons.get((int) (Math.random() * 3));
		// typePoketmons에 담긴 3마리 중 랜덤으로 뽑은 1마리를 orgPoketmon에 대입
		Poketmon p = new Poketmon(orgPoketmon); // 주소값을 다르게 하기 위해 orgPoketmon을 new로 p에 대입
		p.cp = getRandomNumber(GameConst.LV_CP_MAPPING.get(p.level).get("min"),
				GameConst.LV_CP_MAPPING.get(p.level).get("max"));
		// p의 level에 해당하는 최대값과 최소값을 Map에서 불러오고, getRandomNumber()를 이용해 지정해둔 cp 범위 내에서
		// 랜덤값을 생성하여 p.cp에 대입
		System.out.println("야생의 포켓몬 " + p.name + "이(가) 나타났다!");
		p.showGetMon(); // 출현한 포켓몬을 Poketmon 클래스에서 지정해둔 양식에 맞춰 출력
		if ((new Random().nextInt(100) < GameConst.LV_CP_MAPPING.get(p.level).get("p"))) {
			// p.level에 해당되는 p(상수로 정해둔 확률)가 랜덤으로 생성된 숫자보다 클 때 (p가 90이면 90%확률)
			System.out.println("와! 잡았다!");
			setPoketmon(p); // poketmonBag에 에 값을 저장한다.
			return true; // PlayGame의 case2: if문 실행
		} else {
			System.out.println("놓쳐버렸다..");
			return false; // PlayGame의 case2: else문 실행
		}
	}

	public void setPoketmon(Poketmon poketmon) {
		GameConst.poketmonBag.add(poketmon);
	} // 잡은 포켓몬을 가방list에 담는 메서드

	public void deletePoketmon(int select) { // list에 담긴 값을 삭제하는 메서드

		GameConst.poketmonBag.remove(select - 1); // 선택은 1부터 하기에 0이 아닌 -1로 설정
	}

	public int getRandomNumber(int min, int max) { // 최소값과 최대값 사이에서 랜덤한 수를 생성하는 메서드
		return (int) ((Math.random() * (max - min)) + min);
	}

	public void selectVsMewtwo(int select) { // 뮤츠와 싸울 포켓몬을 입력받은 후 vsList에 추가 및 기존 가방에서 삭제
		GameConst.vsList.add(GameConst.poketmonBag.get(select - 1));
		GameConst.poketmonBag.remove(select - 1);
	}

	public int getTotalCp() { // vsList에 담긴 포켓몬의 cp를 더한 총 합
		return (int) GameConst.vsList.stream().collect(Collectors.summarizingInt(v -> v.cp)).getSum();
	}

	public void newLogIn() {
		while (true) {
			System.out.println("가입할 id를 입력하세요.");
			id = GameConst.sc.nextLine();
			if (userInfostorage.containsKey(id)) {
				System.out.println("이미 가입된 id입니다.");
				continue;
			}
			System.out.println("password를 입력하세요.");
			password = GameConst.sc.nextLine();
			userInfostorage.put(id, password);
			System.out.println("가입이 완료되었습니다.");
			break;
		}
	}

	public boolean login() {
		int count = 0;
		while (true) {
			System.out.println("id를 입력하세요.");
			id = GameConst.sc.nextLine();
			System.out.println("password를 입력하세요.");
			password = GameConst.sc.nextLine();
			if (!userInfostorage.containsKey(id) || !userInfostorage.containsValue(password)) {
				if (count == 3) {
					System.out.println("오류 3회초과.");
					return false;
				}
				System.out.println("아이디가 없거나 비밀번호를 잘못입력하셨습니다.");
				System.out.println("로그인 오류 " + (count + 1) + "회.");
				count++;
				continue;
			}

			System.out.println("로그인되었습니다.");
			return true;
		}
	}
	void savePoketmons() {
		userPoketmons.put(id, GameConst.poketmonBag);
		
	}
	
	void saveToFile() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		if(!loginSaveFile.exists()) {
			try {
				loginSaveFile.createNewFile();
				fos = new FileOutputStream(loginSaveFile);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(userInfostorage);
				System.out.println("저장이 완료되었습니다.");
				
			} catch (IOException e) {
			}finally {
				try {
					if(oos!=null) {
						oos.flush();
						oos.close();
					}
					if(fos!=null) {
						fos.close();
					}
				}catch(Exception e) {
				}
			}
		}else {
			try {
				loginSaveFile.createNewFile();
				fos = new FileOutputStream(loginSaveFile);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(userInfostorage);
				System.out.println("저장이 완료되었습니다.");
				
			} catch (IOException e) {
			}finally {
				try {
					if(oos!=null) {
						oos.flush();
						oos.close();
					}
					if(fos!=null) {
						fos.close();
					}
				}catch(Exception e) {
				}
			}
		}
	}
	
	void readFromFile() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		if(!loginSaveFile.exists()) {
			return;
		}
		try {
			fis = new FileInputStream(loginSaveFile);
			ois = new ObjectInputStream(fis);
			
			HashMap<String, String> tmp=(HashMap<String, String>)ois.readObject();
			userInfostorage=tmp;
//			Map<String, String> tmp2 = (Map<String, String>)ois.readObject();
//			userInfostorage=tmp2;
			
		}catch(Exception e) {
		}finally {
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
				}catch(Exception e) {}
		}
	}
}
