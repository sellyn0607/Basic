package step1;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true){
			System.out.println("0.종료 1.실행");
			switch(sca.nextInt()){
			case 0 : return;
			case 1 :
		System.out.println("가위바위보를 시작합니다. R= 바위,S=가위,P=보");
		System.out.println("A 먼저 내주세요 ");
		String a = sca.next();
		System.out.println("B 내주세요 ");
		String b = sca.next();

		String result = "";
		if((a.equals("R") && b.equals("R"))||(a.equals("S") && b.equals("S"))||(a.equals("P") && b.equals("P"))){
			result = "비김";
		}else if((a.equals("R") && b.equals("S"))||(a.equals("S") && b.equals("P"))||(a.equals("P") && b.equals("R"))){
			result = "A승";
		}else if((a.equals("R") && b.equals("P"))||(a.equals("S") && b.equals("R"))||(a.equals("P") && b.equals("S"))){
			result = "B승";
		}
		else{
			result = "무효";
		}
		System.out.println("결과는 "+result); break;
			default : System.out.println("Error"); break; 
			}
		}




	
}

}