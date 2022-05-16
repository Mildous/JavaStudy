public class Person {
    String name;
    String phoneNum;
    String birth;

    Person(){}

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
            System.out.println(name+", "+phoneNum+", "+birth);
        }else{
            System.out.println(name+", "+phoneNum);
        }
    }

}