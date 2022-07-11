package PhoneBookClassVer01;

public class Person {
    String name; // 이름을 받을 문자타입의 name 변수를 생성한다.
    String phoneNumber; // 전화번호를 받을 문자타입의 phoneNumber 변수를 생성한다.
    String birth; // 생년월일을 받을 문자타입의 birth 변수를 생성한다.

    Person(){ // 생성자
        this("홍길동","010-0000-0000","0000/00/00"); // default일때 출력할 값을 지정한다.
    }

    Person(String name, String phoneNumber, String birth){ // 매개변수(멤버변수)가 있는 생성자
        this.name = name; // 인스턴스 자신을 가리키는 참조변수 this.
        this.phoneNumber = phoneNumber;
        this.birth = birth;
    }

    Person(String name, String phoneNumber){ // 생성자 오버로딩
        this(name, phoneNumber, null); // birth의 값을 null로 변경한다.
    }

    void showPhoneInfo(){ //저장된 정보를 보여줄 showPhoneInfo 메서드 생성
        if(birth!=null) // birth의 값이 null이 아닐때
            System.out.println(name+", "+phoneNumber+", "+birth); // 이름, 전화번호, 생년월일을 출력한다.
        else
            System.out.println(name+", "+phoneNumber); // null일경우 생일을 제외한 나머지 정보만 출력한다.
    }


}
