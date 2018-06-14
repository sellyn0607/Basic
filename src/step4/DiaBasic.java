package step4;

public class DiaBasic {

	public static void main(String[] args) {
		int k=1,s=3,e=1;
		int[][]mtx=new int[5][5];
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
			
				System.out.printf("%3d",mtx[i][j]);
	}
			System.out.println();
}
	}
}
