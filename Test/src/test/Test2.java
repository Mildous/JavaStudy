package test;

public class Test2 {

	public static void main(String[] args) {

		System.out.println("sleep 실행전");

		try 
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("sleep 실행 후");
	}
	

}