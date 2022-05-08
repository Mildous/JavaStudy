package Phonebook01;

public class Person {
    String name;
    String phoneNum;
    String birth;

    Person(){ //기본생성자
        this("홍길동", "010-0000-0000", "1900/01/01");
    }

    Person(String name, String phoneNum, String birth){
        this.name = name;
        this.phoneNum = phoneNum;
        this.birth = birth;
    }
    Person(String name, String phoneNum){
        this(name, phoneNum, null);
    }

    void showPhoneInfo(){
        if(birth!=null && !birth.equals("")){
            System.out.println(name+" : "+phoneNum+" : "+birth);
        }else{
            System.out.println(name+" : "+phoneNum);
        }
    }
}
