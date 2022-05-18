package poketmonster_ojt;

class Mewtwo extends PoketMon{
	Mewtwo(){
		super("孤明","傈汲",500,0);
	}
	
	@Override
	void attack() {
		System.out.println("孤明- 荤捞内碱农!!!!!!!!");
	}
}

class Piri extends PoketMon {
	Piri(){
		super("颇捞府","阂",0,100);
		setPower();
	}
	
	void setPower(){
		int power=Random.random.nextInt(200, 501);
		this.power=power;
	}
	
	@Override
	void attack() {
		System.out.println("颇捞府 - 阂采脾扁扁 !!!! ");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

class Booster extends PoketMon {
	Booster(){
		super("何胶磐","阂",0,100);
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
		return " <<"+name+">> "+"颇况: "+power+" " +"加己: "+ attribute;
	}
}
