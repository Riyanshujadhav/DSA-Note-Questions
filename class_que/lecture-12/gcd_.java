import java.math.BigInteger;
import java.util.Scanner;
public class gcd_ {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int i=1;
        int gcd=1;
        while(i<Math.min(a, b)){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
            i++;
        }
        System.out.println(gcd);  
        
        // in java we have BigInteger rather than--> __gcd(a,b); like in c++
        
        BigInteger c = BigInteger.valueOf(123321);
        BigInteger d = BigInteger.valueOf(88);
        System.out.println(c.gcd(d));

   } 
}
