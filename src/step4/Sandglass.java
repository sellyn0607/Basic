package step4;

public class Sandglass {

	public static void main(String[] args) {
		int f=1,i=0,j=0;
		int mtx[][]=new int[5][5];
		for( i=0;i<3;i++) {
			for(j=0+i;j<5-i;j++) {
				mtx[i][j]=f++;
			
		}
		}
			for( i=3;i<5;i++) {
				for( j=4-i;j<=i;j++) {
					mtx[i][j]=f++;
				}
			}
				
			
		
		for( i=0; i<5; i++) {
			for( j=0; j<5; j++) {
			
				System.out.printf("%3d",mtx[i][j]);
	}
			System.out.printf("\n");
}
	}
}