package step1;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true){
			System.out.println("0.종료 1.실행");
			switch(sca.nextInt()){
			case 0 : return;
			case 1 :
		System.out.println("첫번째 숫자를 입력하세요.");
		int a = sca.nextInt();

		System.out.println("연산기호를 입력하세요.");
		String opc = sca.next();
		

		System.out.println("두번째 숫자를 입력하세요.");
		int b = sca.nextInt();
		int c = 0;
		String d="";

		
		switch(opc){
			case "+" : c=a+b; break;
			case "-" : c=a-b; break;
			case "*" : c=a*b; break;
			case "/" : c=a/b; break;
			case "%" : c=a%b; break;
			default : d="연산기호 제대로 입력해주세요";  break;
		
	}
	if(!d.equals("연산기호 제대로 입력해주세요")){

		d=("정답은 "+c+" 입니다") ;


	}
	
	 	System.out.println(d); break;
			default : System.out.println("Error"); break; 
	}
		}
	}

}