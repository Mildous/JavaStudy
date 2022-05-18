package poketmon;

public enum Type {

    RED("FPEM", 3, 1),
    BLUE("QMFFN", 1, 2),
    GREEN("CHFHR", 3, 1);

    private String type;
    private int a;
    private int b;

    Type(String type, int a, int b) {
        this.type = type;
        this.a = a;
        this.b = b;
    }

    public String getTypeName(){
        return this.type;
    }

    public int getLevel(){
        return this.a;
    }

    public int getPercent(){
        return this.b;
    }

}
