package Task;

public class Task02 {
	
	//100���� 1������ �� �߿��� Ȧ���� ���� ���Ͽ� ����ϴ� ���α׷��� do-while���� ����Ͽ� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		int sum = 0, i=0;
		do {
			sum = sum+(i+1);
			i++;
		} while(i<100);
		/*
		 for(i=0; i<100; i++) {
		 
			sum=sum+(i+1);
		}*/
		System.out.print("1���� 100������ Ȧ���� ���� "+sum);
		
	}

}
