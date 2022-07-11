package thread4;

public class NewsWriter extends Thread {
	NewsPaper paper;
	
	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}

	@Override
	public void run() {
		paper.setTodayNews("오늘도 자바를 열심히 합시다!");
	}
	

}
