public class PhoneBookManager {

    final int MAX_CNT = 100;
    Person[] infoStorage = new Person[MAX_CNT];

    int curCnt = 0;

    void inputData(){
        System.out.print("name is.. ");
        String name = MenuViewer.sc.nextLine();
        System.out.print("PhoneNumber.. ");
        String phoneNum = MenuViewer.sc.nextLine();
        System.out.print("Birth.. ");
        String birth = MenuViewer.sc.nextLine();

        infoStorage[curCnt++] = new Person(name, phoneNum, birth);
        System.out.println("...Complete");
    }

    void searchData(){

    }

    void editData(){

    }

    void deleteData(){

    }

    void allDisplay(){

    }

}
