package step4;

public class Zigzag {

	public static void main(String[] args) {
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
				System.out.printf("%3d",mtx[i][j]);
	}
			System.out.println();
}
	}
}