package test;

<<<<<<< HEAD
public class test2 {

}
=======
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
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
