package Task;

public class Task02 {
	
	//100부터 1까지의 수 중에서 홀수의 합을 구하여 출력하는 프로그램을 do-while문을 사용하여 작성하시오.

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
		System.out.print("1부터 100까지의 홀수의 합은 "+sum);
		
	}

}
