package step4;

import javax.swing.JOptionPane;
enum Butt{
	EXIT, LeftTriangle,RightTriangle,Diamond,Sandglass,Zigzag, Traingle;
}
public class Matrix {
	public static String LeftTriangle() {
		String result="";
		int k=0;
		int[][] mtx=new int[5][5];
		for(int i=0; i<5;i++) {
			for(int j=0; j<=i;j++) {
				k++;
				mtx[i][j]=k;
			}	
		}
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					
					result+=mtx[i][j];							
				}
					result+="\n";
			}
			return result;
	}
	public static String RightTriangle() {
		String result="";
		int k=1;
		int[][] mtx=new int[5][5];
			for(int i=0; i<5; i++) {
				for(int j=4-i; j<5; j++) {
					mtx[i][j]=k++;
				}
				System.out.println();
			}
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
				result+=mtx[i][j];
				}
				result+="\n";
			}
			return result;
	}
	public static String Diamond() {
		String result="";
		int k=1;int s=3,e=1;
		int[][] mtx=new int[5][5];
			for(int i=0; i<5; i++) {
				if(i<3) {
					s--;e++;
				}else {
					s++;e--;
				}
				for(int j=s; j<=e; j++) {
					mtx[i][j]=k++;
				}
			}
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					result+=mtx[i][j];
				}
					result+="\n";			
					}
			return result;
	}
	public static String Sandglass() {
		String result="";
		int k=1,s=0,e=4;
		int[][]mtx=new int[5][5];
		for(int i=0; i<5; i++) {
			if(i<3) {
			for(int j=s; j<=e; j++) {
				mtx[i][j]=k++;
				
			}e--; s++; 
			}else {
				s=s-2;e=e+2;
				for(int j=s; j<=e; j++) {
					mtx[i][j]=k++;
				}s++;e--;
				}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				result+=mtx[i][j];
	}
			result+="\n";
}
			return result;
	}
	public static String Zigzag() {
		String result="";
		int k=1,num=5,j=0;
		int[][]mtx=new int[5][5];
		for(int i=0; i<5; i++) {
			if(i%2==0) {
			for(j=0; j<num; j++)   
				mtx[i][j]=k++;
			}else {
			for(j=num-1;j>=0;j--)  
				mtx[i][j]=k++;
			}
		}
		for(int i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				result+=mtx[i][j];
	}
			result+="\n";
}
		return result;
	}
	public static String Traingle() {
		String result="";
		int f=1,i=0,j=0;
		int mtx[][]=new int[7][4];
		for( i=0;i<4;i++) {
			for(j=3;j>=3-i;j--) {
				mtx[j][i]=f++;
		}
		}
		for( i=0; i<7; i++) {
			for( j=0; j<4; j++) {
			
				result+=mtx[i][j];
	}
			result+="\n";
}
		return result;
	} 
public static void main(String[] agrs){
	String result="";
	Butt[] buttons = {
			Butt.EXIT,Butt.LeftTriangle,Butt.RightTriangle,Butt.Diamond,Butt.Sandglass,Butt.Zigzag, Butt.Traingle };
	while(true) {
		Butt select = (Butt)JOptionPane.showInputDialog(null,"MATRIX PAGE","SELECT MATRIX MENU",JOptionPane.QUESTION_MESSAGE,null,
						buttons,buttons[1]);
		
	switch(select) {
	case EXIT:return;
	case LeftTriangle: JOptionPane.showMessageDialog(null,LeftTriangle());break;
	case RightTriangle: JOptionPane.showMessageDialog(null,RightTriangle());break;
	case Diamond: JOptionPane.showMessageDialog(null,Diamond());break;
	case Sandglass: JOptionPane.showMessageDialog(null,Sandglass());break;
	case Zigzag: JOptionPane.showMessageDialog(null,Zigzag()); break;
	case Traingle: JOptionPane.showMessageDialog(null,Traingle());break;
	default : break;
	}
	
	
	}
}
}
