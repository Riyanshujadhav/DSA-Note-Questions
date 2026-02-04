
import java.util.*;
public class sumOfPrimeNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  n= sc.nextInt();
        int sum=0;

        for(int i=2;i<=n-1;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
