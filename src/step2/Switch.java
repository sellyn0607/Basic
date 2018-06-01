package step2;
/**
 [수열011] 1-2+3-4+5-6......-100=-50 합계
 * */
public class Switch {

	public static void main(String[] args) {
		
		int odd=0,even=0,sum=0;
		String result="";
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				if(i==100) {
				result+=i+"=";
				
				
				
			}else {
				result+=i+"+";
			
			}
			odd+=i;
			
			
		}else if(i%2==1){
			if(i==100)
			{
				result+=i+"=";
				}else {
					result+=i+"-";
				}
			even+=i;
			}
			
			
		}
		sum=even-odd;
		System.out.println(result+sum);
	}

}
