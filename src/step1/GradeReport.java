package step1;
import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true){
			System.out.println("0.종료 1.실행");
			switch(sca.nextInt()){
				case 0 : return;
				case 1 : 

		System.out.println("이름?");
		String name = sca.next();
		System.out.println("국어점수?");
		int kor = sca.nextInt();
		System.out.println("영어점수?");
		int eng = sca.nextInt();
		System.out.println("수학점수?");
		int mat = sca.nextInt();
		if((kor<0 ||kor>100) || (eng<0||eng>100)||(mat<0||mat>100)){
			System.out.println("잘못 입력하신 과목이 있습니다. 다시입력하세요.");
			return ;
		}

		int avg = (kor+eng+mat)/3;
		String hak="";
		if(avg>=90){
			hak="A";
		}else if(avg>=80){
			hak="B";

		}else if(avg>=70){
			hak="C";

		}else if(avg>=60){
			hak="D";

		}else if(avg>=50){
			hak="E";

		}else{
			hak="F";
		}

	System.out.println(name+" [평균] "+avg+" [학점] "+hak); break;

				default : System.out.println("Error");




			}
		}	
}
}