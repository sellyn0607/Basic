package step4;

public class Triangle {
	public static void main(String[] args) {
		int f=1,i=0,j=0;
		int mtx[][]=new int[7][4];
		for( i=0;i<4;i++) {
			for(j=3;j>=3-i;j--) {
				mtx[j][i]=f++;
		}
		}
		for( i=0; i<7; i++) {
			for( j=0; j<4; j++) {
			
				System.out.printf("%3d",mtx[i][j]);
	}
			System.out.printf("\n");
}
	}
}