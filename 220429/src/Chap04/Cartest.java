package Chap04;

public class Cartest {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe;
		
		fe.water();
		//car.water();
		car.door=2;
		System.out.println(fe.door);
		
		fe2 = (FireEngine)car;//fe2 = car; �ٿ�ĳ����
		/*
		double d = 0.0;
		int i = 10;
		
		i = (int)d;*/
		fe2 = (FireEngine)car;
		fe2.water();
	}

}