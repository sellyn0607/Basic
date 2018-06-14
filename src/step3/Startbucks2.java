package step3;
import javax.swing.JOptionPane;
/*
 커피주문 계산 
 */
public class Startbucks2 {

	public static void main(String[] args) {
		
		int sum=0;
		String result="";
		while(true) {
			
			String option = JOptionPane.showInputDialog("0. 주문완료 1. 아메리카노(3000원) 2. 라떼(3500원) 3. 카푸치노(4000원)" );
			
			switch(option) {
			
				case "0" : JOptionPane.showMessageDialog(null,result+"총결제금액은 "+sum+" 원 입니다."); return;
				case "1" : String cnt= JOptionPane.showInputDialog(null,"몇잔 주문하시겠습니까?");
							result+= ("아메키라노" +cnt+"잔\n");
							sum+=3000*(Integer.parseInt(cnt)); break;
				case "2" : cnt= JOptionPane.showInputDialog(null,"몇잔 주문하시겠습니까?");
							result+= ("라떼" +cnt+"잔\n");
							sum+=3500*(Integer.parseInt(cnt)); break;
				case "3" : cnt= JOptionPane.showInputDialog(null,"몇잔 주문하시겠습니까?");
							result+= ("카푸치노" +cnt+"잔\n");
							sum+=4000*(Integer.parseInt(cnt)); break;
				default : JOptionPane.showMessageDialog(null,"잘못입력하셨습니다. 다시입력해주세요."); break;
			
			}
		
			
		}
		
	}

}
