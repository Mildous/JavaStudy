package test;

public class SimpleThreads {

	  // ���� ������ �̸��� �Բ� �޼����� ����Ѵ�.
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
	            // 4�� �� �����Ѵ�
	            Thread.sleep(4000);
	            // �޼����� ����Ѵ�
	            threadMessage(importantInfo[i]);
	        }
	      } catch (InterruptedException e) {
	        threadMessage("I wasn't done!");
	      }
	    }
	  }

	  public static void main(String args[]) throws InterruptedException {

	    // MessageLoop �����带 ���ͷ�Ʈ �ϱ� ���� �и� �� ������ ����Ѵ�. (�⺻�� : 1�ð�)
	    long patience = 1000 * 60 * 60;

	    // Ŀ�ǵ� ���� ���ڰ� �����ϸ�, patience ������ �� ������ �����Ѵ�.
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
	    // MessageLoop�� ����� ������ ������ ����.
	    while (t.isAlive()) {
	      threadMessage("Still waiting...");
	      // MessageLoop �����尡 ����� �� ���� �ִ� 1�ʸ� ��ٸ���.
	      t.join(1000);
	      if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
	        threadMessage("Tired of waiting!");
	        t.interrupt();
	        // �� ���� ��ٸ� �� ����
	        t.join();
	      }
	    }
	    threadMessage("Finally!");
	  }
	}
