package poketmonster_ojt;

class Mewtwo extends Poketmon{
	Mewtwo(){
		super("����","����",1100,0);
	}
	
	@Override
	void attack() {
		System.out.println("����- �����ڼ�ũ!!!!!!!!");
	}
}

class Piri extends Poketmon {
	Piri(){
		super("���̸�","��",0,100);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(200, 501);
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

class Booster extends Poketmon {
	Booster(){
		super("�ν���","��",0,100);
		setPower();
	}
	
	void setPower(){
		int power=Menu.random.nextInt(200, 501);
		this.power=power;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}

public class Poketmon {
	String name;
	int percent;
	int power;
	String attribute;
	
	Poketmon(String name,String attribute,int power,int percent){
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