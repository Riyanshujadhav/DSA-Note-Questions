import java.util.Scanner;

public class allPrimeNo1_50 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=2;i<=n;i++){
        boolean isprime=true;
           for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
           }
           if(isprime){
               System.out.print(i+" ");
           }
        }
    }
}
