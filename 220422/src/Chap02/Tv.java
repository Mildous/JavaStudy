package Chap02;

public class Tv {
	//Ư¡, �Ӽ� ��> ��� ����
	String color;
	boolean power;
	int channel;
	
	//���, �׼� ��> ��� �޼ҵ�
	void power(){
		power =!power;
	} //toggle
	void channelUp() {
		channel++;
		}
	void channelDown() {
		channel--;
	}
	
	
}