public class pattern6 {
    public static void print6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.err.println("");
        } 
    }
    public static void main(String[] args) {
        int n=5;
        print6(n);
    }
    
}
