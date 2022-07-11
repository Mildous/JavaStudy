package test;

public class SimpleThreads {

	  // 현재 쓰레드 이름과 함께 메세지를 출력한다.
	  static void threadMessage(String message) {
	    String threadName = Thread.currentThread().getName();
	    System.out.format("%s: %s%n", threadName, message);
	  }

	  private static class MessageLoop implements Runnable {
	    public void run() {
	      String importantInfo[] = {
	        "Mares eat oats",
	        "Does eat oats",
	        "Little lambs eat ivy",
	        "A kid will eat ivy too"
	      };
	      try {
	        for (int i = 0; i < importantInfo.length; i++) {
	            // 4초 간 중지한다
	            Thread.sleep(4000);
	            // 메세지를 출력한다
	            threadMessage(importantInfo[i]);
	        }
	      } catch (InterruptedException e) {
	        threadMessage("I wasn't done!");
	      }
	    }
	  }

	  public static void main(String args[]) throws InterruptedException {

	    // MessageLoop 쓰레드를 인터럽트 하기 전에 밀리 초 단위로 대기한다. (기본값 : 1시간)
	    long patience = 1000 * 60 * 60;

	    // 커맨드 라인 인자가 존재하면, patience 변수를 초 단위로 설정한다.
	    if (args.length > 0) {
	      try {
	        patience = Long.parseLong(args[0]) * 1000;
	      } catch (NumberFormatException e) {
	        System.err.println("Argument must be an integer.");
	        System.exit(1);
	      }
	    }

	    threadMessage("Starting MessageLoop thread");
	    long startTime = System.currentTimeMillis();
	    Thread t = new Thread(new MessageLoop());
	    t.start();

	    threadMessage("Waiting for MessageLoop thread to finish");
	    // MessageLoop가 종료될 때까지 루프를 돈다.
	    while (t.isAlive()) {
	      threadMessage("Still waiting...");
	      // MessageLoop 쓰레드가 종료될 때 까지 최대 1초를 기다린다.
	      t.join(1000);
	      if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
	        threadMessage("Tired of waiting!");
	        t.interrupt();
	        // 더 오래 기다릴 수 없다
	        t.join();
	      }
	    }
	    threadMessage("Finally!");
	  }
	}
