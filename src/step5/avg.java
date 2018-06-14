package step5;

import javax.swing.JOptionPane;

//218쪽
public class avg{

	public static void main(String[] args) {
		
		String result="";
		for(int i=0;i<=9;i++) {
			for(int j=2;j<=5;j++) {
				
				result+=j+"*"+i+"="+j*i+"       ";				
				
				
				
			}
			result+="\n";
		}
		for(int i=0;i<=9;i++) {
			for(int j=6;j<=9;j++) {
				
				result+=j+"*"+i+"="+j*i+"       ";				
				
				
			}
			result+="\n";
			}
		JOptionPane.showMessageDialog(null,result);
		

	}

}