package step4;

public class Diagonal {
	public static void main(String[] args) {
		int k=1,s=0,e=0;
		int[][]mtx=new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=s; j<=e; j++) {
				for(int c=s;c<=e;c++) {
					
					mtx[j][c]=k++;	
				}
				
				
				
				
			} 
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
			
				System.out.printf("%3d",mtx[i][j]);
	}
			System.out.println();
}
	}
}