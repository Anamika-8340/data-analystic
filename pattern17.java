public class pattern17 {
    public static void print17(int  n){
        int inis=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inis;j++){
                System.out.print(" ");
            }
            for(int j=1;j<n-i;j++){
                System.out.print("*");
            }
            inis+=2;
            System.out.println();
        }
        inis=2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inis;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            inis-=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        print17(n);
    }
    
}
