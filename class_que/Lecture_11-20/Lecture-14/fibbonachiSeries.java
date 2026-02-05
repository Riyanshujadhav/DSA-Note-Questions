import java.util.*;
public class fibbonachiSeries {
    static int fibbo(int n){
        if(n==0||n==1)
        return n;
        else return fibbo(n-1)+fibbo(n-2);
    }
    

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int k=0;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(fibbo(k)+" ");
                k++;
            }System.out.println();
        }
       
    }
}
