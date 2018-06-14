package hi;
import javax.swing.JOptionPane;
public class Page254_1 {
	public static void main(String[] args) {
		int sum=0;
		String[] arr= new String[3];
		
		String score= JOptionPane.showInputDialog("시작값/끝값/배수를 입력하세요");
		arr=score.split("/");
		
		for(int i =Integer.parseInt(arr[0]); i<=Integer.parseInt(arr[1]); i++) {
			if(i%Integer.parseInt(arr[2])==0) {
				sum+=i;
			}
		}
		JOptionPane.showMessageDialog(null, sum);
	}
	
}
