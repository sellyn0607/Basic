package step1;
import java.util.Scanner;

public class CheckGender {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true){
			System.out.println("0.종료 1.실행");
			switch(sca.nextInt()){
			case 0 : return;
			case 1 :
		System.out.println("이름을 입력하세요.");
		String name = sca.next();
		System.out.println("주민번호를 입력하세요.");
		String Jumin = sca.next();

		char ch = Jumin.charAt(7);
		String sex="";
		String a="";

		switch(ch){
			case '1' : case '3' : sex="남"; break;
			case '2' : case '4' : sex="여"; break;
			case '5' : case '6' : sex="외국인"; break;
			default : a="다시입력하세요"; break;
		}
		if(!a.equals("다시입력하세요")){

			a=(name+" : "+Jumin + " : " + sex);	
	}
		System.out.println(a);break;
			default : System.out.println("Error"); break; 
	
	}
	}
	}

}