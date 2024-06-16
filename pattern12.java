public class pattern12{
    public static void print12(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        print12(n);
    }
}
