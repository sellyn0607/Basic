package step1;
import java.util.Scanner;
public class Howmuch {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true){
			System.out.println("0.종료 1.실행");
			switch(sca.nextInt()){
			case 0 : return;
			case 1 :

		System.out.println("얼마에요?");

		int a = sca.nextInt();
		System.out.println(a+" 원 입니다.");
		System.out.println("몇개드릴까요?");
		int b = sca.nextInt();
		System.out.println(b+ "개 주세요");
		int c = a*b;
		System.out.println("총 금액은 "+c+" 입니다.");
		System.out.println("비싸요 깍아주세요.");
		System.out.println("몇퍼센트 DC 해드릴까요?");
		int d = sca.nextInt();
		int f=0;
		String g;
		if(d>=10){
			g="안팔아요.";

		} else{
			
			f = c-(c*d/100);
			g=(f+" 원입니다.");
		

}
		System.out.println(g);	break;
	default : System.out.println("Error"); break; 
			}
		}
		
	}
}
