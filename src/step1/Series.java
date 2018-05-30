package step1;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		while(true){
			System.out.println("0.종료 1. 실행");
			switch(sca.nextInt()){
					case 0: return;
					case 1: 
		
		System.out.println(" 원하는 숫자를 입력하세요.");
		int num1 = sca.nextInt();
		System.out.println(" 원하는 숫자를 입력하세요.");
		int num2 = sca.nextInt();
		int start=0, end=0, sum=0;
		String result="";

		if(num1<num2){
			start=num1;
			end=num2;


		}else {
			start=num2;
			end=num1;

		}
		for(int i=start; i<end+1; i++){
			result += i + "+";
			if(i==end){

				result += i +"=";

			}
			
			sum+=i;



		}

	System.out.println(result+sum);	break;

	default : System.out.println("Error"); break;
}
					

			}

		
	}
}