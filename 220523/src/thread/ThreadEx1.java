package thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		//Runnable r = new ThreadEx1_2();
		//t2 = new Thread(r);
		Thread t2 = new Thread(new ThreadEx1_2());
		
		t1.start();
		t2.start();
		
		System.out.println("end");

	}

}
