package P_Diagram;

class Mewtwo extends Poketmon{
    Mewtwo(){
        super("����","����",1100,0);
    }
}
//��--------------------------------------------------
class Piri extends Poketmon {
    Piri(){
        super("���̸�","��",0, 35);
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
        super("�Ľ�����","��",0, 70);
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
        super("����","��",0, 95);
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

//Ǯ--------------------------------------------------
class Yeesanghaessi extends Poketmon {
    Yeesanghaessi(){
        super("�̻��ؾ�","Ǯ",0, 35);
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
        super("�Ķ�","Ǯ",0, 70);
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
        super("�ѹ���","Ǯ",0, 95);
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

//��--------------------------------------------------
class Ggobugi extends Poketmon {
    Ggobugi(){
        super("���α�","��",0, 35);
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
        super("��ì��","��",0, 70);
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
        super("����Ĵ�","��",0, 95);
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

//����-------------------------------------------------
class Pikachu extends Poketmon {
    Pikachu(){
        super("��ī��","����",0, 35);
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
        super("����","����",0, 70);
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
        super("�����","����",0, 95);
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
        return " <<"+name+">> "+"�Ŀ�: "+power+" " +"�Ӽ�: "+ attribute;
    }
}