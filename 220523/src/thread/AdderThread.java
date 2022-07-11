package thread;

public class AdderThread extends Thread{
	Sum sumInst;
	int start, end;
	
	public AdderThread(Sum sum, int s, int e) {
		sumInst = sum; //이름이 다르기때문에 this를 쓰지 않아도 됨
		start = s;
		end = e;
		
	}

	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			sumInst.addNum(i);
		}
	}
	

}
