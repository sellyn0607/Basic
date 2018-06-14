package hi;
import java.util.Scanner;
public class Page184_1 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("첫번쨰수를 입력하세요 ");
		int a = sca.nextInt();
		System.out.println("계산할 연산자를 입력해주세요");
		String s= sca.next();
		System.out.println("두번째수를 입력하세요");
		int b=sca.nextInt();
		
		if(s.equals("+"))
			System.out.println(a+"+"+b+"="+(a+b));
		if(s.equals("-"))		
			System.out.println(a+"-"+b+"="+(a-b));
		if(s.equals("*"))		
			System.out.println(a+"*"+b+"="+(a*b));
		if(s.equals("/"))		
			System.out.println(a+"/"+b+"="+(a/b));
	}

}
