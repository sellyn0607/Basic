package step2;

/**
 기사시험문제: [수열010] 1+2+3+.....+100
 변형된 요구사항:
 정수를 입력받아 두 수 사이의 합을 구하는 
 프로그램을 구현하시오
 출력 : 1+2+3+...+10=55
 * */
import java.util.Scanner;

public class seq010 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		while (true) {
			System.out.println("0.종료 1.시작");
			switch (sca.nextInt()) {

			case 0:
				return;
			case 1:
				int start = 0, end = 0, sum = 0;
				String result = "";
				System.out.println("원하는 숫자를 입력하세요.");
				int a = sca.nextInt();
				System.out.println("원하는 숫자를 입력하세요.");
				int b = sca.nextInt();

				if (a < b) {
					start = a;
					end = b;
				} else {
					start = b;
					end = a;
				}
				for (int i = start; i < end + 1; i++) {
					/*if (i == end) {
						result += i + "=";

					} else {
						result += i + "+";

					}*/
					result +=(i == end)?i + "=": i + "+";
					sum += i;

				}
				System.out.println(result + sum);
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
	}
}
