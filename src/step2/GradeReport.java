package step2;

import java.util.Scanner;

public class GradeReport {
	public static int[] input(Scanner sca) {
		int[] result = new int[3];
		int kor = 0, eng = 0, mat = 0;
		System.out.println("국어점수?");
		kor = sca.nextInt();
		System.out.println("영어점수?");
		eng = sca.nextInt();
		System.out.println("수학점수?");
		mat = sca.nextInt();

		result[0] = kor;
		result[1] = eng;
		result[2] = mat;
		return result;

	}
	public static int[] avg2(int[] arry) {
		int[] result = new int[2];
		int sum=0,avg=0;
		
		sum=arry[0]+arry[1]+arry[2];
		
		avg=sum/3;
		
		result[0]=sum;
		result[1]=avg;
		
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while (true) {
			System.out.println("0.종료 1.실행");
			switch (sca.nextInt()) {
			case 0:
				return;
			case 1:

				System.out.println("이름?");
				String name = sca.next();
				int kor = 0, eng = 0, mat = 0, avg = 0, sum = 0;
				
				int[] arry = input(sca);
				
				if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (mat < 0 || mat > 100)) {
					System.out.println("잘못 입력하신 과목이 있습니다. 다시입력하세요.");
					return;
				}
				/*sum = kor + eng + mat;
				avg = sum / 3;*/
				int[] arry2 = avg2(arry);
				sum= arry2[0];
				avg=arry2[1];
				String hak = "";
				if (avg >= 90) {
					hak = "A";
				} else if (avg >= 80) {
					hak = "B";

				} else if (avg >= 70) {
					hak = "C";

				} else if (avg >= 60) {
					hak = "D";

				} else if (avg >= 50) {
					hak = "E";

				} else {
					hak = "F";
				}
				System.out.printf("*********************************************\n");
				System.out.printf("|  이름   |  총점   |  평균  |  등급   |");
				System.out.printf("|  %s   |  %d   |  %d  |  %s   |\n",name,sum,avg,hak);
				System.out.println("*********************************************");
				break;
			default:
				System.out.println("Error");

			}
		}
	}
}