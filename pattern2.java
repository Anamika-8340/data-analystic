public class pattern2 {
    public static void print2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){                          //print pattern
System.out.print(i );                                               //1
 }                                                                  //22
            System.out.println("");                                //333
        }                                                             //4444
    }
    public static void main(String[] args) {
        int n=4;
        print2(n);
    }
}
