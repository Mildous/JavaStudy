package Task;

public class Task04 {
	
	//1부터 100까지의 합을 구하여 10을 기준으로 합계를 출력하는 프로그램을 do-while 반복문을 이용하여 작성하시오.

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
