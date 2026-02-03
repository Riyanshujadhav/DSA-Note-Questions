
import java.util.*;
public class coPrime_Gcd {
    
    public static int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int result = gcd(a, b);
        System.out.println("Common Factor :"+result);
        if(result==1)
            System.out.println("The No is Co-Prime");
        else
        System.out.println("The No is Not Co-Prime");
    }
    
}
