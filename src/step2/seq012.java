package step2;
import java.util.Scanner;
/** 
 [수열012]
1부터 10까지의 합을 구하시오
출력은 1+2+3....+10=55 입니다.
 * */
public class seq012 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true) {

			int i,sum=0,a=0,b=0,start=0,end=0, count=0, total=0;
			String result = "";
			
			System.out.println("0.종료 1.짝수 2.홀수");
			switch(sca.nextInt()){
			
			case 0 : return;
			case 1 : 
				System.out.println("원하시는숫자를 입력하세요.");
				a= sca.nextInt();
				System.out.println("원하시는숫자를 입력하세요.");
				b= sca.nextInt();
			
					if(a<b) {
						start=a;
						end=b;
					}else {
						start=b;
						end=a;
			}
					
					
					for(i=start; i<=end; i++) {
						if(i%2==0) {
							count++;
							
							
						}
						
					}
					total=count;
					count=0;
					for(i=start; i<=end; i++) {
						if(i%2==0) {
							count++;
							
							
						result+=(count==total)? i+"=" : i+"+";
							
							
							sum+=i;
				
						
					}
		}break;
		
			case 2 : 
				System.out.println("원하시는숫자를 입력하세요.");
				a= sca.nextInt();
				System.out.println("원하시는숫자를 입력하세요.");
				b= sca.nextInt();
				
				if(a<b) {
					start=a;
					end=b;
				}else {
					start=b;
					end=a;
				}
				
					for(i=start; i<=end; i++) {
						if(i%2==1) {
							result+=(count==total)? i+"=" : i+"+";
							count++;
							sum+=i;
	}
		}break;
			default : System.out.println("Error");			
}
			System.out.println(result+sum);
		}
	}
}

