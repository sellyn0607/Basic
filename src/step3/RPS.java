package step3;
import javax.swing.JOptionPane;


public class RPS {

	public static void main(String[] args) {
		int win=0,lose=0,draw=0,count=0;
		while(true){
			//System.out.println("0.종료 1.실행");
		int rsp = Integer.parseInt(JOptionPane.showInputDialog(" 가위바위보를 시작합니다. 가위=1,바위=2,보=3,대전결과=6")),
				rsp2 = (int) (Math.random()*3)+1;
		if (rsp==4) {
			return;
		}
				//rsp2 = Integer.parseInt(JOptionPane.showInputDialog("가위바위보를 시작합니다. 가위=1,바위=2,보=3"));
		String[] rsp21= {"가위","바위","보"};
		int flag = rsp-rsp2;  
			switch(flag){
			case 0 : JOptionPane.showMessageDialog(null,"당신은 "+rsp21[rsp-1]+" 컴퓨터는 "+rsp21[rsp2-1]+" 비겼습니다"); draw++;count++; break;
			case 2 : case -1 : JOptionPane.showMessageDialog(null,"당신은 "+rsp21[rsp-1]+" 컴퓨터는 "+rsp21[rsp2-1]+" 당신이 졌습니다."); lose++;count++; break;
			case 1 : case-2 : JOptionPane.showMessageDialog(null,"당신은 "+rsp21[rsp-1]+" 컴퓨터는 "+rsp21[rsp2-1]+" 이겼습니다."); win++;count++; break;
			default : JOptionPane.showMessageDialog(null,count+"전"+win+"승"+lose+"패"+draw+"무");return;
			
		
			}
			
		}

	

	
}

}