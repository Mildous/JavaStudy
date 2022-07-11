package thread2;

public class Increment {
	int  num=0;
	public synchronized void incre() {num++;}
	/*synchronized(this){
	num++;
	}*/
	public int getNum() {return num;}
	
}
