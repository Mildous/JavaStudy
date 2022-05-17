package pokemon_Ver01;

public class Pokemon {
    String name;
    String type;
    int power;

    Pokemon(){
        this("이상해씨", "풀", 500);
    }
    Pokemon(String name, String type, int power) {
        this.name = name;
        this.type = type;
        this.power = power;
    }

    void showGetMon() {
        System.out.println(name+" ["+type+"] "+"(CP:"+power+")");
    }
}
