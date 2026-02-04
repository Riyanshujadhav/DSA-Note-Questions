import java.util.*;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        int g=0;
        while(n>0){
            int k=n%10;
            sum=sum+k*(int)Math.pow(2, g);
            n=n/10;
            g++;
        }System.out.println(sum);

    }
    
}

