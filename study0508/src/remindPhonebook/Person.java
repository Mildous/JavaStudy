package remindPhonebook;

public class Person {
    String name;
    String num;
    String birth;

    Person(){
        this("김봄봄", "010-0000-0000", "2000/01/01");
    }

    Person(String name, String num, String birth){
        this.name = name;
        this.num = num;
        this.birth = birth;
    }
    Person(String name, String num){
        this(name, num, null);
    }

    void showPhoneInfo(){
        if(birth!=null && !birth.equals("")) {
            System.out.println(name + " | " + num + " | " + birth);
        }else{
            System.out.println(name+" | "+num);
        }
    }
}
