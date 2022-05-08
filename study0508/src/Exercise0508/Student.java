package Exercise0508;

public class Student {
   String name;
   int ban;
   int num;
   int kor;
   int eng;
   int math;

   Student(){}

    Student(String name, int ban, int num, int kor, int eng, int math){
       this.name = name;
       this.ban = ban;
       this.num = num;
       this.kor = kor;
       this.eng = eng;
       this.math = math;

    }

    int getTotal(){
       return kor+eng+math;
    }
    float getAverage(){
       return (int)(getTotal()/3f * 10 + 0.5f) / 10f;
    }
}
