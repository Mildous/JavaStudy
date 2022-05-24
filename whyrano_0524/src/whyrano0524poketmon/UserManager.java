package whyrano0524poketmon;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {
    Map<String, String> userInfostorage = new HashMap<String, String>();
    Map<String, List<Poketmon>> userPoketmons = new HashMap<String, List<Poketmon>>();
    File poketmonSaveFile = new File("C:\\Temp\\PoketmonSaveFile.dat");
    File loginSaveFile = new File("C:\\Temp\\LoginSaveFile.dat");

    static String id;
    static String password;

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
                return false;
            }

            System.out.println("로그인되었습니다.");
            return true;
        }
    }
    void savePoketmonsToFile() {
        userPoketmons.put(id, GameConst.poketmonBag);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        if (!poketmonSaveFile.exists()) {
            try {
                poketmonSaveFile.createNewFile();
            } catch (Exception e) {}
        }
        try {
            fos = new FileOutputStream(poketmonSaveFile);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(userPoketmons);
        } catch (IOException e) {
        } finally {
            try {
                if (oos != null) {
                    oos.flush();
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
            }
        }
    }

    void readPoketmonsFromFile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        if (!poketmonSaveFile.exists()) {
            return;
        }
        try {
            fis = new FileInputStream(poketmonSaveFile);
            ois = new ObjectInputStream(fis);


            Map<String, List<Poketmon>> tmp = (Map<String, List<Poketmon>>) ois.readObject();
            userPoketmons = tmp;
            if(userPoketmons.get(id).size()!=0) {
                GameConst.poketmonBag=userPoketmons.get(id);
            }

        } catch (Exception e) {
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (Exception e) {
            }
        }
    }

    void saveUserToFile() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        if (!loginSaveFile.exists()) {
            try {
                loginSaveFile.createNewFile();
            } catch (Exception e) {}
        }
        try {
            fos = new FileOutputStream(loginSaveFile);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(userInfostorage);
        } catch (IOException e) {
        } finally {
            try {
                if (oos != null) {
                    oos.flush();
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
            }
        }
    }
    void readUserFromFile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        if (!loginSaveFile.exists()) {
            return;
        }
        try {
            fis = new FileInputStream(loginSaveFile);
            ois = new ObjectInputStream(fis);
            HashMap<String, String> tmp = (HashMap<String, String>) ois.readObject();
            userInfostorage = tmp;
        } catch (Exception e) {
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (Exception e) {
            }
        }
    }
}
