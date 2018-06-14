package step4;

public class Triabasic {
	public static void main(String[] args) {
		int k=1,s=3,e=3;
		int[][]mtx=new int[7][4];
		for(int i=0; i<4; i++) {
			for(int j=s; j<=e; j++) {
				
				
				mtx[j][i]=k++;
				
			} s--;e++;
		}
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<4; j++) {
			
				System.out.printf("%3d",mtx[i][j]);
	}
			System.out.println();
}
	}
}
