package hi;

import javax.swing.JOptionPane;

//218쪽
public class avg2{

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				
				JOptionPane.showMessageDialog(null,j+"X"+i+"="+j*i+" ");
				//System.out.print(j+"X"+i+"="+j*i+" ");
				
			}
			System.out.println("");
		}
		
		

	}

}
