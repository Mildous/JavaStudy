package thread;

public class ThreadEx1_1 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println(getName());
		}
	}

}
