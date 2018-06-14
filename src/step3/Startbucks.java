package step3;
import javax.util.Scanner;
/*
 커피주문 계산 
 */
public class Startbucks {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int sum=0;
		while(true) {
			String[] num = new String[2];
			System.out.println("무엇으로 몇잔 드릴까요?");
			System.out.print("0. 종료 1. 아메리카노(3000원) 2. 라떼(3500원) 3. 카푸치노(4000원)\n ");
			num=sca.next().split(",");
			
			switch(num[0]) {
				case "0" : System.out.println("총결제금액은"+sum+"입니다."); return; 
				case "1" : sum+=3000*(Integer.parseInt(num[1])); break;
				case "2" : sum+=3500*(Integer.parseInt(num[1])); break;
				case "3" : sum+=4000*(Integer.parseInt(num[1])); break;
				default : System.out.println("잘못입력하셨습니다 다시 입력해주세요");break;
			
			}
		
			
		}
		
	}

}
