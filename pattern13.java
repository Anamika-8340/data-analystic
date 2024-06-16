public class pattern13 {
    public static void print13(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int n=5;
        print13(n);
    }
}
