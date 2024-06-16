 import java.util.*;

  public class pattern{
    public  static void nprint(int n){
        
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){                              //pattern
System.out.print(j );                                   //1
                                                          
    }                                                   //1 2                                         
System.out.println("");                               //1 2 3                                 
}
    }

 
public static void main(String[] args) {
    int n=3;
    //Scanner sc=new Scanner(System.in);
      //a=sc.nextInt();
      nprint(n);
}
 }
