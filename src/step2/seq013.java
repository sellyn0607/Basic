package step2;
/**
항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음)
1+2+4+7+11+16+22+...순서로 나열되는
수열의 20번째 항까지의 합계
 * */
public class seq013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=1,sum3=0;
		
		String result="";
		
		for(int i=0;i<=20;i++) {
			
				sum+=i;
					
				
				if(i==20) {
					result+=sum+"=";
				
				}else {
					result+=sum+"+";	
				}
				
				sum3+=sum;
				
			
		}
		
		System.out.println(result+sum3);
	}

}
