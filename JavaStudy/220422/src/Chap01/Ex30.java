package Chap01;

public class Ex30 {

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		
		while(true) {
			if(sum>100) {
				break;
			}
			
			sum = sum+i;
			i++;
		}
		
		System.out.println(i);
		System.out.println(sum);
	}

}
