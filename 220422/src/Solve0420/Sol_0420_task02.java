package Solve0420;

public class Sol_0420_task02 {
	//100���� 1������ �� �߿��� Ȧ���� ���� ���Ͽ� ����ϴ� ���α׷��� do-while���� ����Ͽ� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		int sum=0;
		/* for��
		for(int i=1; i<=100; i=i+2) {
			sum += i;
		}
		*/
		/* while��
		int i=1;
		while(i<=100) {
			sum += i;
			i+=2;
		}
		*/
		int i=1;
		do {
			if(i%2==1) {
				sum += i;
			}
			i++;
		}while(i<=100);
		System.out.println(sum);
		
	}

}