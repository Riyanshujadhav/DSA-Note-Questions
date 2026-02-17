import java.util.Scanner;

public class _11_que {
     public static int revers(int n){
        int digit=0;
        while (n!=0) {
            int temp=n%10;
            digit=digit*10+temp;
            n/=10;
        }
        return digit;
    }
    public static int count (int n){
        int count=0;
        while (n!=0) {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=1;
        int l=count(n);
        while(n!=0){
            int k=n%10;
            int inv=9-k;
            if(l==1 && k==9){
                rev=rev*10+k;
                l--;
            }
            if(inv<k){
                rev=rev*10+inv;
                l--;
            }else{
                rev=rev*10+k;
                l--;
            }
            n/=10;
        }
        System.out.println(revers(rev)/10);

    }
}
