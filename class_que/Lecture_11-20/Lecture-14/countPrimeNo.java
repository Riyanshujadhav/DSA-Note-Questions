
import java.util.Scanner;


public class countPrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min= Math.min(a, b);
        int max= Math.max(a, b);
        int count=0;
        boolean isprime=true;
        for(int i=Math.max(2,min);i<=max;i++){
            
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        isprime=false;
                        break;
                    }    
            }
            if(isprime){
                // System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
