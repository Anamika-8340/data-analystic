public class pattern7 {
    public static void print5(int n){
for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
        
        System.out.println("");
}
    }
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
    
    System.out.println(" ");
        }
}

public static void main(String[] args) {
    int n=5;
    print5(n);
    print6(n);
}
}
