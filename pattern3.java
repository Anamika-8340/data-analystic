public class pattern3 {
    public static void print3(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){                   //pttern
                                                          //* * * * *
                                                          //* * * *
                System.out.println("*");                //* * *
            }                                             //* *
            System.out.println("");                     //* 
        }
        
    }
    public static void main(String[] args) {
        int n=5;
        print3(n);
    }
}
