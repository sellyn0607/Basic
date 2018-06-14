package step5;

import javax.swing.JOptionPane;

public class Salary {
	enum Butt {
		EXIT, INPUT, LIST;
	}

	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,Butt.INPUT,Butt.LIST
		};
//		String sum="";
		int count=0;
		String[][] mtx=new String[6][6];
		String result="";
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(null,"MATRIX PAGE","SELECT MATRIX MENU",JOptionPane.QUESTION_MESSAGE,null,
					buttons,buttons[1]);
			switch(select) {
			case EXIT : return;
			case INPUT :
			String[] arr={"부서","서명","본봉","수당"};
			
			for(int i=0;i<1;i++) {
				count++;
				for(int c=0;c<4;c++) {
					mtx[count][c]=JOptionPane.showInputDialog(arr[c]);
					
					if(c==3) {
						mtx[count][4]=String.valueOf(Integer.parseInt(mtx[count][2])+Integer.parseInt(mtx[count][3]));
						
					}
					result+=mtx[count][c]+" / ";
				}
				result+=mtx[count][4];
				result+="\n";
				
			}
				
				
		
			break;
			case LIST :
				
				JOptionPane.showMessageDialog(null," 부서  / 성명  / 본봉 / 수당\n"+result);
				
			break;
			}
		}

	}

}
