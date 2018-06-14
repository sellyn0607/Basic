package hi;

import javax.swing.JOptionPane;

public class Page185 {

	public static void main(String[] args) {
		String[] arr=new String[3];
		String result="";
		String score=JOptionPane.showInputDialog("수식을 한줄로 띄어쓰기로 입력하세요.");
		arr=score.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[2]);
		switch(arr[1]) {
		case"+":result+=(a+"+"+b+" = "+(a+b)); break;
		case"-":result+=(a+"-"+b+" = "+(a-b));break;
		case"*":result+=(a+"*"+b+" = "+(a*b));break;
		case"/":result+=(a+"/"+b+" = "+(a/b));break;
		case"%":result+=(a+"%"+b+" = "+(a%b));break;
		}
		
		
	
		JOptionPane.showMessageDialog(null,result);
	}
	
}
