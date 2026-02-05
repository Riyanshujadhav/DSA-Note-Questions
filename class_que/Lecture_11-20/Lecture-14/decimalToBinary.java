import java.util.*;
public class decimalToBinary {
    static int rev(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int bn=1;               //0
        while(n>0){            //n!=0
            int rem =n%2;
            bn=bn*10+rem;
            n/=2;
        }
        
        System.out.println(rev(bn)/10);
        
    }
}
