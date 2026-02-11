
import java.util.Scanner;

public class bostan_No {

    static int digitsum(int n)
    {   int sum=0;
        while(n!=0){
            int t=n%10;
            sum=sum+t;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digiSum=digitsum(n);
        System.out.println(digiSum);
        
    }
}
