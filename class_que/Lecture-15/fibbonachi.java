
import java.util.*;
public class fibbonachi {
    public static int fibbo(int g){
            if(g==0||g==1){
                return g;
            }else{
            return fibbo(g-1)+fibbo(g-2);
            }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k=0;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fibbo(k)+"  ");
                k++;
            }System.out.println();
        }
    }
}
