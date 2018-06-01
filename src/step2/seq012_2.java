package step2;
import java.util.Scanner;
/** 
 * [수열012]메소드분할

 * */
public class seq012_2 {
	
	public static int[] input(Scanner sca) {
		int[] result = new int[2];
		int sum=0,a=0,b=0,start=0,end=0, count=0, total=0;
		
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
		result[0]= start;
		result[1]= end;
		return result;
			
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while(true) {
			
			
			System.out.println("0.종료 1.짝수 2.홀수");
			switch(sca.nextInt()){
			
			case 0 : return;
			case 1 : 
				
					
				
					int start=0,end=0,count=0,total=0,sum=0;
					int[] arr = input(sca);
					start=arr[0];
					end=arr[1];	
					String result="";
					
					for(int i=start; i<=end; i++) {
						if(i%2==0) {
							count++;
							
						}
						
					}
					total=count;
					count=0;
					for(int i=start; i<=end; i++) {
						if(i%2==0) {
							count++;
							
							
						result+=(count==total)? i+"=" : i+"+";
							
							
							sum+=i;
				
							
					}
						
		}System.out.println(result+sum);
		break;
		
			case 2 : 
				
				
				start=0;end=0;count=0;total=0;sum=0;
				int[] arr2 = input(sca);
				start=arr2[0];
				end=arr2[1];;
				
				result="";
				for(int i=start; i<=end; i++) {
					if(i%2==0) {
						count++;
						
					}
					
				}
				total=count;
				count=0;
					for(int i=start; i<=end; i++) {
						if(i%2==1) {
							count++;
							result+=(count==total)? i+"=" : i+"+";
							sum+=i;
	}
						
		}System.out.println(result+sum);break;
			default : System.out.println("Error");			
}
		
		
		}
	}
}

