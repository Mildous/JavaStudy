package poketmonster_ojt;

class Mewtwo extends PoketMon{
	Mewtwo(){
		super("����","����",500,0);
	}
	
	@Override
	void attack() {
		System.out.println("����- �����ڼ�ũ!!!!!!!!");
	}
}

class Piri extends PoketMon {
	Piri(){
		super("���̸�","��",0,100);
		setPower();
	}
	
	void setPower(){
		int power=Random.random.nextInt(200, 501);
		this.power=power;
	}
	
	@Override
	void attack() {
		System.out.println("���̸� - �Ҳ�Ƣ��� !!!! ");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

class Booster extends PoketMon {
	Booster(){
		super("�ν���","��",0,100);
		setPower();
	}
	
	void setPower(){
		int power=Random.random.nextInt(200, 501);
		this.power=power;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}

public class PoketMon {
	String name;
	int percent;
	int power;
	String attribute;
	
	PoketMon(String name,String attribute,int power,int percent){
		this.name=name;
		this.attribute=attribute;
		this.percent = percent;
		this.power= power;
	}
	
	void attack() {
		
	}
	
	@Override
	public String toString() {
		return " <<"+name+">> "+"�Ŀ�: "+power+" " +"�Ӽ�: "+ attribute;
	}
}
