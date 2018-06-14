package step4;

public class Snail {

	public static void main(String[] args) {
		
		int A[][] = new int[6][6];
        int K=1; 
        int N=5; 
        int SW=1;
        int I=0,J=0;
       
        
        do{        
            for(int P=1;P<=N;P++){            
               K=K+1;
            	 A[I][J] = K;
            	J=J+SW;
                                              
            }          
            N=N-1;
           
            if(N>0){               
                for(int P=1;P<=N;P++){             
                    K=K+1;
                	I=I+SW; 
                	A[I][J] = K;
                	
                                                   
                }              
                SW = SW*(-1);              
            }else{             
                break;
            }          
        }while(true);
       
       
        //[3] 출력
        for(int i = 0; i<5;i++){        
            for(int j =0; j< 5;j++){
                System.out.print(A[i][j]+"\t");                        
            }
            System.out.println();
        }      
    }//end main()
}//end