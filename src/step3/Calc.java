package step3;
import javax.swing.JOptionPane;

public class Calc {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("숫자를 입력하세요");
		int sum=Integer.parseInt(num1);
		String result="";
		while(true){
				
				String num2 = JOptionPane.showInputDialog("연산기호를 입력하세요");
				String num3="";
		
		switch(num2){
			case "=" : JOptionPane.showMessageDialog(null,num1+result+"="+sum); return;
			case "+" : 
				num3 = JOptionPane.showInputDialog("숫자를 입력하세요");
				sum+=Integer.parseInt(num3);
				result+="+"+num3;
						 break;
			case "-" :num3 = JOptionPane.showInputDialog("숫자를 입력하세요"); 
				sum-=Integer.parseInt(num3);
				result+="-"+num3;
						 break;
			case "*" :num3 = JOptionPane.showInputDialog("숫자를 입력하세요");
					result+="*"+num3;
				sum*=Integer.parseInt(num3); break;
			case "/" :num3 = JOptionPane.showInputDialog("숫자를 입력하세요");  
					result+="/"+num3;
				sum/=Integer.parseInt(num3); break;
			case "%" :num3 = JOptionPane.showInputDialog("숫자를 입력하세요");  
					result+="%"+num3;
				sum%=Integer.parseInt(num3); break;
			
			
			default : JOptionPane.showMessageDialog(null,"연산기호를 제대로 입력해주세요");
		
				
	}
		
	
		
			
	}
		}
	}

