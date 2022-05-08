package PhoneBookClassVer01;

public class PhoneBookVer01 {

    public static void main(String[] args) {

        Person[] p = new Person[3]; // p라는 3개의 Person값을 저장하는 배열을 생성한다.
        p[0] = new Person(); // p[0]에 아무것도 입력하지 않음으로써, default값을 불러온다.
        p[1] = new Person("김카페", "010-1234-1234", "2000/01/01"); //p[1]에 김카페 정보 저장
        p[2] = new Person("이봄봄", "010-4567-4567"); //p[2]에 이봄봄 정보 저장

        for(int i=0; i<p.length; i++){ //배열의 길이만큼 아래의 내용을 반복한다.
            p[i].showPhoneInfo(); // p배열의 i번째 값을 showPhoneInfo 메서드를 통해 출력한다.
            // 이때 메서드의 if를 통해 생일을 입력하지 않은 이봄봄은 생일 없이 정보가 출력된다.
        }

    }
}