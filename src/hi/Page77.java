package hi;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Page77 {

	public static void main(String[] args) {
		String[] a=new String[4];
		String score=JOptionPane.showInputDialog("원하는 숫자 4개를 입력하세요");
		a=score.split(",");
		int sum=Integer.parseInt(a[0])+Integer.parseInt(a[1])+Integer.parseInt(a[2])+Integer.parseInt(a[3]);
		System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"+"+a[3]+"+"+"="+sum);;
	}
}
