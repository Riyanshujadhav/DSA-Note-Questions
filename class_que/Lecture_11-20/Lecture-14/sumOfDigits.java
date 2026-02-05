import java.util.*;
public class sumOfDigits {
    static int sum(int n){
        int sum=0;
        while (n!=0){
            int lastdig=n%10;
            sum=sum+lastdig;
            n/=10;
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println(sum);
    }
}
