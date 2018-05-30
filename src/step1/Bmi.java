package step1;
import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true){
		System.out.println("몸무게를 입력하세요. ");
	 	int a = sca.nextInt();
		System.out.println("키를 입력하세요 ");
		int b = sca.nextInt();

		double bmi = a/((b/100)^2);
		String check = "";
		if(bmi<18.5){
			check="저체중";

		}else if(bmi<23){
			check="정상";

		}else if(bmi<25){
			check="비만 전단계";
		}else if(bmi<30){
			check="1단계 비만";

		}else if(bmi<35){
			check="2단계 비만";

		}else{ 
			check="3단계 비만";

		}
		System.out.println("당신은 " +check + " 입니다. 종료하시려면 0을 입력해주세요");
		int c= sca.nextInt();

		switch(c){
			case 0 : return;
			default : break;
		}
}
	}

}