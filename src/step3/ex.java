package step3;
import javax.swing.JOptionPane;
public class ex {

	public static void main(String[] args) {
		
		while(true) {
		int[] value=new int[25];
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		if(name.equals("QUIT")||name.equals("quit")||name.equals("종료")) {
			return;
		}else {
		int money = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요."));
		if (money/50000!=0) {
			 value[0]= money/50000;
			 value[1]= money%50000;
			 if (value[1]/10000!=0) {
				 value[2]=value[1]/10000;
				 value[3]=value[1]%10000;
				 if(value[3]/5000!=0) {
					 value[4]=value[3]/5000;
					 value[5]=value[3]%5000;
					 
				 }
				 if(value[5]/1000!=0) {
					 value[6]=value[5]/1000;
					 value[7]=value[5]%1000;
				 }
				 if(value[7]/500!=0) {
					 value[8]=value[7]/500;
					 value[9]=value[7]%500;
					 
				 }if(value[9]/100!=0) {
					 value[10]=value[9]/100;
					 value[11]=value[9]%100;
					 
				 }
				 if(value[11]/50!=0) {
					 value[12]=value[11]/50;
					 value[13]=value[11]%50;
					 
				 }
				 if(value[13]/10!=0) {
					 value[14]=value[13]/10;
					 value[15]=value[13]%10;
					 
				 }if(value[15]/5!=0) {
					 value[16]=value[15]/5;
					 value[17]=value[15]%5;
					 
				 
			 }
			 
		}
		JOptionPane.showMessageDialog(null,"성명  출장비  지급액  오만  일만  오천   일천  오백   백   오십   십    오    일\n"+
		String.valueOf(name+"          "+money+"             "+value[0]+"         "+value[2]+"        "+value[4]+"         "+value[6]
		+"         "+value[8]+"      "+value[10]+"        "+value[12]+"        "+value[14]+"      "+value[16]+"     "+value[17]
		));
	
		}
	}
}
	}
}
