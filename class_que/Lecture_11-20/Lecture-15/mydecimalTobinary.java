
import java.util.Scanner;

public class mydecimalTobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dn=0;
        int k=0;
        while(n!=0){
            int rem=n%10;
            dn+=rem*(int)Math.pow(2, k);
            k++;
            n/=10;
        }
        System.out.println(dn);
    }
}
