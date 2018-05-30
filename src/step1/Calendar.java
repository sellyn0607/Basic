package step1;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true){
			System.out.println("0.종료 1.실행");
			switch(sca.nextInt()){
			case 0 : return;
			case 1 :
		System.out.println("원하시는 월을 입력하세요.");
		int a = sca.nextInt();
		int b = 0;
		String c = "";
		switch(a){
			case 1 :case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : b=31; break;
			case 2 : b=28; break;
			case 4 : case 6 : case 11 :  b=30; break;
			
			default : c ="1부터12까지의 숫자를 입력해주세요.";
			break;

		}
		if(!c.equals("1부터12까지의 숫자를 입력해주세요.")){
			c=(a+"월 "+b+"일 입니다.");
		}

		System.out.println(c); break;
			default : System.out.println("Error"); break; 
			}
			}

}
}