package step4;

public class Sandbasic {

	public static void main(String[] args) {
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
			
				System.out.printf("%3d",mtx[i][j]);
	}
			System.out.println();
}
	}
}
