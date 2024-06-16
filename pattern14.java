public class pattern14 {
    public static void print14(int n){
        for(int i=0;i<n;i++){
            
            
            for(int j=0;j<=i;j++){
                System.out.print((char)((int)('A'+i))+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        print14(n);
    }
}
