package poketmonster_ojt;

import java.util.HashMap;
import java.util.Map;

public class LoginManager {
	
	Map users = new HashMap();
	
	void makeUser() {
		String id="";
		String password="";
		System.out.println("ȸ������");
		System.out.println("ID�� �Է��ϼ�");
		id=Menu.sc.nextLine();
		System.out.println("Password�� �Է��ϼ�");
		password=Menu.sc.nextLine();
		users.put(id, password);
	}
	
	boolean login() {
		String id="";
		String password="";
		Boolean userLogin=false;
		System.out.println("�α���");
		System.out.println("ID�� �Է��ϼ�");
		id=Menu.sc.nextLine();
		System.out.println("Password�� �Է��ϼ�");
		password=Menu.sc.nextLine();
		if(!users.containsKey(id)|!users.containsValue(password)) {
			System.out.println("�߸��Է��ϼ̼�");
			return false;
		}else if(users.containsValue(password)) {
			System.out.println("�α��εǾ����ϴ�.");
			return true;
		}
		return false;
	}
}
