package pokemonVer01;

public class GameManager {
	final int MAX_CNT=10;
	Pokemon[] inventory = new Pokemon[MAX_CNT];
	int curCnt = 0;
	
	//���� ���ϸ��� �����ϴ� ���ϸ� ����
	void inventory() {
		Pokemon[] p = new Pokemon[3];
		
		p[0] = new Pokemon("��ī��", 500);
		p[1] = new Pokemon("������", 400);
		p[2] = new Pokemon("���̸�", 450);
		
		for(int i=0; i<p.length; i++) {
			p[i].showGetMon();
		}
	}
	
	//���濡�� �˻�
	private int search(String name) {
		
		for(int i=0; i<curCnt; i++) {
			if(name.equals(inventory[i].name)) {
				return i;
			}
		}
		return -1;
	}
	
	//�ڻ翡�� ������
	void deleteData() {
		System.out.print("������ ���ϸ� ==> ");
		String name = MainMenuViewer.sc.nextLine();
		int index = -1;
		index = search(name);
		
		if(index > -1) {//������ ������ ã������
			for(int i=index; i<curCnt; i++) {
				inventory[i] = inventory[i+1];	
			}
			curCnt--;
			System.out.println("�������� �Ϸ�");
			
		}else {
			System.out.println("������������ ���ϸ��Դϴ�.");
		}
	}

}
