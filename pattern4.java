public class pattern4 {
    public static void print4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){                   
                                            
                                                    
                System.out.print(j+"");                
            }                                             
            System.out.println("");                  
        }
        
    }
    public static void main(String[] args) {
        int n=5;
        print4(n);
    }
}                                                  //pattern
                                                        //1 2 3 4 5
                                                        //1 2 3 4 
                                                        //1 2 3 
                                                        //1 2
                                                        //1

