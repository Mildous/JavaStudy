package thread4;

public class NewsPaper {
	String todayNews;
	boolean isTodayNews = false;

	public String getTodayNews() {
		if(isTodayNews==false) {
			try{
				synchronized (this) {
				wait();
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		return todayNews;
	}

	public void setTodayNews(String todayNews) {
		this.todayNews = todayNews;
		isTodayNews = true;
		
		synchronized (this) {
			notifyAll();	
		}
		
	}

}
