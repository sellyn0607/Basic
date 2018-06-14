package step4;

public class RightTriangle {

	public static void main(String[] args) {
		int k=1;
		int[][]mtx=new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=4-i; j<5; j++) {
				
				
				mtx[i][j]=k++;
				
				//System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
			
				System.out.printf("%3d",mtx[i][j]);
	}
			System.out.println();
}
	}
}