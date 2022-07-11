package Review;

import java.util.Scanner;

public class ReviewTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너 생성.


        Review[] r = new Review[2]; // 2개의 값을 저장할 수 있는 리뷰라는 배열을 생성하고, 값은 2로 정한다.
        for (int i = 0; i < r.length; i++) { //i라는 변수를 만들고 값은 0으로 대입한다. i를 1씩 늘려가며 배열 r의 길이만큼 반복문안의 내용을 반복한다.
            System.out.print("이름을 입력하세요.");
            String nickname = sc.nextLine(); //이름을 입력받는다.
            System.out.print("리뷰를 입력하세요.");
            String message = sc.nextLine(); //리뷰 내용을 입력받는다.

            r[i] = new Review(); // 생성된 r배열의 i번째에 저장공간을 만든다.
            r[i].nickname = nickname; //r배열의 i번째에 입력받은 nickname값을 저장한다.
            r[i].message = message; //r배열의 i번째에 입력받은 message를 저장한다.
        }
        for (Review review : r) { //r에 저장된 review 내용 전체를 출력한다.
            System.out.println(review.nickname + " || " + review.message); //review값에 저장된 nickname과 message를 출력한다.
        }
    }

}
