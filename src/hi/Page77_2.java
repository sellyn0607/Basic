package hi;
import java.util.Scanner;
public class Page77_2 {

	public static void main(String[] args) {
		String result ="";
		Scanner sca = new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요");
		int a = sca.nextInt();
		System.out.println("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈");
		int b =sca.nextInt();
		System.out.println("두번째 계산할 값을 입력하세요");
		int c = sca.nextInt();
		switch(b) {
		case 1:
			result+=a+"+"+c+"="+(a+c); break;
		case 2:
			result+=a+"-"+c+"="+(a-c); break;
		case 3:
			result+=a+"*"+c+"="+(a*c); break;
		case 4:
			result+=a+"/"+c+"="+(a/c); break;
		
		}
		
		System.out.println(result);

	}

}
