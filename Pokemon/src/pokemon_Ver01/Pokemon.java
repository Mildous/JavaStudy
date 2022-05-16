package pokemon_Ver01;

public class Pokemon {
    String name;
    int power;

    Pokemon(){
        this("피카츄", 500);
    }
    Pokemon(String name, int power){
        this.name = name;
        this.power = power;
    }
    void showGetMon() {
        System.out.println(name+"(CP:"+power+")");
    }
}
