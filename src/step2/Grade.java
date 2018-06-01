package step2;

import java.util.Scanner;

public class Grade{
	public static int[] input() {
		int[] arr = new int[3];
		
		int kor = 0, eng = 0, math = 0;
		
		
		arr[0] = kor ;
		arr[1] = eng ;
		arr[2] = math ;
		
		return arr ;
	}
	public static String[] getTotal(String[] params) {
		String[] result = new String[10];
		result[0] = String.valueOf(params[1] + params[2] + params[3]);
		result[1] = String.valueOf(Integer.parseInt(result[0])/3);
		return result;
		
		
	}
	public static String[] getGrade(String params[]){
		String[] result=new String[3];
		result[0]=params[1];
		
	    switch(Integer.parseInt(params[1])/10){
            case 9: result[2]="A"; break;
            case 8: result[2]="B"; break;
            case 7: result[2]="C"; break;
            case 6: result[2]="D"; break;
            case 5: result[2]="E"; break;
            default : result[2]="F"; break;
        }
	    return result;
	}
	public static void main(String[] args) {
		String[] params = new String[10];
		String name = "";
		String grade="";
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		params[0] = scan.next();
		System.out.println("국어 점수를 입력하세요");
		params[1] = scan.next();
		System.out.println("영어 점수를 입력하세요");
		params[2] = scan.next();
		System.out.println("수학 점수를 입력하세요");
		params[3] = scan.next();
		String[] arr =getTotal(params);
 		String[] arr2 = getGrade(arr);
		System.out.printf("************************************\n");
		System.out.printf("| 이름  |  총점     |  평균    | 등급  |\n");
		System.out.printf("-------------------------------------");
		System.out.printf("| %s | %s | %s | %s |\n",
				name,arr[0],arr[1],arr[2]);
		System.out.print("************************************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}