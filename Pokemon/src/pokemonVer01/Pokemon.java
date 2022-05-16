package pokemonVer01;

public class Pokemon {
	String name;
	int power;
	
	Pokemon(){
		this("ÇÇÄ«Ãò", 500);
	}
	Pokemon(String name, int power){
		this.name = name;
		this.power = power;
	}
	void showGetMon() {
		System.out.println(name+"(CP:"+power+")");
	}
}
