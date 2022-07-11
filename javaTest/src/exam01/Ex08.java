package exam01;

public class Ex08 {

	public static void main(String[] args) {
//		배열 : 동일타입만 들어간다. / 만들때 크기가 정해진다.
//			   반복문 / 인덱스 - 0부터
		
		int[] nums1 = {6, 8, 3, 4, 7};
		
		int[] nums2 = new int[5];
		
		System.out.println(nums1);
		System.out.println(nums2);
		
		System.out.println("-> " + nums1[0]);
		System.out.println("-> " + nums1[1]);
		System.out.println("-> " + nums1[2]);
		System.out.println("-> " + nums1[3]);
		System.out.println("-> " + nums1[4]);
		
		System.out.println("배열의 길이 : " + nums1.length);
		System.out.println("-> " + nums1[nums1.length -1]);
		
		for(int i=0; i<nums1.length; i++) {	// i - index로 사용
			nums1[i] += 100;
			System.out.println("-> " + nums1[i]);
		}
//		길이가 7인 숫자형 배열 numberArray 를 선언만 하시오.
		
		int[] numberArray = new int[7];
		numberArray[0] = 10;
		numberArray[1] = 11;
		numberArray[2] = 12;
		numberArray[3] = 13;
		numberArray[4] = 14;
		numberArray[5] = 15;
		numberArray[6] = 16;
		
		for(int i=0; i<numberArray.length; i++)
		System.out.println(i + "번째 : " + numberArray[i]);
		
		
	}

}
