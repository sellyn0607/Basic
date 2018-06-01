package hi;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int[] arr=new int[3];
		int sum=0;
		System.out.println("합계의시작값");
		arr[0] = sca.nextInt();
		System.out.println("합계의끝값");
		arr[1] = sca.nextInt();
		System.out.println("배수");
		arr[2] = sca.nextInt();
		
		for(int i=arr[0]; i<=arr[1]; i++) {
			if(i%arr[2]==0) {
				
				sum+=i;
			}
		}
		
		System.out.println(arr[0]+"부터"+arr[1]+"까지의 " + arr[2] + "배우의 합계 ==>"+sum);
	}

}
