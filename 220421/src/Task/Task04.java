package Task;

public class Task04 {
	
	//1���� 100������ ���� ���Ͽ� 10�� �������� �հ踦 ����ϴ� ���α׷��� do-while �ݺ����� �̿��Ͽ� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		int i=0, sum=0;
		do {
			i++;
			sum+=i;
			
			if(i%10==0)
			{
				System.out.println("1-"+i+" : "+sum);
			}
			
		}while(i<100);
						
	}
}