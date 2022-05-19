package poketmonster_ojt;

class Mewtwo extends Poketmon{
	Mewtwo(){
		super("뮤츠","전설",1100,0);
	}
}
//불--------------------------------------------------
class Piri extends Poketmon {
	Piri(){
		super("파이리","불",0, 35);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(210, 500);
		this.power=power;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

class Sixtail extends Poketmon {
	Sixtail(){
		super("식스테일","불",0, 70);
		setPower();
	}
	
	void setPower(){
		int power=Menu.random.nextInt(80, 200);
		this.power=power;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}

class Gady extends Poketmon {
	Gady(){
		super("가디","불",0, 95);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(10, 100);
		this.power=power;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

//풀--------------------------------------------------
class Yeesanghaessi extends Poketmon {
	Yeesanghaessi(){
		super("이상해씨","풀",0, 35);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(210, 500);
		this.power=power;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

class Paras extends Poketmon {
	Paras(){
		super("파라스","풀",0, 70);
		setPower();
	}
	
	void setPower(){
		int power=Menu.random.nextInt(80, 200);
		this.power=power;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}

class Ttubuckcho extends Poketmon {
	Ttubuckcho(){
		super("뚜벅초","풀",0, 95);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(10, 100);
		this.power=power;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

//물--------------------------------------------------
class Ggobugi extends Poketmon {
	Ggobugi(){
		super("꼬부기","물",0, 35);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(210, 500);
		this.power=power;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

class Balcheangyee extends Poketmon {
	Balcheangyee(){
		super("발챙이","물",0, 70);
		setPower();
	}
	
	void setPower(){
		int power=Menu.random.nextInt(80, 200);
		this.power=power;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}

class Golapaduck extends Poketmon {
	Golapaduck(){
		super("고라파덕","물",0, 95);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(10, 100);
		this.power=power;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

//전기-------------------------------------------------
class Pikachu extends Poketmon {
	Pikachu(){
		super("피카츄","전기",0, 35);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(210, 500);
		this.power=power;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

class Coil extends Poketmon {
	Coil(){
		super("코일","전기",0, 70);
		setPower();
	}
	
	void setPower(){
		int power=Menu.random.nextInt(80, 200);
		this.power=power;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}

class Jjiririgong extends Poketmon {
	Jjiririgong(){
		super("찌리리공","전기",0, 95);
		setPower();
	}
	void setPower(){
		int power=Menu.random.nextInt(10, 100);
		this.power=power;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
//---------------------------------------------------

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
	
	@Override
	public String toString() {
		return " <<"+name+">> "+"파워: "+power+" " +"속성: "+ attribute;
	}
}