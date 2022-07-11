package poketmonster_ojt;

import java.util.HashMap;
import java.util.Map;

public class LoginManager {
	
	Map users = new HashMap();
	
	void makeUser() {
		String id="";
		String password="";
		System.out.println("회원가입");
		System.out.println("ID를 입력하소");
		id=Menu.sc.nextLine();
		System.out.println("Password를 입력하소");
		password=Menu.sc.nextLine();
		users.put(id, password);
	}
	
	boolean login() {
		String id="";
		String password="";
		Boolean userLogin=false;
		System.out.println("로그인");
		System.out.println("ID를 입력하소");
		id=Menu.sc.nextLine();
		System.out.println("Password를 입력하소");
		password=Menu.sc.nextLine();
		if(!users.containsKey(id)|!users.containsValue(password)) {
			System.out.println("잘못입력하셨소");
			return false;
		}else if(users.containsValue(password)) {
			System.out.println("로그인되었습니다.");
			return true;
		}
		return false;
	}
}
