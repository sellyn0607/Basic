package step3;
import javax.swing.JOptionPane;

public class ArrayTest {
	
	public static String[] getTotal(String[] scores) {
		String[] result = new String[2];
		result[0]=String.valueOf(Integer.parseInt(scores[1])+Integer.parseInt(scores[2])+Integer.parseInt(scores[3]));
		result[1]=String.valueOf(Integer.parseInt(result[0])/3);
		return result;
	}
	public static String[] getGrade(String[] scores) {
		String[] result = new String[3];
		result[0]=scores[0];
		result[1]=scores[1];
		switch(Integer.parseInt(result[1])/10) {
		case 9 : result[2]="A";break;
		case 8 : result[2]="B";break;
		case 7 : result[2]="C";break;
		case 6 : result[2]="D";break;
		case 5 : result[2]="E";break;
		default : result[2]="F";break;
		}
		return result;
	}

	public static void main(String[] args) {
		String[] arr=new String[4];
		String[] arrs = new String[4];
		String[] result2 = new String[10];
		int[] a= new int[10];
		String[] b = new String[3];
		int count=0;
	
		while(true) {
			
			
			String menu = JOptionPane.showInputDialog("0. 종료  1. 성적입력 2. 전체보기 3. 순위출력");
			
		switch(menu){
		
		case "0" : return;
		case "1" :	 
					String scores = JOptionPane.showInputDialog("이름  / 국어 / 영어 / 수학 을 입력하세요.");
					arr = scores.split("/");
					arrs = getGrade(getTotal(arr));
					
					String result=(arr[0]+"    "+arr[1]+"     "+arr[2]+"       "+arr[3]+"       "+arrs[0]+"      "+arrs[1]+"      "+arrs[2]+"\n");
					result2[count]=result;
					a[count]=Integer.parseInt(arrs[0]);
					b[count]=arr[0];
					count++;
					
			break;
		case "2" : 
			String result3="";
			for(int i=0;i<result2.length;i++) {
				result3+=result2[i];
				
			}
			JOptionPane.showMessageDialog(null,"이름  "+"국어  "+"영어  "+"수학  "+"  총점  "+"평균  "+"등급  \n"+result3);
					
			break;
		case "3" : 
			String d="";
			if (a[0]>a[1] && a[0]>a[2]) {
				if(a[1]>a[2]) {
					d=("1등: "+b[0]+"  2등: "+b[1]+"  3등: "+b[2]);
				}else {
					d=("1등: "+b[0]+"  2등: "+b[2]+"  3등: "+b[1]);
				}
				
			}else if (a[1]>a[2]) {
				if(a[0]>a[2]) {
					d=("1등: "+b[1]+"  2등: "+b[0]+"  3등: "+b[2]);
					
				}else {
					d=("1등: "+b[1]+"  2등: "+b[2]+"  3등: "+b[0]);
				}
				
					
				}else {
					if(a[0]>a[1]) {
						d=("1등: "+b[2]+"  2등: "+b[0]+"  3등: "+b[1]);
						
					}else {
						d=("1등: "+b[2]+"  2등: "+b[1]+"  3등: "+b[0]);
					}
					
				}
			JOptionPane.showMessageDialog(null,d);
				
			
			break;
			
		}
		
		
		}
	}

}
